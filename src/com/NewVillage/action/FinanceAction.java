package com.NewVillage.action;

import java.sql.Timestamp;
import java.util.*;

import com.NewVillage.dao.*;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

/**
 * Created by 珏 on 2016/6/2.
 *
 * 5.财务 1.9确定费用 1.10业务收费
 */
public class FinanceAction extends ActionSupport implements SessionAware{
    private Map session;
    private NewVillageDao newVillageDao;
    private UserDao userDao;
    private EmployeeDao employeeDao;
    private ReceiptDao receiptdao;
    private CostDao costdao;
    private ProcessRecordDao processRecordDao;
    private MessageDao messageDao;
    private PayRecord payRecord;
    private BusinessCost businessCost;
    private PowerDesign powerDesign;
    private int businesscostId;

    public void setSession(Map session) {
        this.session = session;
    }

    public void setNewVillageDao(NewVillageDao newVillageDao) {
        this.newVillageDao = newVillageDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setReceiptdao(ReceiptDao receiptdao) {
        this.receiptdao = receiptdao;
    }

    public void setCostdao(CostDao costdao) {
        this.costdao = costdao;
    }

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public PayRecord getPayRecord() {
        return payRecord;
    }

    public void setPayRecord(PayRecord payRecord) {
        this.payRecord = payRecord;
    }

    public BusinessCost getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(BusinessCost businessCost) {
        this.businessCost = businessCost;
    }

    public PowerDesign getPowerDesign() {
        return powerDesign;
    }

    public void setPowerDesign(PowerDesign powerDesign) {
        this.powerDesign = powerDesign;
    }

    public int getBusinesscostId() {
        return businesscostId;
    }

    public void setBusinesscostId(int businesscostId) {
        this.businesscostId = businesscostId;
    }

    public String QueryCost(){
       /* try{

        }catch (Exception ex){
            ex.printStackTrace();
        }*/
        List<BusinessCost> businessCosts=costdao.queryAllCost();
        session.put("businessCosts",businessCosts);
        return SUCCESS;
    }

    public String QueryCostByID(){
        try{
            BusinessCost businessCosts=costdao.QueryCostByID(businesscostId);
            session.put("businessCostInfo",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "costdetail";
    }

   /* public String QueryPayRecord(){
        try{
            List<PayRecord> payRecords=receiptdao.QueryAllRecord();
            session.put("payRecords",payRecords);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }*/

    public String ExaminCost(){

        try{
            Timestamp time=new Timestamp(System.currentTimeMillis());
            businessCost.setCreateTime(time);
            BusinessCost businessCost1 = costdao.QueryCostByID(this.businessCost.getCostId());
            businessCost1.setStatus("1");
            costdao.updateCost(businessCost1);

            //更改流程记录单中应收业务费单号
           /* String hql="from ProcessRecord u where u.newId='"+businessCost.getNewId()+"'";
            List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
            if(processRecords.size()==0) {
                ProcessRecord processRecord = processRecords.get(0);
                processRecord.setCostId(businessCost.getCostId());
                processRecordDao.editProcess(processRecord);
            }*/
            ProcessRecord processRecord=processRecordDao.queryProcessRecordByNewVillage(businessCost.getNewId());
            processRecord.setCostId(businessCost.getCostId());
            processRecordDao.editProcess(processRecord);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "examincost";
    }

    public String PayRecord(){
        String flag="recordfull";
        try{
            BusinessCost businessCosts=costdao.QueryCostByID(businesscostId);
            session.put("businessCostInfo",businessCosts);
            String hql="from PayRecord u where u.newId='"+businessCosts.getNewId()+"'";
            List<PayRecord> pay=receiptdao.QueryRecord(hql);
            if(pay.size()>=0&&pay.size()<3)
                flag="addpayrecord";
            switch (pay.size()){
                case 0:session.put("perenct",20);session.put("peren",80);break;
                case 1:session.put("perenct",40);session.put("peren",40);break;
                case 2:session.put("perenct",40);session.put("peren",0);break;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    public String QueryPower(){
        session.put("PowerDesignInfo",powerDesign);
        return "PowerDesignDetail";
    }


    public String addPayRecord() {
        String flag=INPUT;
        try{
            Timestamp time=new Timestamp(System.currentTimeMillis());
            payRecord.setCreateTime(time);
            payRecord.setPayTime(time);
            Employee emp=(Employee) session.get("employee");
            payRecord.setPayPerId(emp.getEmpId());
            payRecord.setStatus("1");
            receiptdao.addPayRecord(payRecord);

            //更改流程记录单中实收业务费单号
            ProcessRecord processRecord=processRecordDao.queryProcessRecordByNewVillage(payRecord.getNewId());
            String hql="from PayRecord u where u.newId='"+payRecord.getNewId()+"'";
            List<PayRecord> payRecords=receiptdao.QueryRecord(hql);
            processRecord.setPayId(payRecords.get(0).getPayId());
            processRecordDao.editProcess(processRecord);

                /*//通知记录员进行消息记录
                Message message=new Message();
                message.setStatus("0");
                message.setNewId(payRecord.getNewId());
                message.setRefund(payRecord.getPayId());
                List<Employee> employees=employeeDao.QueryEmployeeByDep("记录员");
                message.setEmpId(employees.get(0).getEmpId());
                messageDao.addMessage(message);*/

            //改写用户的账户状态
            NewVillage newVillage=newVillageDao.queryNewVillageByID(payRecord.getNewId());
            List<User> users=userDao.queryUserByPid(newVillage.getUserPid());
            User user=users.get(0);
            user.setUserTicket(user.getUserTicket()+payRecord.getPayment());
            userDao.updateUser(user);

            flag = "paysuccess";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}

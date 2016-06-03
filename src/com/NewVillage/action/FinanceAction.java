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
    public void setSession(Map session) {
        this.session = session;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setReceiptdao(ReceiptDao receiptdao) {
        this.receiptdao = receiptdao;
    }

    public void setNewVillageDao(NewVillageDao newVillageDao) {
        this.newVillageDao = newVillageDao;
    }

    public void setCostdao(CostDao costdao) {
        this.costdao = costdao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setPayRecord(PayRecord payRecord) {
        this.payRecord = payRecord;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void setBusinessCost(BusinessCost businessCost) {
        this.businessCost = businessCost;
    }

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public String QueryCost(){
        try{
            List<BusinessCost> businessCosts=costdao.QueryAllCost();
            session.put("businessCosts",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String QueryCostByID(){
        try{
            BusinessCost businessCosts=costdao.QueryCostByID(businessCost.getCostId());
            session.put("businessCostInfo",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String QueryPayRecord(){
        try{
            List<PayRecord> payRecords=receiptdao.QueryAllRecord();
            session.put("payRecords",payRecords);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String PayRecord(){
        String flag=INPUT;
        try{
            session.put("businessCostInfo",businessCost);
            String hql="from PayRecord u where u.newId='"+businessCost.getNewId()+"' and u.status='有效收款'";
            List<PayRecord> pay=receiptdao.QueryRecord(hql);
            if(pay.size()>=0&&pay.size()<3)
                flag=SUCCESS;
            switch (pay.size()){
                case 0:session.put("perenct",20);break;
                case 1:session.put("perenct",40);break;
                case 2:session.put("perenct",40);break;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    public String ExaminCost(){
        Timestamp time=new Timestamp(System.currentTimeMillis());
        try{
            businessCost.setCreateTime(time);
            costdao.ExaminCost(businessCost);

            //更改流程记录单中应收业务费单号
            String hql="from ProcessRecord u where u.newId='"+payRecord.getNewId()+"'";
            List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
            ProcessRecord processRecord=processRecords.get(0);
            processRecord.setCostId(businessCost.getCostId());
            processRecordDao.editProcess(processRecord);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    @Override
    public String execute() {
        String flag=INPUT;
        try{
            Timestamp time=new Timestamp(System.currentTimeMillis());
            if (payRecord.getPayPrecent()!=null){
                payRecord.setCreateTime(time);
                Employee emp=(Employee) session.get("employee");
                payRecord.setPayPerId(emp.getEmpId());
                payRecord.setStatus("有效收款");
                receiptdao.addPayRecord(payRecord);

                //更改流程记录单中实收业务费单号
                String hql="from ProcessRecord u where u.newId='"+payRecord.getNewId()+"'";
                List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
                ProcessRecord processRecord=processRecords.get(0);
                hql="from PayRecord u where u.newId='"+payRecord.getNewId()+"' order by u.createTime desc";
                List<PayRecord> payRecords=receiptdao.QueryRecord(hql);
                PayRecord pay=payRecords.get(0);
                processRecord.setPayId(payRecord.getPayId());
                processRecordDao.editProcess(processRecord);

                //通知记录员进行消息记录
                Message message=new Message();
                message.setStatus("0");
                message.setNewId(payRecord.getNewId());
                message.setRefund(payRecord.getPayId());
                List<Employee> employees=employeeDao.QueryEmployeeByDep("记录员");
                message.setEmpId(employees.get(0).getEmpId());
                messageDao.addMessage(message);

                //改写用户的账户状态
                NewVillage newVillage=newVillageDao.queryNewVillageByID(payRecord.getNewId());
                List<User> users=userDao.queryUserByPid(newVillage.getUserPid());
                User user=users.get(0);
                user.setUserTicket(user.getUserTicket()+payRecord.getPayment());
                userDao.updateUser(user);

                flag = SUCCESS;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}

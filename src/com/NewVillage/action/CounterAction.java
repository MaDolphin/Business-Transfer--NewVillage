package com.NewVillage.action;

import com.NewVillage.dao.*;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CounterAction extends ActionSupport implements SessionAware {
    UserDao userDao;
    NewVillageDao newVillageDao;
    JobInfoDao jobInfoDao;
    InvestigationWorkDao investigationWorkDao;
    User user;
    NewVillage newVillage;
    private PowerDesignReplyDao powerDesignReplyDao;
    private PowerDesignReply powerDesignReply;
    private ProcessRecordDao processRecordDao;
    private CostDao costDao;
    private PowerDesignDao powerDesignDao;
    private Map session;

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public void setJobInfoDao(JobInfoDao jobInfoDao) {
        this.jobInfoDao = jobInfoDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setNewVillageDao(NewVillageDao newVillageDao) {
        this.newVillageDao = newVillageDao;
    }

    public void setInvestigationWorkDao(InvestigationWorkDao investigationWorkDao) {
        this.investigationWorkDao = investigationWorkDao;
    }

    public void setCostDao(CostDao costDao) {
        this.costDao = costDao;
    }

    public void setPowerDesignDao(PowerDesignDao powerDesignDao) {
        this.powerDesignDao = powerDesignDao;
    }

    public void setPowerDesignReplyDao(PowerDesignReplyDao powerDesignReplyDao) {
        this.powerDesignReplyDao = powerDesignReplyDao;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NewVillage getNewVillage() {
        return newVillage;
    }

    public void setNewVillage(NewVillage newVillage) {
        this.newVillage = newVillage;
    }

    public PowerDesignReply getPowerDesignReply() {
        return powerDesignReply;
    }

    public void setPowerDesignReply(PowerDesignReply powerDesignReply) {
        this.powerDesignReply = powerDesignReply;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public String AddUser(){
        User userUp = this.user;
        userUp.setUserTicket(Double.valueOf(0));
        userUp.setUserType(0);
        userUp.setUserLevel(0);
        if(userDao.addUser(userUp)){
            return "addUserSuccess";
        }else{
            return "addUserError";
        }
    }
    public String AddNewVillage(){
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Employee emp = (Employee) session.get("employee");
        NewVillage newVillageUp = this.newVillage;
        newVillageUp.setCreateTime(date);
        newVillageUp.setNewVilPerId(emp.getEmpId());
        newVillageUp.setStatus("0");
        if(newVillageDao.addNewVillage(newVillageUp)){
            NewVillage newVillageGet = newVillageDao.queryNewVillageByUserTime(this.newVillage.getUserPid(),emp.getEmpId(),date);
            ProcessRecord processRecord = new ProcessRecord();
            processRecord.setNewId(newVillageGet.getNewId());
            processRecordDao.addProcess(processRecord);
            JobInfo jobInfo = jobInfoDao.queryEmpByFreeDep("勘查员");
            InvestigationWork investigationWork = new InvestigationWork();
            investigationWork.setNewId(newVillageGet.getNewId());
            investigationWork.setInvesPerId(jobInfo.getEmpId());
            Timestamp date1 = new Timestamp(System.currentTimeMillis());
            Timestamp date2 = new Timestamp(System.currentTimeMillis()+86400000);
            investigationWork.setInvesTime(date2);
            investigationWork.setCreateTime(date1);
            investigationWork.setStatus("0");
            if(investigationWorkDao.addInvestigationWork(investigationWork)){
                InvestigationWork investigationWork1 = investigationWorkDao.queryInvestigationWorkByNewID(newVillageGet.getNewId());
                ProcessRecord processRecord1 = processRecordDao.queryProcessRecordByNewVillage(newVillageGet.getNewId());
                processRecord1.setInvesId(investigationWork1.getInvesId());
                processRecord1.setStatus("勘查派工");
                processRecordDao.editProcess(processRecord1);
                return "addNewVillageSuccess";
            }else {
                return "addNewVillageError";
            }
        }else{
            return "addNewVillageError";
        }
    }

    public String QueryNewVill(){
        try{
            List<NewVillage> newVillageList=newVillageDao.queryAllNewVillage();
            session.put("newVillage",newVillageList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String PowerDesignReply(){
        Timestamp date = new Timestamp(System.currentTimeMillis());
        try{
            powerDesignReply.setStatus("1");
            powerDesignReply.setCreateTime(date);
            Employee emp=(Employee)session.get("employee");
            powerDesignReply.setReplyPerId(emp.getEmpId());
            powerDesignReplyDao.addPowerDesignReply(powerDesignReply);

            //通过默认的数据 创建应收费用表单
            BusinessCost businessCost=new BusinessCost();
            businessCost.setStatus("0");
            businessCost.setCreateTime(date);
            businessCost.setNewId(powerDesignReply.getNewId());
            List<PowerDesign> list=powerDesignDao.allPowerDesignsByNewID(powerDesignReply.getNewId());
            PowerDesign powerDesign=list.get(0);
            double charge=powerDesign.getPowerNum()*500+powerDesign.getPowerLineNum()*30;
            businessCost.setCharge(charge);
            businessCost.setCostItem("电源数量："+powerDesign.getPowerNum()+" 电线数量："+powerDesign.getPowerLineNum());
            costDao.addBusinessCost(businessCost);

            //更改流程记录单中应收业务费单号
            String hql="from ProcessRecord u where u.newId='"+powerDesignReply.getNewId()+"'";
            List<ProcessRecord> processRecords=processRecordDao.QueryProcess(hql);
            ProcessRecord processRecord=processRecords.get(0);
            processRecord.setReplyId(powerDesignReply.getReplyId());
            processRecordDao.editProcess(processRecord);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "PowerDesignReply";
    }

}

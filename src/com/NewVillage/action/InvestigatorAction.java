package com.NewVillage.action;

import com.NewVillage.dao.*;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class InvestigatorAction extends ActionSupport implements SessionAware {
    private InvestigationSiteDao investigationSiteDao;
    private InvestigationWorkDao investigationWorkDao;
    NewVillageDao newVillageDao;
    ProcessRecordDao processRecordDao;
    PowerDesignDao powerDesignDao;
    JobInfoDao jobInfoDao;
    private InvestigationWork investigationWork;
    private InvestigationSite investigationSite;
    private int invesId;
    private int newId;
    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public InvestigationWork getInvestigationWork() {
        return investigationWork;
    }

    public void setInvestigationWork(InvestigationWork investigationWork) {
        this.investigationWork = investigationWork;
    }

    public InvestigationSite getInvestigationSite() {
        return investigationSite;
    }

    public void setInvestigationSite(InvestigationSite investigationSite) {
        this.investigationSite = investigationSite;
    }

    public void setJobInfoDao(JobInfoDao jobInfoDao) {
        this.jobInfoDao = jobInfoDao;
    }

    public void setPowerDesignDao(PowerDesignDao powerDesignDao) {
        this.powerDesignDao = powerDesignDao;
    }

    public void setNewVillageDao(NewVillageDao newVillageDao) {
        this.newVillageDao = newVillageDao;
    }

    public void setProcessRecordDao(ProcessRecordDao processRecordDao) {
        this.processRecordDao = processRecordDao;
    }

    public void setInvestigationSiteDao(InvestigationSiteDao investigationSiteDao) {
        this.investigationSiteDao = investigationSiteDao;
    }

    public void setInvestigationWorkDao(InvestigationWorkDao investigationWorkDao) {
        this.investigationWorkDao = investigationWorkDao;
    }

    public int getInvesId() {
        return invesId;
    }

    public void setInvesId(int invesId) {
        this.invesId = invesId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }


    public String InitInvestigationWork(){
        Employee employee = (Employee) session.get("employee");
        List<InvestigationWork> investigationWorkList = investigationWorkDao.allInvestigationWorksByEmpID(employee.getEmpId());
        session.put("InvestigationWorkList",investigationWorkList);
        return SUCCESS;
    }

    public String AcceptInvestigationWork(){
        InvestigationWork inves1 = investigationWorkDao.queryInvestigationWorkByID(invesId);
        if(inves1.getStatus().equals("0")){
            inves1.setStatus("1");
            investigationWorkDao.updateInvestigationWork(inves1);
        }
        NewVillage newVillage = newVillageDao.queryNewVillageByID(inves1.getNewId());
        session.put("NewVillageDetail",newVillage);
        return "AcceptInvestigationWorkSuccess";
    }

    public String InitInvestigationSite(){
        Employee employee = (Employee) session.get("employee");
        List<InvestigationWork> investigationWorkList = investigationWorkDao.allInvestigationWorksINGByEmpID(employee.getEmpId());
        session.put("InvestigationWorkListByEmpID",investigationWorkList);
        return SUCCESS;
    }

    public String AddInvestigationSite(){

        newId = this.investigationSite.getNewId();

        //add InvestigationSite
        InvestigationSite investigationSiteUp = this.investigationSite;
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Employee emp = (Employee) session.get("employee");
        investigationSiteUp.setInvesPerId(emp.getEmpId());
        investigationSiteUp.setCreateTime(date);
        investigationSiteUp.setRunTime(date);
        investigationSiteUp.setStatus("0");

        if(investigationSiteDao.addInvestigationSite(investigationSiteUp)){

            //add InvestigationSite id to ProcessRecord
            InvestigationSite investigationSite1 = investigationSiteDao.queryInvestigationSiteByNewIDStatus0(newId);
            ProcessRecord processRecord = processRecordDao.queryProcessRecordByNewVillage(newId);
            processRecord.setInvesSiteId(investigationSite1.getInvesSiteId());
            processRecord.setStatus("现场勘查");
            processRecordDao.editProcess(processRecord);

            //edit NewVillage status to 2
            NewVillage newVillage = newVillageDao.queryNewVillageByID(newId);
            newVillage.setStatus("2");
            newVillageDao.updateNewVillage(newVillage);

            //add PowerDesign
            PowerDesign powerDesign = new PowerDesign();
            powerDesign.setNewId(newId);
            powerDesign.setStatus("0");
            JobInfo jobInfo = jobInfoDao.queryEmpByFreeDep("方案小组");
            powerDesign.setPowerDesignPerId(jobInfo.getEmpId());
            Timestamp date1 = new Timestamp(System.currentTimeMillis());
            powerDesign.setCreateTime(date1);
            powerDesignDao.addPowerDesign(powerDesign);

            //add work to JobInfo
            JobInfo job1 = jobInfoDao.queryJobInfosByEmpID(jobInfo.getEmpId());
            job1.setJobNum(job1.getJobNum()+1);
            jobInfoDao.updateJobInfo(job1);

            //add PowerDesign id to InvestigationSite
            PowerDesign powerDesign1 = powerDesignDao.queryPowerDesignByNewID(newId);
            InvestigationSite investigationSite2 = investigationSiteDao.queryInvestigationSiteByNewIDStatus0(newId);
            investigationSite2.setPowerId(powerDesign1.getPowerId());
            investigationSiteDao.updateInvestigationSite(investigationSite2);

            //edit InvestigationWork status to 2
            InvestigationWork inves1 = investigationWorkDao.queryInvestigationWorkByNewIDStatus1(this.investigationSite.getNewId());
            inves1.setStatus("2");
            investigationWorkDao.updateInvestigationWork(inves1);

            return "addInvestigationSiteSuccess";
        }else {
            return "addInvestigationSiteError";
        }
    }
}

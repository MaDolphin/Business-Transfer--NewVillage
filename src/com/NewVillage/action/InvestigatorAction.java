package com.NewVillage.action;

import com.NewVillage.dao.*;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
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

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String AddInvestigationSite(){
        InvestigationSite investigationSiteUp = this.investigationSite;
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Employee emp = (Employee) session.get("employee");
        investigationSiteUp.setInvesPerId(emp.getEmpId());
        investigationSiteUp.setCreateTime(date);
        investigationSiteUp.setStatus("0");
        if(investigationSiteDao.addInvestigationSite(investigationSiteUp)){
            InvestigationSite investigationSite1 = investigationSiteDao.queryInvestigationSiteByNewID(newId);
            ProcessRecord processRecord = processRecordDao.queryProcessRecordByNewVillage(newId);
            processRecord.setInvesSiteId(investigationSite1.getInvesSiteId());
            processRecord.setStatus("现场勘查");
            processRecordDao.editProcess(processRecord);
            NewVillage newVillage = newVillageDao.queryNewVillageByID(newId);
            newVillage.setStatus("1");
            newVillageDao.updateNewVillage(newVillage);
            PowerDesign powerDesign = new PowerDesign();
            powerDesign.setNewId(newId);
            powerDesign.setStatus("0");
            JobInfo jobInfo = jobInfoDao.queryEmpByFreeDep("方案小组");
            powerDesign.setPowerDesignPerId(jobInfo.getEmpId());
            powerDesignDao.addPowerDesign(powerDesign);
            PowerDesign powerDesign1 = powerDesignDao.queryPowerDesignByNewID(newId);
            InvestigationSite investigationSite2 = investigationSiteDao.queryInvestigationSiteByNewID(newId);
            investigationSite2.setPowerId(powerDesign1.getPowerId());
            investigationSiteDao.addInvestigationSite(investigationSite2);
            return "addInvestigationSiteSuccess";
        }else {
            return "addInvestigationSiteError";
        }
    }
}

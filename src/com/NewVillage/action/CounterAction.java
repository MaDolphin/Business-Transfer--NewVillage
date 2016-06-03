package com.NewVillage.action;

import com.NewVillage.dao.JobInfoDao;
import com.NewVillage.dao.NewVillageDao;
import com.NewVillage.dao.UserDao;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CounterAction extends ActionSupport implements SessionAware {
    UserDao userDao;
    NewVillageDao newVillageDao;
    JobInfoDao jobInfoDao;
    User user;
    NewVillage newVillage;
    private Map session;

    public void setJobInfoDao(JobInfoDao jobInfoDao) {
        this.jobInfoDao = jobInfoDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setNewVillageDao(NewVillageDao newVillageDao) {
        this.newVillageDao = newVillageDao;
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
            JobInfo jobInfo = jobInfoDao.queryEmpByFreeDep("勘查员");
            InvestigationWork investigationWork = new InvestigationWork();
            investigationWork.setNewId(newVillageGet.getNewId());
            investigationWork.setInvesPerId(jobInfo.getEmpId());
            Timestamp date1 = new Timestamp(System.currentTimeMillis());
            Timestamp date2 = new Timestamp(System.currentTimeMillis()+86400000);
            investigationWork.setInvesTime(date2);
            investigationWork.setCreateTime(date1);
            investigationWork.setStatus("0");
            return "addNewVillageSuccess";
        }else{
            return "addNewVillageError";
        }
    }



}

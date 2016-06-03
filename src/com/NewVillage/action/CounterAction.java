package com.NewVillage.action;

import com.NewVillage.dao.NewVillageDao;
import com.NewVillage.dao.UserDao;
import com.NewVillage.entity.NewVillage;
import com.NewVillage.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by xfcq on 2016/6/3.
 */
public class CounterAction extends ActionSupport implements SessionAware {
    UserDao userDao;
    NewVillageDao newVillageDao;
    User user;
    NewVillage newVillage;
    private Map session;

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
        User userup = this.user;
        userup.setUserTicket(Double.valueOf(0));
        userup.setUserType(0);
        userup.setUserLevel(0);
        if(userDao.addUser(userup)){
            return "addUserSuccess";
        }else{
            return "1";
        }

    }

}

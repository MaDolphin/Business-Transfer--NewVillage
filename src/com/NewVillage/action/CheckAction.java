package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.Inspect;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by Brown on 2016/6/3.
 */
public class CheckAction extends ActionSupport{
    Inspect inspect;
    CheckDao checkDao;
    private String checkContent;
    private String checkNum;
    private String checkResult;

    private Date checkTime;
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void setInspect(Inspect inspect) {
        this.inspect = inspect;
    }


    public void setCheckDao(CheckDao checkDao) {
        this.checkDao = checkDao;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();
    public String add() throws Exception{
        inspect.setCheckPerId("1");
        inspect.setCreateTime(timestamp);
        inspect.setCheckTime(checkTime);
        inspect.setCheckContent(checkContent);
        inspect.setCheckNum(Integer.valueOf(checkNum));
        inspect.setChenckResult(checkResult);
        inspect.setNewId(2);
        checkDao.addCheck(inspect);
        return "success";
    }
}

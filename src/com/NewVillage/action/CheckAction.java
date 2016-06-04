package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.DesignFileCheck;
import com.NewVillage.entity.Employee;
import com.NewVillage.entity.Inspect;
import com.NewVillage.entity.Inspection;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
    private int id;

    private Date checkTime;
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public Inspect getInspect() {
        return inspect;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();
    public String add() throws Exception{
//        DesignFileCheck designFileCheck=new DesignFileCheck();
//        List<DesignFileCheck> list=new ArrayList();
//        list=checkDao.searchObject("2");
//        designFileCheck=list.get(0);
//        inspect.setNewId(designFileCheck.getNewId());

        Employee employee= (Employee) session.get("employee");

        inspect.setCheckPerId(String.valueOf(employee.getEmpId()));
        inspect.setCreateTime(timestamp);
        inspect.setNewId(1);
        inspect.setStatus("0");
        checkDao.addCheck(inspect);
        return "success";
    }
    public String searchInfo() throws Exception{
//        DesignFileCheck designFileCheck=new DesignFileCheck();
//        List<DesignFileCheck> list=new ArrayList();
//        list=checkDao.searchObject("2");
//        designFileCheck=list.get(0);
//        inspect.setNewId(designFileCheck.getNewId());

        Employee employee= (Employee) session.get("employee");

        inspect.setCheckPerId(String.valueOf(employee.getEmpId()));
        inspect.setCreateTime(timestamp);
        inspect.setNewId(1);
        inspect.setStatus("0");
        checkDao.addCheck(inspect);
        return "success";
    }
    public String searchCheckInfo() throws Exception{

        List<Inspect> list=new ArrayList<>();
        list=checkDao.searchInspectManage(1);
        session.put("Inspectlist",list);
        return "success";
    }
    public String searchInspectionInfo() throws Exception{

        List<Inspection> Inspectionlist=new ArrayList<>();
        Inspectionlist=checkDao.searchInspectionManage(1);
        session.put("Inspectionlist",Inspectionlist);
        return "success";
    }
    public String pass() throws Exception{

        session.put("id",id);
        return "success";
    }
}

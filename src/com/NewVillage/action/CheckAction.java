package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.entity.*;
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
    private int nid;
    private int cid;
    private int Iid;

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

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getIid() {
        return Iid;
    }

    public void setIid(int iid) {
        Iid = iid;
    }

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();
    public String add() throws Exception{
        Employee employee= (Employee) session.get("employee");
        inspect.setCheckPerId(String.valueOf(employee.getEmpId()));
        inspect.setCreateTime(timestamp);
        inspect.setNewId(Integer.valueOf(session.get("nid").toString()));
        inspect.setStatus("0");
        checkDao.addCheck(inspect);
        return "success";
    }
    public String SetCheckId() throws Exception{
        ProcessRecord processRecord=new ProcessRecord();
        processRecord=checkDao.searchProcessRecord(Integer.valueOf(session.get("nid").toString())).get(0);
        Inspect inspect=new Inspect();
        inspect = checkDao.searchInspectId(Integer.valueOf(session.get("nid").toString())).get(0);
        processRecord.setCheckId(inspect.getCheckId());
        checkDao.updateObject(processRecord);
        return "success";
    }
    public String SetInspectionId() throws Exception{
        ProcessRecord processRecord=new ProcessRecord();
        processRecord=checkDao.searchProcessRecord(Integer.valueOf(session.get("nid").toString())).get(0);
        Inspection inspection=new Inspection();
        inspection = checkDao.searchInspectionId(Integer.valueOf(session.get("nid").toString())).get(0);
        processRecord.setInsId(inspection.getInsId());
        checkDao.updateObject(processRecord);
        return "success";
    }
    public String searchInfo() throws Exception{

        List<DesignFileCheck> list=new ArrayList<>();
        list=checkDao.searchInfo();
        session.put("DesignFileChecklist",list);
        return "success";
    }
    public String searchCheckInfo() throws Exception{

        List<Inspect> list=new ArrayList<>();
        list=checkDao.searchInspectManage(Integer.valueOf(session.get("nid").toString()));
        session.put("Inspectlist",list);
        return "success";
    }
    public String searchInspectionInfo() throws Exception{

        List<Inspection> Inspectionlist=new ArrayList<>();
        Inspectionlist=checkDao.searchInspectionManage(Integer.valueOf(session.get("nid").toString()));
        session.put("Inspectionlist",Inspectionlist);
        return "success";
    }
    public String searchNopassCheckInfo() throws Exception{

        List<Inspection> Inspectionlist=new ArrayList<>();
        Inspectionlist=checkDao.searchNopassCheckInfo(Integer.valueOf(session.get("nid").toString()));
        session.put("Inspectionlist",Inspectionlist);
        return "success";
    }
    public String pass() throws Exception{

        session.put("id",id);
        session.put("cid",cid);
        session.put("nid",nid);
        session.put("Iid",Iid);
        return "success";
    }
}

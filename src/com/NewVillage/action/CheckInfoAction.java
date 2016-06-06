package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.dao.CheckInfoDao;
import com.NewVillage.entity.*;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Brown on 2016/6/4.
 */
public class CheckInfoAction {
    CheckInfo checkInfo;
    CheckInfoDao checkInfoDao;
    CheckDao checkDao;
    private String result;
//    private String status;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    public void setCheckInfo(CheckInfo checkInfo) {
        this.checkInfo = checkInfo;
    }

    public void setCheckInfoDao(CheckInfoDao checkInfoDao) {
        this.checkInfoDao = checkInfoDao;
    }

    public void setCheckDao(CheckDao checkDao) {
        this.checkDao = checkDao;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();

    public String add() throws Exception{

        Employee employee= (Employee) session.get("employee");
        checkInfo.setNewId(Integer.valueOf(session.get("nid").toString()));

        checkInfo.setCheckInfoerId(employee.getEmpId());
        checkInfo.setCreateTime(timestamp);
//        checkInfo.setStatus(status);
        checkInfoDao.addCheckInfo(checkInfo);

        int Id=Integer.valueOf(session.get("Iid").toString());
        Inspection inspection=new Inspection();
        inspection=checkDao.searchInspection(Id).get(0);
        System.out.print(checkInfo.getQualified());
        inspection.setStatus(checkInfo.getQualified());
        checkDao.updateObject(inspection);
        this.result="true";

        ProcessRecord processRecord=new ProcessRecord();
        processRecord=checkDao.searchProcessRecord(Integer.valueOf(session.get("nid").toString())).get(0);
        CheckInfo checkInfo=new CheckInfo();
        checkInfo = checkDao.searchCheckInfoId(Integer.valueOf(session.get("nid").toString())).get(0);
        processRecord.setCheckInfoId(checkInfo.getCheckInfoId());
        checkDao.updateObject(processRecord);
        return "success";
    }
}

package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.dao.CheckInfoDao;
import com.NewVillage.entity.CheckInfo;
import com.NewVillage.entity.DesignFileCheck;
import com.NewVillage.entity.Employee;
import com.NewVillage.entity.Inspection;
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
        checkInfo.setNewId(1);

        checkInfo.setCheckInfoerId(employee.getEmpId());
        checkInfo.setCreateTime(timestamp);
//        checkInfo.setStatus(status);
        checkInfoDao.addCheckInfo(checkInfo);

        Inspection inspection=new Inspection();
        inspection=checkDao.searchInspection(1).get(0);
        inspection.setStatus(checkInfo.getQualified());
        checkDao.updateObject(inspection);
this.result="true";
        return "success";
    }
}

package com.NewVillage.action;

import com.NewVillage.dao.CheckDao;
import com.NewVillage.dao.InspectionDao;
import com.NewVillage.entity.DesignFileCheck;
import com.NewVillage.entity.Employee;
import com.NewVillage.entity.Inspect;
import com.NewVillage.entity.Inspection;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Brown on 2016/6/4.
 */
public class InspectionAction {
    Inspection inspection;
    InspectionDao inspectionDao;
    CheckDao checkDao;
    private Date accTime;
    private Date insTime;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public Inspection getInspection() {
        return inspection;
    }

    public void setInspection(Inspection inspection) {
        this.inspection = inspection;
    }

    public void setInspectionDao(InspectionDao inspectionDao) {
        this.inspectionDao = inspectionDao;
    }

    public Date getAccTime() {
        return accTime;
    }

    public void setAccTime(Date accTime) {
        this.accTime = accTime;
    }

    public Date getInsTime() {
        return insTime;
    }

    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    public void setCheckDao(CheckDao checkDao) {
        this.checkDao = checkDao;
    }

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();

    public String add() throws Exception{
//        DesignFileCheck designFileCheck=new DesignFileCheck();
//        List<DesignFileCheck> list=new ArrayList();
//
//        list=checkDao.searchObject("2");
//        designFileCheck=list.get(0);
//        inspection.setNewId(designFileCheck.getNewId());
//
        Employee employee= (Employee) session.get("employee");
        inspection.setInsPerId(employee.getEmpId());
        inspection.setNewId(1);

        inspection.setStatus("0");
        inspection.setCreateTime(timestamp);
        inspectionDao.addInspect(inspection);

        Inspect inspect=new Inspect();
        inspect=checkDao.searchInspect(1).get(0);
        inspect.setStatus("0");
        inspect.setCheckTime(inspect.getCheckTime());
        checkDao.updateObject(inspect);

        return "success";
    }
}

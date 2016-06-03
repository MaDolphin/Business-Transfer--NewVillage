package com.NewVillage.action;

import com.NewVillage.dao.InspectionDao;
import com.NewVillage.entity.Inspection;
import com.opensymphony.xwork2.ActionContext;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by Brown on 2016/6/4.
 */
public class InspectionAction {
    Inspection inspection;
    InspectionDao inspectionDao;
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

    ActionContext actionContext= ActionContext.getContext();
    Map session=actionContext.getSession();

    public String add() throws Exception{
        inspection.setNewId(1);
        inspection.setAccTime(accTime);
        inspection.setInsTime(insTime);
        inspection.setCreateTime(timestamp);
        System.out.print("-----------------------");
        System.out.print(inspection.getInsRequire());
        System.out.print("-----------------------");
        inspectionDao.addInspect(inspection);
        return "success";
    }
}

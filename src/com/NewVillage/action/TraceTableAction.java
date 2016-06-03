package com.NewVillage.action;

import com.NewVillage.dao.TraceTableDao;
import com.NewVillage.entity.TraceTable;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by Dream on 2016/6/3.
 */
//1.11供电工程进度跟踪
public class TraceTableAction extends ActionSupport implements SessionAware{
    private Map session;
    private TraceTableDao traceTableDao;
    private int traceId;
    private int responsiblePerId;
    private String responsibleUnit;
    private String supervisorUnit;
    private String proDesignResult;
    private String proFileResult;
    private String budgetResult;
    private String chargeResult;
    private String equipmentSupResult;
    private String constructionResult;
    private String midCheckResult;
    private String finalInsResult;
    private String proAccountsResult;
    private Timestamp createTime;
    private int newId;
    private String status;

    public TraceTableDao getTraceTableDao() {
        return traceTableDao;
    }

    public void setTraceTableDao(TraceTableDao traceTableDao) {
        this.traceTableDao = traceTableDao;
    }

    public int getTraceId() {
        return traceId;
    }

    public void setTraceId(int traceId) {
        this.traceId = traceId;
    }

    public int getResponsiblePerId() {
        return responsiblePerId;
    }

    public void setResponsiblePerId(int responsiblePerId) {
        this.responsiblePerId = responsiblePerId;
    }

    public String getResponsibleUnit() {
        return responsibleUnit;
    }

    public void setResponsibleUnit(String responsibleUnit) {
        this.responsibleUnit = responsibleUnit;
    }

    public String getSupervisorUnit() {
        return supervisorUnit;
    }

    public void setSupervisorUnit(String supervisorUnit) {
        this.supervisorUnit = supervisorUnit;
    }

    public String getProDesignResult() {
        return proDesignResult;
    }

    public void setProDesignResult(String proDesignResult) {
        this.proDesignResult = proDesignResult;
    }

    public String getProFileResult() {
        return proFileResult;
    }

    public void setProFileResult(String proFileResult) {
        this.proFileResult = proFileResult;
    }

    public String getBudgetResult() {
        return budgetResult;
    }

    public void setBudgetResult(String budgetResult) {
        this.budgetResult = budgetResult;
    }

    public String getChargeResult() {
        return chargeResult;
    }

    public void setChargeResult(String chargeResult) {
        this.chargeResult = chargeResult;
    }

    public String getEquipmentSupResult() {
        return equipmentSupResult;
    }

    public void setEquipmentSupResult(String equipmentSupResult) {
        this.equipmentSupResult = equipmentSupResult;
    }

    public String getConstructionResult() {
        return constructionResult;
    }

    public void setConstructionResult(String constructionResult) {
        this.constructionResult = constructionResult;
    }

    public String getMidCheckResult() {
        return midCheckResult;
    }

    public void setMidCheckResult(String midCheckResult) {
        this.midCheckResult = midCheckResult;
    }

    public String getFinalInsResult() {
        return finalInsResult;
    }

    public void setFinalInsResult(String finalInsResult) {
        this.finalInsResult = finalInsResult;
    }

    public String getProAccountsResult() {
        return proAccountsResult;
    }

    public void setProAccountsResult(String proAccountsResult) {
        this.proAccountsResult = proAccountsResult;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }



    public String QueryAllScheduleCondition(){
        try{
            List<TraceTable> traceTables=traceTableDao.QueryAllScheduleCondition();
            session.put("traceTables",traceTables);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }

    public String addTraceTableRecord(){
        try {
            TraceTable traceTable = new TraceTable();
            Timestamp date=new Timestamp(System.currentTimeMillis());
            if (traceTableDao.queryTraceTableRecordByID(traceId) == null) {
                traceTable.setTraceId(traceId);
                traceTable.setResponsiblePerId(responsiblePerId);
                traceTable.setResponsibleUnit(responsibleUnit);
                traceTable.setSupervisorUnit(supervisorUnit);
                traceTable.setProDesignResult(proDesignResult);
                traceTable.setProFileResult(proFileResult);
                traceTable.setBudgetResult(budgetResult);
                traceTable.setChargeResult(chargeResult);
                traceTable.setEquipmentSupResult(equipmentSupResult);
                traceTable.setConstructionResult(constructionResult);
                traceTable.setMidCheckResult(midCheckResult);
                traceTable.setFinalInsResult(finalInsResult);
                traceTable.setProAccountsResult(proAccountsResult);
                traceTable.setCreateTime(date);
                traceTableDao.addTraceTableRecord(traceTable);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }

    public String deleteTraceTableRecord(){
        TraceTable traceTable=traceTableDao.queryTraceTableRecordByID(traceId);
        if(traceTableDao.deleteTraceTableRecord(traceTable)){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
    public String updateTraceTableRecord(){
        TraceTable traceTable=traceTableDao.queryTraceTableRecordByID(traceId);
        traceTable.setTraceId(traceId);
        traceTable.setResponsiblePerId(responsiblePerId);
        traceTable.setResponsibleUnit(responsibleUnit);
        traceTable.setSupervisorUnit(supervisorUnit);
        traceTable.setProDesignResult(proDesignResult);
        traceTable.setProFileResult(proFileResult);
        traceTable.setBudgetResult(budgetResult);
        traceTable.setChargeResult(chargeResult);
        traceTable.setEquipmentSupResult(equipmentSupResult);
        traceTable.setConstructionResult(constructionResult);
        traceTable.setMidCheckResult(midCheckResult);
        traceTable.setFinalInsResult(finalInsResult);
        traceTable.setProAccountsResult(proAccountsResult);
        if (traceTableDao.updateTraceTableRecord(traceTable)){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }

    public String queryTraceTableRecordByID(){
        try{
            TraceTable traceTable=traceTableDao.queryTraceTableRecordByID(traceId);
            session.put("traceTable",traceTable);
        }catch (Exception ex){
            ex.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
}

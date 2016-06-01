package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by xfcq on 2016/6/1.
 */
@Entity
public class TraceTable {
    private int traceId;
    private Integer responsiblePerId;
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

    @Id
    @Column(name = "traceId", nullable = false)
    public int getTraceId() {
        return traceId;
    }

    public void setTraceId(int traceId) {
        this.traceId = traceId;
    }

    @Basic
    @Column(name = "responsiblePerId", nullable = true)
    public Integer getResponsiblePerId() {
        return responsiblePerId;
    }

    public void setResponsiblePerId(Integer responsiblePerId) {
        this.responsiblePerId = responsiblePerId;
    }

    @Basic
    @Column(name = "responsibleUnit", nullable = true, length = 50)
    public String getResponsibleUnit() {
        return responsibleUnit;
    }

    public void setResponsibleUnit(String responsibleUnit) {
        this.responsibleUnit = responsibleUnit;
    }

    @Basic
    @Column(name = "supervisorUnit", nullable = true, length = 50)
    public String getSupervisorUnit() {
        return supervisorUnit;
    }

    public void setSupervisorUnit(String supervisorUnit) {
        this.supervisorUnit = supervisorUnit;
    }

    @Basic
    @Column(name = "proDesignResult", nullable = true, length = -1)
    public String getProDesignResult() {
        return proDesignResult;
    }

    public void setProDesignResult(String proDesignResult) {
        this.proDesignResult = proDesignResult;
    }

    @Basic
    @Column(name = "proFileResult", nullable = true, length = -1)
    public String getProFileResult() {
        return proFileResult;
    }

    public void setProFileResult(String proFileResult) {
        this.proFileResult = proFileResult;
    }

    @Basic
    @Column(name = "budgetResult", nullable = true, length = -1)
    public String getBudgetResult() {
        return budgetResult;
    }

    public void setBudgetResult(String budgetResult) {
        this.budgetResult = budgetResult;
    }

    @Basic
    @Column(name = "chargeResult", nullable = true, length = -1)
    public String getChargeResult() {
        return chargeResult;
    }

    public void setChargeResult(String chargeResult) {
        this.chargeResult = chargeResult;
    }

    @Basic
    @Column(name = "equipmentSupResult", nullable = true, length = -1)
    public String getEquipmentSupResult() {
        return equipmentSupResult;
    }

    public void setEquipmentSupResult(String equipmentSupResult) {
        this.equipmentSupResult = equipmentSupResult;
    }

    @Basic
    @Column(name = "ConstructionResult", nullable = true, length = -1)
    public String getConstructionResult() {
        return constructionResult;
    }

    public void setConstructionResult(String constructionResult) {
        this.constructionResult = constructionResult;
    }

    @Basic
    @Column(name = "midCheckResult", nullable = true, length = -1)
    public String getMidCheckResult() {
        return midCheckResult;
    }

    public void setMidCheckResult(String midCheckResult) {
        this.midCheckResult = midCheckResult;
    }

    @Basic
    @Column(name = "FinalInsResult", nullable = true, length = -1)
    public String getFinalInsResult() {
        return finalInsResult;
    }

    public void setFinalInsResult(String finalInsResult) {
        this.finalInsResult = finalInsResult;
    }

    @Basic
    @Column(name = "proAccountsResult", nullable = true, length = -1)
    public String getProAccountsResult() {
        return proAccountsResult;
    }

    public void setProAccountsResult(String proAccountsResult) {
        this.proAccountsResult = proAccountsResult;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraceTable that = (TraceTable) o;

        if (traceId != that.traceId) return false;
        if (responsiblePerId != null ? !responsiblePerId.equals(that.responsiblePerId) : that.responsiblePerId != null)
            return false;
        if (responsibleUnit != null ? !responsibleUnit.equals(that.responsibleUnit) : that.responsibleUnit != null)
            return false;
        if (supervisorUnit != null ? !supervisorUnit.equals(that.supervisorUnit) : that.supervisorUnit != null)
            return false;
        if (proDesignResult != null ? !proDesignResult.equals(that.proDesignResult) : that.proDesignResult != null)
            return false;
        if (proFileResult != null ? !proFileResult.equals(that.proFileResult) : that.proFileResult != null)
            return false;
        if (budgetResult != null ? !budgetResult.equals(that.budgetResult) : that.budgetResult != null) return false;
        if (chargeResult != null ? !chargeResult.equals(that.chargeResult) : that.chargeResult != null) return false;
        if (equipmentSupResult != null ? !equipmentSupResult.equals(that.equipmentSupResult) : that.equipmentSupResult != null)
            return false;
        if (constructionResult != null ? !constructionResult.equals(that.constructionResult) : that.constructionResult != null)
            return false;
        if (midCheckResult != null ? !midCheckResult.equals(that.midCheckResult) : that.midCheckResult != null)
            return false;
        if (finalInsResult != null ? !finalInsResult.equals(that.finalInsResult) : that.finalInsResult != null)
            return false;
        if (proAccountsResult != null ? !proAccountsResult.equals(that.proAccountsResult) : that.proAccountsResult != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = traceId;
        result = 31 * result + (responsiblePerId != null ? responsiblePerId.hashCode() : 0);
        result = 31 * result + (responsibleUnit != null ? responsibleUnit.hashCode() : 0);
        result = 31 * result + (supervisorUnit != null ? supervisorUnit.hashCode() : 0);
        result = 31 * result + (proDesignResult != null ? proDesignResult.hashCode() : 0);
        result = 31 * result + (proFileResult != null ? proFileResult.hashCode() : 0);
        result = 31 * result + (budgetResult != null ? budgetResult.hashCode() : 0);
        result = 31 * result + (chargeResult != null ? chargeResult.hashCode() : 0);
        result = 31 * result + (equipmentSupResult != null ? equipmentSupResult.hashCode() : 0);
        result = 31 * result + (constructionResult != null ? constructionResult.hashCode() : 0);
        result = 31 * result + (midCheckResult != null ? midCheckResult.hashCode() : 0);
        result = 31 * result + (finalInsResult != null ? finalInsResult.hashCode() : 0);
        result = 31 * result + (proAccountsResult != null ? proAccountsResult.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

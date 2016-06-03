package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 珏 on 2016/6/3.
 */
@Entity
public class ProcessRecord {
    private int processRecordId;
    private Integer newId;
    private Integer invesId;
    private Integer invesSiteId;
    private Integer powerId;
    private Integer exId;
    private Integer replyId;
    private Integer costId;
    private Integer payId;
    private Integer traceId;
    private Integer designFileId;
    private Integer checkId;
    private Integer insId;
    private Integer lotId;
    private Integer checkInfoId;
    private Integer refileId;
    private String status;

    @Id
    @Column(name = "processRecordId")
    public int getProcessRecordId() {
        return processRecordId;
    }

    public void setProcessRecordId(int processRecordId) {
        this.processRecordId = processRecordId;
    }

    @Basic
    @Column(name = "newId")
    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    @Basic
    @Column(name = "invesId")
    public Integer getInvesId() {
        return invesId;
    }

    public void setInvesId(Integer invesId) {
        this.invesId = invesId;
    }

    @Basic
    @Column(name = "invesSiteId")
    public Integer getInvesSiteId() {
        return invesSiteId;
    }

    public void setInvesSiteId(Integer invesSiteId) {
        this.invesSiteId = invesSiteId;
    }

    @Basic
    @Column(name = "powerId")
    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Basic
    @Column(name = "exId")
    public Integer getExId() {
        return exId;
    }

    public void setExId(Integer exId) {
        this.exId = exId;
    }

    @Basic
    @Column(name = "replyId")
    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    @Basic
    @Column(name = "costId")
    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    @Basic
    @Column(name = "payId")
    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "traceId")
    public Integer getTraceId() {
        return traceId;
    }

    public void setTraceId(Integer traceId) {
        this.traceId = traceId;
    }

    @Basic
    @Column(name = "designFileId")
    public Integer getDesignFileId() {
        return designFileId;
    }

    public void setDesignFileId(Integer designFileId) {
        this.designFileId = designFileId;
    }

    @Basic
    @Column(name = "checkId")
    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "insId")
    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Basic
    @Column(name = "lotId")
    public Integer getLotId() {
        return lotId;
    }

    public void setLotId(Integer lotId) {
        this.lotId = lotId;
    }

    @Basic
    @Column(name = "checkInfoId")
    public Integer getCheckInfoId() {
        return checkInfoId;
    }

    public void setCheckInfoId(Integer checkInfoId) {
        this.checkInfoId = checkInfoId;
    }

    @Basic
    @Column(name = "refileId")
    public Integer getRefileId() {
        return refileId;
    }

    public void setRefileId(Integer refileId) {
        this.refileId = refileId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcessRecord that = (ProcessRecord) o;

        if (processRecordId != that.processRecordId) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;
        if (invesId != null ? !invesId.equals(that.invesId) : that.invesId != null) return false;
        if (invesSiteId != null ? !invesSiteId.equals(that.invesSiteId) : that.invesSiteId != null) return false;
        if (powerId != null ? !powerId.equals(that.powerId) : that.powerId != null) return false;
        if (exId != null ? !exId.equals(that.exId) : that.exId != null) return false;
        if (replyId != null ? !replyId.equals(that.replyId) : that.replyId != null) return false;
        if (costId != null ? !costId.equals(that.costId) : that.costId != null) return false;
        if (payId != null ? !payId.equals(that.payId) : that.payId != null) return false;
        if (traceId != null ? !traceId.equals(that.traceId) : that.traceId != null) return false;
        if (designFileId != null ? !designFileId.equals(that.designFileId) : that.designFileId != null) return false;
        if (checkId != null ? !checkId.equals(that.checkId) : that.checkId != null) return false;
        if (insId != null ? !insId.equals(that.insId) : that.insId != null) return false;
        if (lotId != null ? !lotId.equals(that.lotId) : that.lotId != null) return false;
        if (checkInfoId != null ? !checkInfoId.equals(that.checkInfoId) : that.checkInfoId != null) return false;
        if (refileId != null ? !refileId.equals(that.refileId) : that.refileId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processRecordId;
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (invesId != null ? invesId.hashCode() : 0);
        result = 31 * result + (invesSiteId != null ? invesSiteId.hashCode() : 0);
        result = 31 * result + (powerId != null ? powerId.hashCode() : 0);
        result = 31 * result + (exId != null ? exId.hashCode() : 0);
        result = 31 * result + (replyId != null ? replyId.hashCode() : 0);
        result = 31 * result + (costId != null ? costId.hashCode() : 0);
        result = 31 * result + (payId != null ? payId.hashCode() : 0);
        result = 31 * result + (traceId != null ? traceId.hashCode() : 0);
        result = 31 * result + (designFileId != null ? designFileId.hashCode() : 0);
        result = 31 * result + (checkId != null ? checkId.hashCode() : 0);
        result = 31 * result + (insId != null ? insId.hashCode() : 0);
        result = 31 * result + (lotId != null ? lotId.hashCode() : 0);
        result = 31 * result + (checkInfoId != null ? checkInfoId.hashCode() : 0);
        result = 31 * result + (refileId != null ? refileId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

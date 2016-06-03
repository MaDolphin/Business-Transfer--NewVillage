package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by 珏 on 2016/6/3.
 */
@Entity
public class Examination {
    private int exId;
    private String exPerId;
    private Timestamp exTime;
    private String exResult;
    private String exOpinion;
    private Timestamp createTime;
    private Integer newId;
    private String status;

    @Id
    @Column(name = "exId")
    public int getExId() {
        return exId;
    }

    public void setExId(int exId) {
        this.exId = exId;
    }

    @Basic
    @Column(name = "exPerId")
    public String getExPerId() {
        return exPerId;
    }

    public void setExPerId(String exPerId) {
        this.exPerId = exPerId;
    }

    @Basic
    @Column(name = "exTime")
    public Timestamp getExTime() {
        return exTime;
    }

    public void setExTime(Timestamp exTime) {
        this.exTime = exTime;
    }

    @Basic
    @Column(name = "exResult")
    public String getExResult() {
        return exResult;
    }

    public void setExResult(String exResult) {
        this.exResult = exResult;
    }

    @Basic
    @Column(name = "exOpinion")
    public String getExOpinion() {
        return exOpinion;
    }

    public void setExOpinion(String exOpinion) {
        this.exOpinion = exOpinion;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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

        Examination that = (Examination) o;

        if (exId != that.exId) return false;
        if (exPerId != null ? !exPerId.equals(that.exPerId) : that.exPerId != null) return false;
        if (exTime != null ? !exTime.equals(that.exTime) : that.exTime != null) return false;
        if (exResult != null ? !exResult.equals(that.exResult) : that.exResult != null) return false;
        if (exOpinion != null ? !exOpinion.equals(that.exOpinion) : that.exOpinion != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = exId;
        result = 31 * result + (exPerId != null ? exPerId.hashCode() : 0);
        result = 31 * result + (exTime != null ? exTime.hashCode() : 0);
        result = 31 * result + (exResult != null ? exResult.hashCode() : 0);
        result = 31 * result + (exOpinion != null ? exOpinion.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

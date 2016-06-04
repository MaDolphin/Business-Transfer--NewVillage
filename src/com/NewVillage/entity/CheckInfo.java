package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Brown on 2016/6/4.
 */
@Entity
public class CheckInfo {
    private int checkInfoId;
    private Date checkInfoTime;
    private String qualified;
    private Integer checkNum;
    private Timestamp createTime;
    private Integer newId;
    private String status;
    private Integer checkInfoerId;

    @Id
    @Column(name = "checkInfoId", nullable = false)
    public int getCheckInfoId() {
        return checkInfoId;
    }

    public void setCheckInfoId(int checkInfoId) {
        this.checkInfoId = checkInfoId;
    }

    @Basic
    @Column(name = "checkInfoTime", nullable = true)
    public Date getCheckInfoTime() {
        return checkInfoTime;
    }

    public void setCheckInfoTime(Date checkInfoTime) {
        this.checkInfoTime = checkInfoTime;
    }

    @Basic
    @Column(name = "qualified", nullable = true, length = 100)
    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    @Basic
    @Column(name = "checkNum", nullable = true)
    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "newId", nullable = true)
    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "checkInfoerId", nullable = true)
    public Integer getCheckInfoerId() {
        return checkInfoerId;
    }

    public void setCheckInfoerId(Integer checkInfoerId) {
        this.checkInfoerId = checkInfoerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckInfo checkInfo = (CheckInfo) o;

        if (checkInfoId != checkInfo.checkInfoId) return false;
        if (checkInfoTime != null ? !checkInfoTime.equals(checkInfo.checkInfoTime) : checkInfo.checkInfoTime != null)
            return false;
        if (qualified != null ? !qualified.equals(checkInfo.qualified) : checkInfo.qualified != null) return false;
        if (checkNum != null ? !checkNum.equals(checkInfo.checkNum) : checkInfo.checkNum != null) return false;
        if (createTime != null ? !createTime.equals(checkInfo.createTime) : checkInfo.createTime != null) return false;
        if (newId != null ? !newId.equals(checkInfo.newId) : checkInfo.newId != null) return false;
        if (status != null ? !status.equals(checkInfo.status) : checkInfo.status != null) return false;
        if (checkInfoerId != null ? !checkInfoerId.equals(checkInfo.checkInfoerId) : checkInfo.checkInfoerId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkInfoId;
        result = 31 * result + (checkInfoTime != null ? checkInfoTime.hashCode() : 0);
        result = 31 * result + (qualified != null ? qualified.hashCode() : 0);
        result = 31 * result + (checkNum != null ? checkNum.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (checkInfoerId != null ? checkInfoerId.hashCode() : 0);
        return result;
    }
}

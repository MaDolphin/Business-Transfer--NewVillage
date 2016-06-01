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
public class Check {
    private int checkId;
    private String checkPerId;
    private Timestamp checkTime;
    private String checkContent;
    private Integer checkNum;
    private String chenckResult;
    private Timestamp createTime;

    @Id
    @Column(name = "checkId", nullable = false)
    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    @Basic
    @Column(name = "checkPerId", nullable = true, length = 10)
    public String getCheckPerId() {
        return checkPerId;
    }

    public void setCheckPerId(String checkPerId) {
        this.checkPerId = checkPerId;
    }

    @Basic
    @Column(name = "checkTime", nullable = false)
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "checkContent", nullable = true, length = -1)
    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
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
    @Column(name = "chenckResult", nullable = true, length = -1)
    public String getChenckResult() {
        return chenckResult;
    }

    public void setChenckResult(String chenckResult) {
        this.chenckResult = chenckResult;
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

        Check check = (Check) o;

        if (checkId != check.checkId) return false;
        if (checkPerId != null ? !checkPerId.equals(check.checkPerId) : check.checkPerId != null) return false;
        if (checkTime != null ? !checkTime.equals(check.checkTime) : check.checkTime != null) return false;
        if (checkContent != null ? !checkContent.equals(check.checkContent) : check.checkContent != null) return false;
        if (checkNum != null ? !checkNum.equals(check.checkNum) : check.checkNum != null) return false;
        if (chenckResult != null ? !chenckResult.equals(check.chenckResult) : check.chenckResult != null) return false;
        if (createTime != null ? !createTime.equals(check.createTime) : check.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkId;
        result = 31 * result + (checkPerId != null ? checkPerId.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (checkContent != null ? checkContent.hashCode() : 0);
        result = 31 * result + (checkNum != null ? checkNum.hashCode() : 0);
        result = 31 * result + (chenckResult != null ? chenckResult.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

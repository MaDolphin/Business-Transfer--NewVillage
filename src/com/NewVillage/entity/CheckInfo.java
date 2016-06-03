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
public class CheckInfo {
    private int checkInfoId;
    private Timestamp checkInfoTime;
    private String qualified;
    private Integer checkNum;
    private Timestamp createTime;

    @Id
    @Column(name = "checkInfoId")
    public int getCheckInfoId() {
        return checkInfoId;
    }

    public void setCheckInfoId(int checkInfoId) {
        this.checkInfoId = checkInfoId;
    }

    @Basic
    @Column(name = "checkInfoTime")
    public Timestamp getCheckInfoTime() {
        return checkInfoTime;
    }

    public void setCheckInfoTime(Timestamp checkInfoTime) {
        this.checkInfoTime = checkInfoTime;
    }

    @Basic
    @Column(name = "qualified")
    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    @Basic
    @Column(name = "checkNum")
    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    @Basic
    @Column(name = "createTime")
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

        CheckInfo checkInfo = (CheckInfo) o;

        if (checkInfoId != checkInfo.checkInfoId) return false;
        if (checkInfoTime != null ? !checkInfoTime.equals(checkInfo.checkInfoTime) : checkInfo.checkInfoTime != null)
            return false;
        if (qualified != null ? !qualified.equals(checkInfo.qualified) : checkInfo.qualified != null) return false;
        if (checkNum != null ? !checkNum.equals(checkInfo.checkNum) : checkInfo.checkNum != null) return false;
        if (createTime != null ? !createTime.equals(checkInfo.createTime) : checkInfo.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkInfoId;
        result = 31 * result + (checkInfoTime != null ? checkInfoTime.hashCode() : 0);
        result = 31 * result + (qualified != null ? qualified.hashCode() : 0);
        result = 31 * result + (checkNum != null ? checkNum.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

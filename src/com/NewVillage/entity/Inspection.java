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
public class Inspection {
    private int insId;
    private String insUnit;
    private Integer insPerId;
    private Integer accPerId;
    private Timestamp accTime;
    private String insRequire;
    private Timestamp insTime;
    private Integer insNum;
    private Timestamp createTime;

    @Id
    @Column(name = "insId", nullable = false)
    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    @Basic
    @Column(name = "insUnit", nullable = true, length = 1)
    public String getInsUnit() {
        return insUnit;
    }

    public void setInsUnit(String insUnit) {
        this.insUnit = insUnit;
    }

    @Basic
    @Column(name = "insPerId", nullable = true)
    public Integer getInsPerId() {
        return insPerId;
    }

    public void setInsPerId(Integer insPerId) {
        this.insPerId = insPerId;
    }

    @Basic
    @Column(name = "accPerId", nullable = true)
    public Integer getAccPerId() {
        return accPerId;
    }

    public void setAccPerId(Integer accPerId) {
        this.accPerId = accPerId;
    }

    @Basic
    @Column(name = "accTime", nullable = false)
    public Timestamp getAccTime() {
        return accTime;
    }

    public void setAccTime(Timestamp accTime) {
        this.accTime = accTime;
    }

    @Basic
    @Column(name = "insRequire", nullable = true, length = -1)
    public String getInsRequire() {
        return insRequire;
    }

    public void setInsRequire(String insRequire) {
        this.insRequire = insRequire;
    }

    @Basic
    @Column(name = "insTime", nullable = false)
    public Timestamp getInsTime() {
        return insTime;
    }

    public void setInsTime(Timestamp insTime) {
        this.insTime = insTime;
    }

    @Basic
    @Column(name = "insNum", nullable = true)
    public Integer getInsNum() {
        return insNum;
    }

    public void setInsNum(Integer insNum) {
        this.insNum = insNum;
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

        Inspection that = (Inspection) o;

        if (insId != that.insId) return false;
        if (insUnit != null ? !insUnit.equals(that.insUnit) : that.insUnit != null) return false;
        if (insPerId != null ? !insPerId.equals(that.insPerId) : that.insPerId != null) return false;
        if (accPerId != null ? !accPerId.equals(that.accPerId) : that.accPerId != null) return false;
        if (accTime != null ? !accTime.equals(that.accTime) : that.accTime != null) return false;
        if (insRequire != null ? !insRequire.equals(that.insRequire) : that.insRequire != null) return false;
        if (insTime != null ? !insTime.equals(that.insTime) : that.insTime != null) return false;
        if (insNum != null ? !insNum.equals(that.insNum) : that.insNum != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = insId;
        result = 31 * result + (insUnit != null ? insUnit.hashCode() : 0);
        result = 31 * result + (insPerId != null ? insPerId.hashCode() : 0);
        result = 31 * result + (accPerId != null ? accPerId.hashCode() : 0);
        result = 31 * result + (accTime != null ? accTime.hashCode() : 0);
        result = 31 * result + (insRequire != null ? insRequire.hashCode() : 0);
        result = 31 * result + (insTime != null ? insTime.hashCode() : 0);
        result = 31 * result + (insNum != null ? insNum.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

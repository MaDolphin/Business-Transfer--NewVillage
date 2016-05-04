package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by xfcq on 2016/5/4.
 */
@Entity
public class DesignFileCheck {
    private int designFileId;
    private String designUnit;
    private String designLevel;
    private String submittedUnit;
    private Timestamp submittedTime;
    private Integer accPerId;
    private Integer checkPerId;
    private Timestamp checkTime;
    private Integer civilDrawingNum;
    private Integer lineDrawingNum;
    private Integer eleDrawingNum;
    private String checkOpinion;
    private Integer registerPerId;
    private Timestamp registerTime;
    private Timestamp createTime;

    @Id
    @Column(name = "designFileId", nullable = false)
    public int getDesignFileId() {
        return designFileId;
    }

    public void setDesignFileId(int designFileId) {
        this.designFileId = designFileId;
    }

    @Basic
    @Column(name = "designUnit", nullable = true, length = 50)
    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit;
    }

    @Basic
    @Column(name = "designLevel", nullable = true, length = 50)
    public String getDesignLevel() {
        return designLevel;
    }

    public void setDesignLevel(String designLevel) {
        this.designLevel = designLevel;
    }

    @Basic
    @Column(name = "submittedUnit", nullable = true, length = 50)
    public String getSubmittedUnit() {
        return submittedUnit;
    }

    public void setSubmittedUnit(String submittedUnit) {
        this.submittedUnit = submittedUnit;
    }

    @Basic
    @Column(name = "submittedTime", nullable = false)
    public Timestamp getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(Timestamp submittedTime) {
        this.submittedTime = submittedTime;
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
    @Column(name = "checkPerId", nullable = true)
    public Integer getCheckPerId() {
        return checkPerId;
    }

    public void setCheckPerId(Integer checkPerId) {
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
    @Column(name = "civilDrawingNum", nullable = true)
    public Integer getCivilDrawingNum() {
        return civilDrawingNum;
    }

    public void setCivilDrawingNum(Integer civilDrawingNum) {
        this.civilDrawingNum = civilDrawingNum;
    }

    @Basic
    @Column(name = "lineDrawingNum", nullable = true)
    public Integer getLineDrawingNum() {
        return lineDrawingNum;
    }

    public void setLineDrawingNum(Integer lineDrawingNum) {
        this.lineDrawingNum = lineDrawingNum;
    }

    @Basic
    @Column(name = "eleDrawingNum", nullable = true)
    public Integer getEleDrawingNum() {
        return eleDrawingNum;
    }

    public void setEleDrawingNum(Integer eleDrawingNum) {
        this.eleDrawingNum = eleDrawingNum;
    }

    @Basic
    @Column(name = "checkOpinion", nullable = true, length = -1)
    public String getCheckOpinion() {
        return checkOpinion;
    }

    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion;
    }

    @Basic
    @Column(name = "registerPerId", nullable = true)
    public Integer getRegisterPerId() {
        return registerPerId;
    }

    public void setRegisterPerId(Integer registerPerId) {
        this.registerPerId = registerPerId;
    }

    @Basic
    @Column(name = "registerTime", nullable = false)
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
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

        DesignFileCheck that = (DesignFileCheck) o;

        if (designFileId != that.designFileId) return false;
        if (designUnit != null ? !designUnit.equals(that.designUnit) : that.designUnit != null) return false;
        if (designLevel != null ? !designLevel.equals(that.designLevel) : that.designLevel != null) return false;
        if (submittedUnit != null ? !submittedUnit.equals(that.submittedUnit) : that.submittedUnit != null)
            return false;
        if (submittedTime != null ? !submittedTime.equals(that.submittedTime) : that.submittedTime != null)
            return false;
        if (accPerId != null ? !accPerId.equals(that.accPerId) : that.accPerId != null) return false;
        if (checkPerId != null ? !checkPerId.equals(that.checkPerId) : that.checkPerId != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (civilDrawingNum != null ? !civilDrawingNum.equals(that.civilDrawingNum) : that.civilDrawingNum != null)
            return false;
        if (lineDrawingNum != null ? !lineDrawingNum.equals(that.lineDrawingNum) : that.lineDrawingNum != null)
            return false;
        if (eleDrawingNum != null ? !eleDrawingNum.equals(that.eleDrawingNum) : that.eleDrawingNum != null)
            return false;
        if (checkOpinion != null ? !checkOpinion.equals(that.checkOpinion) : that.checkOpinion != null) return false;
        if (registerPerId != null ? !registerPerId.equals(that.registerPerId) : that.registerPerId != null)
            return false;
        if (registerTime != null ? !registerTime.equals(that.registerTime) : that.registerTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = designFileId;
        result = 31 * result + (designUnit != null ? designUnit.hashCode() : 0);
        result = 31 * result + (designLevel != null ? designLevel.hashCode() : 0);
        result = 31 * result + (submittedUnit != null ? submittedUnit.hashCode() : 0);
        result = 31 * result + (submittedTime != null ? submittedTime.hashCode() : 0);
        result = 31 * result + (accPerId != null ? accPerId.hashCode() : 0);
        result = 31 * result + (checkPerId != null ? checkPerId.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (civilDrawingNum != null ? civilDrawingNum.hashCode() : 0);
        result = 31 * result + (lineDrawingNum != null ? lineDrawingNum.hashCode() : 0);
        result = 31 * result + (eleDrawingNum != null ? eleDrawingNum.hashCode() : 0);
        result = 31 * result + (checkOpinion != null ? checkOpinion.hashCode() : 0);
        result = 31 * result + (registerPerId != null ? registerPerId.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

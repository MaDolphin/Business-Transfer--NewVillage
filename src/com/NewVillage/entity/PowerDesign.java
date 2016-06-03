package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Dream on 2016/6/3.
 */
@Entity
public class PowerDesign {
    private int powerId;
    private String powerQuality;
    private String powerType;
    private String powerSupplyMode;
    private Integer powerVoltage;
    private Integer powerCapacity;
    private String powerAddress;
    private Integer powerNum;
    private Integer powerLineNum;
    private String powerStation;
    private String powerLine;
    private String powerInMode;
    private Integer powerPoleId;
    private String checkPoint;
    private String protectMode;
    private Integer powerDesignDraw;
    private Integer checkPointDraw;
    private Timestamp createTime;
    private Integer powerDesignPerId;
    private String status;
    private Integer newId;

    @Id
    @Column(name = "powerId", nullable = false)
    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }

    @Basic
    @Column(name = "powerQuality", nullable = true, length = 10)
    public String getPowerQuality() {
        return powerQuality;
    }

    public void setPowerQuality(String powerQuality) {
        this.powerQuality = powerQuality;
    }

    @Basic
    @Column(name = "powerType", nullable = true, length = 10)
    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Basic
    @Column(name = "powerSupplyMode", nullable = true, length = 10)
    public String getPowerSupplyMode() {
        return powerSupplyMode;
    }

    public void setPowerSupplyMode(String powerSupplyMode) {
        this.powerSupplyMode = powerSupplyMode;
    }

    @Basic
    @Column(name = "powerVoltage", nullable = true)
    public Integer getPowerVoltage() {
        return powerVoltage;
    }

    public void setPowerVoltage(Integer powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    @Basic
    @Column(name = "powerCapacity", nullable = true)
    public Integer getPowerCapacity() {
        return powerCapacity;
    }

    public void setPowerCapacity(Integer powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

    @Basic
    @Column(name = "powerAddress", nullable = true, length = 50)
    public String getPowerAddress() {
        return powerAddress;
    }

    public void setPowerAddress(String powerAddress) {
        this.powerAddress = powerAddress;
    }

    @Basic
    @Column(name = "powerNum", nullable = true)
    public Integer getPowerNum() {
        return powerNum;
    }

    public void setPowerNum(Integer powerNum) {
        this.powerNum = powerNum;
    }

    @Basic
    @Column(name = "powerLineNum", nullable = true)
    public Integer getPowerLineNum() {
        return powerLineNum;
    }

    public void setPowerLineNum(Integer powerLineNum) {
        this.powerLineNum = powerLineNum;
    }

    @Basic
    @Column(name = "powerStation", nullable = true, length = 50)
    public String getPowerStation() {
        return powerStation;
    }

    public void setPowerStation(String powerStation) {
        this.powerStation = powerStation;
    }

    @Basic
    @Column(name = "powerLine", nullable = true, length = 50)
    public String getPowerLine() {
        return powerLine;
    }

    public void setPowerLine(String powerLine) {
        this.powerLine = powerLine;
    }

    @Basic
    @Column(name = "powerInMode", nullable = true, length = 10)
    public String getPowerInMode() {
        return powerInMode;
    }

    public void setPowerInMode(String powerInMode) {
        this.powerInMode = powerInMode;
    }

    @Basic
    @Column(name = "powerPoleId", nullable = true)
    public Integer getPowerPoleId() {
        return powerPoleId;
    }

    public void setPowerPoleId(Integer powerPoleId) {
        this.powerPoleId = powerPoleId;
    }

    @Basic
    @Column(name = "checkPoint", nullable = true, length = 10)
    public String getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
    }

    @Basic
    @Column(name = "protectMode", nullable = true, length = 10)
    public String getProtectMode() {
        return protectMode;
    }

    public void setProtectMode(String protectMode) {
        this.protectMode = protectMode;
    }

    @Basic
    @Column(name = "powerDesignDraw", nullable = true)
    public Integer getPowerDesignDraw() {
        return powerDesignDraw;
    }

    public void setPowerDesignDraw(Integer powerDesignDraw) {
        this.powerDesignDraw = powerDesignDraw;
    }

    @Basic
    @Column(name = "checkPointDraw", nullable = true)
    public Integer getCheckPointDraw() {
        return checkPointDraw;
    }

    public void setCheckPointDraw(Integer checkPointDraw) {
        this.checkPointDraw = checkPointDraw;
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
    @Column(name = "powerDesignPerId", nullable = true)
    public Integer getPowerDesignPerId() {
        return powerDesignPerId;
    }

    public void setPowerDesignPerId(Integer powerDesignPerId) {
        this.powerDesignPerId = powerDesignPerId;
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
    @Column(name = "newId", nullable = true)
    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowerDesign that = (PowerDesign) o;

        if (powerId != that.powerId) return false;
        if (powerQuality != null ? !powerQuality.equals(that.powerQuality) : that.powerQuality != null) return false;
        if (powerType != null ? !powerType.equals(that.powerType) : that.powerType != null) return false;
        if (powerSupplyMode != null ? !powerSupplyMode.equals(that.powerSupplyMode) : that.powerSupplyMode != null)
            return false;
        if (powerVoltage != null ? !powerVoltage.equals(that.powerVoltage) : that.powerVoltage != null) return false;
        if (powerCapacity != null ? !powerCapacity.equals(that.powerCapacity) : that.powerCapacity != null)
            return false;
        if (powerAddress != null ? !powerAddress.equals(that.powerAddress) : that.powerAddress != null) return false;
        if (powerNum != null ? !powerNum.equals(that.powerNum) : that.powerNum != null) return false;
        if (powerLineNum != null ? !powerLineNum.equals(that.powerLineNum) : that.powerLineNum != null) return false;
        if (powerStation != null ? !powerStation.equals(that.powerStation) : that.powerStation != null) return false;
        if (powerLine != null ? !powerLine.equals(that.powerLine) : that.powerLine != null) return false;
        if (powerInMode != null ? !powerInMode.equals(that.powerInMode) : that.powerInMode != null) return false;
        if (powerPoleId != null ? !powerPoleId.equals(that.powerPoleId) : that.powerPoleId != null) return false;
        if (checkPoint != null ? !checkPoint.equals(that.checkPoint) : that.checkPoint != null) return false;
        if (protectMode != null ? !protectMode.equals(that.protectMode) : that.protectMode != null) return false;
        if (powerDesignDraw != null ? !powerDesignDraw.equals(that.powerDesignDraw) : that.powerDesignDraw != null)
            return false;
        if (checkPointDraw != null ? !checkPointDraw.equals(that.checkPointDraw) : that.checkPointDraw != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (powerDesignPerId != null ? !powerDesignPerId.equals(that.powerDesignPerId) : that.powerDesignPerId != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = powerId;
        result = 31 * result + (powerQuality != null ? powerQuality.hashCode() : 0);
        result = 31 * result + (powerType != null ? powerType.hashCode() : 0);
        result = 31 * result + (powerSupplyMode != null ? powerSupplyMode.hashCode() : 0);
        result = 31 * result + (powerVoltage != null ? powerVoltage.hashCode() : 0);
        result = 31 * result + (powerCapacity != null ? powerCapacity.hashCode() : 0);
        result = 31 * result + (powerAddress != null ? powerAddress.hashCode() : 0);
        result = 31 * result + (powerNum != null ? powerNum.hashCode() : 0);
        result = 31 * result + (powerLineNum != null ? powerLineNum.hashCode() : 0);
        result = 31 * result + (powerStation != null ? powerStation.hashCode() : 0);
        result = 31 * result + (powerLine != null ? powerLine.hashCode() : 0);
        result = 31 * result + (powerInMode != null ? powerInMode.hashCode() : 0);
        result = 31 * result + (powerPoleId != null ? powerPoleId.hashCode() : 0);
        result = 31 * result + (checkPoint != null ? checkPoint.hashCode() : 0);
        result = 31 * result + (protectMode != null ? protectMode.hashCode() : 0);
        result = 31 * result + (powerDesignDraw != null ? powerDesignDraw.hashCode() : 0);
        result = 31 * result + (checkPointDraw != null ? checkPointDraw.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (powerDesignPerId != null ? powerDesignPerId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        return result;
    }
}

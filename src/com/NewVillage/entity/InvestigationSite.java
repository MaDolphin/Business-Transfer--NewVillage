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
public class InvestigationSite {
    private int invesSiteId;
    private Integer appCapacity;
    private String supplyMode;
    private String voltageLevel;
    private String powerComp;
    private String invesSituation;
    private Integer powerId;
    private Integer invesPerId;
    private Timestamp runTime;
    private Timestamp createTime;

    @Id
    @Column(name = "invesSiteId", nullable = false)
    public int getInvesSiteId() {
        return invesSiteId;
    }

    public void setInvesSiteId(int invesSiteId) {
        this.invesSiteId = invesSiteId;
    }

    @Basic
    @Column(name = "appCapacity", nullable = true)
    public Integer getAppCapacity() {
        return appCapacity;
    }

    public void setAppCapacity(Integer appCapacity) {
        this.appCapacity = appCapacity;
    }

    @Basic
    @Column(name = "supplyMode", nullable = true, length = 10)
    public String getSupplyMode() {
        return supplyMode;
    }

    public void setSupplyMode(String supplyMode) {
        this.supplyMode = supplyMode;
    }

    @Basic
    @Column(name = "voltageLevel", nullable = true, length = 10)
    public String getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(String voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    @Basic
    @Column(name = "powerComp", nullable = true, length = 50)
    public String getPowerComp() {
        return powerComp;
    }

    public void setPowerComp(String powerComp) {
        this.powerComp = powerComp;
    }

    @Basic
    @Column(name = "invesSituation", nullable = true, length = 50)
    public String getInvesSituation() {
        return invesSituation;
    }

    public void setInvesSituation(String invesSituation) {
        this.invesSituation = invesSituation;
    }

    @Basic
    @Column(name = "powerId", nullable = true)
    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    @Basic
    @Column(name = "invesPerId", nullable = true)
    public Integer getInvesPerId() {
        return invesPerId;
    }

    public void setInvesPerId(Integer invesPerId) {
        this.invesPerId = invesPerId;
    }

    @Basic
    @Column(name = "RunTime", nullable = false)
    public Timestamp getRunTime() {
        return runTime;
    }

    public void setRunTime(Timestamp runTime) {
        this.runTime = runTime;
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

        InvestigationSite that = (InvestigationSite) o;

        if (invesSiteId != that.invesSiteId) return false;
        if (appCapacity != null ? !appCapacity.equals(that.appCapacity) : that.appCapacity != null) return false;
        if (supplyMode != null ? !supplyMode.equals(that.supplyMode) : that.supplyMode != null) return false;
        if (voltageLevel != null ? !voltageLevel.equals(that.voltageLevel) : that.voltageLevel != null) return false;
        if (powerComp != null ? !powerComp.equals(that.powerComp) : that.powerComp != null) return false;
        if (invesSituation != null ? !invesSituation.equals(that.invesSituation) : that.invesSituation != null)
            return false;
        if (powerId != null ? !powerId.equals(that.powerId) : that.powerId != null) return false;
        if (invesPerId != null ? !invesPerId.equals(that.invesPerId) : that.invesPerId != null) return false;
        if (runTime != null ? !runTime.equals(that.runTime) : that.runTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invesSiteId;
        result = 31 * result + (appCapacity != null ? appCapacity.hashCode() : 0);
        result = 31 * result + (supplyMode != null ? supplyMode.hashCode() : 0);
        result = 31 * result + (voltageLevel != null ? voltageLevel.hashCode() : 0);
        result = 31 * result + (powerComp != null ? powerComp.hashCode() : 0);
        result = 31 * result + (invesSituation != null ? invesSituation.hashCode() : 0);
        result = 31 * result + (powerId != null ? powerId.hashCode() : 0);
        result = 31 * result + (invesPerId != null ? invesPerId.hashCode() : 0);
        result = 31 * result + (runTime != null ? runTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}

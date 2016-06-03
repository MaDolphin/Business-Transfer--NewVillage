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
public class InvestigationWork {
    private int invesId;
    private Integer newId;
    private Integer invesPerId;
    private Timestamp createTime;
    private Timestamp invesTime;
    private String status;

    @Id
    @Column(name = "invesId")
    public int getInvesId() {
        return invesId;
    }

    public void setInvesId(int invesId) {
        this.invesId = invesId;
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
    @Column(name = "invesPerId")
    public Integer getInvesPerId() {
        return invesPerId;
    }

    public void setInvesPerId(Integer invesPerId) {
        this.invesPerId = invesPerId;
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
    @Column(name = "InvesTime")
    public Timestamp getInvesTime() {
        return invesTime;
    }

    public void setInvesTime(Timestamp invesTime) {
        this.invesTime = invesTime;
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

        InvestigationWork that = (InvestigationWork) o;

        if (invesId != that.invesId) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;
        if (invesPerId != null ? !invesPerId.equals(that.invesPerId) : that.invesPerId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (invesTime != null ? !invesTime.equals(that.invesTime) : that.invesTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invesId;
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (invesPerId != null ? invesPerId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (invesTime != null ? invesTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by xfcq on 2016/6/3.
 */
@Entity
public class BusinessCost {
    private int costId;
    private String costItem;
    private Double charge;
    private Double refund;
    private Timestamp createTime;
    private Integer newId;
    private String status;
    private Integer payPrecent;

    @Id
    @Column(name = "costId", nullable = false)
    public int getCostId() {
        return costId;
    }

    public void setCostId(int costId) {
        this.costId = costId;
    }

    @Basic
    @Column(name = "costItem", nullable = true, length = 10)
    public String getCostItem() {
        return costItem;
    }

    public void setCostItem(String costItem) {
        this.costItem = costItem;
    }

    @Basic
    @Column(name = "Charge", nullable = true, precision = 0)
    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    @Basic
    @Column(name = "Refund", nullable = true, precision = 0)
    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
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
    @Column(name = "payPrecent", nullable = true)
    public Integer getPayPrecent() {
        return payPrecent;
    }

    public void setPayPrecent(Integer payPrecent) {
        this.payPrecent = payPrecent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessCost that = (BusinessCost) o;

        if (costId != that.costId) return false;
        if (costItem != null ? !costItem.equals(that.costItem) : that.costItem != null) return false;
        if (charge != null ? !charge.equals(that.charge) : that.charge != null) return false;
        if (refund != null ? !refund.equals(that.refund) : that.refund != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (payPrecent != null ? !payPrecent.equals(that.payPrecent) : that.payPrecent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = costId;
        result = 31 * result + (costItem != null ? costItem.hashCode() : 0);
        result = 31 * result + (charge != null ? charge.hashCode() : 0);
        result = 31 * result + (refund != null ? refund.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (payPrecent != null ? payPrecent.hashCode() : 0);
        return result;
    }
}

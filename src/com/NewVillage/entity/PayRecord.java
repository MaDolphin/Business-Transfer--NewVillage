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
public class PayRecord {
    private int payId;
    private Integer newId;
    private Integer payPerId;
    private String payDep;
    private Timestamp payTime;
    private Double payment;
    private Double sumPay;
    private Double unpaidAmount;
    private Integer invioiceId;
    private Timestamp createTime;
    private String status;

    @Id
    @Column(name = "payId", nullable = false)
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
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
    @Column(name = "payPerId", nullable = true)
    public Integer getPayPerId() {
        return payPerId;
    }

    public void setPayPerId(Integer payPerId) {
        this.payPerId = payPerId;
    }

    @Basic
    @Column(name = "payDep", nullable = true, length = 10)
    public String getPayDep() {
        return payDep;
    }

    public void setPayDep(String payDep) {
        this.payDep = payDep;
    }

    @Basic
    @Column(name = "payTime", nullable = false)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "Payment", nullable = true, precision = 0)
    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "sumPay", nullable = true, precision = 0)
    public Double getSumPay() {
        return sumPay;
    }

    public void setSumPay(Double sumPay) {
        this.sumPay = sumPay;
    }

    @Basic
    @Column(name = "unpaidAmount", nullable = true, precision = 0)
    public Double getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(Double unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    @Basic
    @Column(name = "invioiceId", nullable = true)
    public Integer getInvioiceId() {
        return invioiceId;
    }

    public void setInvioiceId(Integer invioiceId) {
        this.invioiceId = invioiceId;
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
    @Column(name = "status", nullable = true, length = 10)
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

        PayRecord payRecord = (PayRecord) o;

        if (payId != payRecord.payId) return false;
        if (newId != null ? !newId.equals(payRecord.newId) : payRecord.newId != null) return false;
        if (payPerId != null ? !payPerId.equals(payRecord.payPerId) : payRecord.payPerId != null) return false;
        if (payDep != null ? !payDep.equals(payRecord.payDep) : payRecord.payDep != null) return false;
        if (payTime != null ? !payTime.equals(payRecord.payTime) : payRecord.payTime != null) return false;
        if (payment != null ? !payment.equals(payRecord.payment) : payRecord.payment != null) return false;
        if (sumPay != null ? !sumPay.equals(payRecord.sumPay) : payRecord.sumPay != null) return false;
        if (unpaidAmount != null ? !unpaidAmount.equals(payRecord.unpaidAmount) : payRecord.unpaidAmount != null)
            return false;
        if (invioiceId != null ? !invioiceId.equals(payRecord.invioiceId) : payRecord.invioiceId != null) return false;
        if (createTime != null ? !createTime.equals(payRecord.createTime) : payRecord.createTime != null) return false;
        if (status != null ? !status.equals(payRecord.status) : payRecord.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = payId;
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (payPerId != null ? payPerId.hashCode() : 0);
        result = 31 * result + (payDep != null ? payDep.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (sumPay != null ? sumPay.hashCode() : 0);
        result = 31 * result + (unpaidAmount != null ? unpaidAmount.hashCode() : 0);
        result = 31 * result + (invioiceId != null ? invioiceId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

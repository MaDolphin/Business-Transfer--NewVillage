package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xfcq on 2016/6/4.
 */
@Entity
public class Message {
    private int messId;
    private Integer empId;
    private Integer newId;
    private String refund;
    private String status;

    @Id
    @Column(name = "messId", nullable = false)
    public int getMessId() {
        return messId;
    }

    public void setMessId(int messId) {
        this.messId = messId;
    }

    @Basic
    @Column(name = "empId", nullable = true)
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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
    @Column(name = "Refund", nullable = true, length = -1)
    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
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

        Message message = (Message) o;

        if (messId != message.messId) return false;
        if (empId != null ? !empId.equals(message.empId) : message.empId != null) return false;
        if (newId != null ? !newId.equals(message.newId) : message.newId != null) return false;
        if (refund != null ? !refund.equals(message.refund) : message.refund != null) return false;
        if (status != null ? !status.equals(message.status) : message.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messId;
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (refund != null ? refund.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

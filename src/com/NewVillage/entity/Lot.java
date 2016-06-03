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
public class Lot {
    private int lotId;
    private String userName;
    private String address;
    private String type;
    private Integer capacity;
    private String userType;
    private Timestamp creatrTime;
    private Integer newId;
    private String status;

    @Id
    @Column(name = "lotId")
    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "capacity")
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "userType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "creatrTime")
    public Timestamp getCreatrTime() {
        return creatrTime;
    }

    public void setCreatrTime(Timestamp creatrTime) {
        this.creatrTime = creatrTime;
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

        Lot lot = (Lot) o;

        if (lotId != lot.lotId) return false;
        if (userName != null ? !userName.equals(lot.userName) : lot.userName != null) return false;
        if (address != null ? !address.equals(lot.address) : lot.address != null) return false;
        if (type != null ? !type.equals(lot.type) : lot.type != null) return false;
        if (capacity != null ? !capacity.equals(lot.capacity) : lot.capacity != null) return false;
        if (userType != null ? !userType.equals(lot.userType) : lot.userType != null) return false;
        if (creatrTime != null ? !creatrTime.equals(lot.creatrTime) : lot.creatrTime != null) return false;
        if (newId != null ? !newId.equals(lot.newId) : lot.newId != null) return false;
        if (status != null ? !status.equals(lot.status) : lot.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lotId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (creatrTime != null ? creatrTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

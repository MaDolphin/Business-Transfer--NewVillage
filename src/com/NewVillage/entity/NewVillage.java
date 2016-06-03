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
public class NewVillage {
    private int newId;
    private String vilName;
    private String adminArea;
    private String eleAddress;
    private Integer eleType;
    private Integer eleCapacity;
    private Integer residentNum;
    private String userName;
    private Integer userPtype;
    private String userPid;
    private String userTel;
    private Timestamp createTime;
    private Integer newVilPerId;
    private String status;

    @Id
    @Column(name = "newId", nullable = false)
    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    @Basic
    @Column(name = "vilName", nullable = true, length = 10)
    public String getVilName() {
        return vilName;
    }

    public void setVilName(String vilName) {
        this.vilName = vilName;
    }

    @Basic
    @Column(name = "adminArea", nullable = true, length = 10)
    public String getAdminArea() {
        return adminArea;
    }

    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea;
    }

    @Basic
    @Column(name = "eleAddress", nullable = true, length = 50)
    public String getEleAddress() {
        return eleAddress;
    }

    public void setEleAddress(String eleAddress) {
        this.eleAddress = eleAddress;
    }

    @Basic
    @Column(name = "eleType", nullable = true)
    public Integer getEleType() {
        return eleType;
    }

    public void setEleType(Integer eleType) {
        this.eleType = eleType;
    }

    @Basic
    @Column(name = "eleCapacity", nullable = true)
    public Integer getEleCapacity() {
        return eleCapacity;
    }

    public void setEleCapacity(Integer eleCapacity) {
        this.eleCapacity = eleCapacity;
    }

    @Basic
    @Column(name = "residentNum", nullable = true)
    public Integer getResidentNum() {
        return residentNum;
    }

    public void setResidentNum(Integer residentNum) {
        this.residentNum = residentNum;
    }

    @Basic
    @Column(name = "userName", nullable = true, length = 10)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userPtype", nullable = true)
    public Integer getUserPtype() {
        return userPtype;
    }

    public void setUserPtype(Integer userPtype) {
        this.userPtype = userPtype;
    }

    @Basic
    @Column(name = "userPid", nullable = true, length = 25)
    public String getUserPid() {
        return userPid;
    }

    public void setUserPid(String userPid) {
        this.userPid = userPid;
    }

    @Basic
    @Column(name = "userTel", nullable = true, length = 25)
    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
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
    @Column(name = "newVilPerId", nullable = true)
    public Integer getNewVilPerId() {
        return newVilPerId;
    }

    public void setNewVilPerId(Integer newVilPerId) {
        this.newVilPerId = newVilPerId;
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

        NewVillage that = (NewVillage) o;

        if (newId != that.newId) return false;
        if (vilName != null ? !vilName.equals(that.vilName) : that.vilName != null) return false;
        if (adminArea != null ? !adminArea.equals(that.adminArea) : that.adminArea != null) return false;
        if (eleAddress != null ? !eleAddress.equals(that.eleAddress) : that.eleAddress != null) return false;
        if (eleType != null ? !eleType.equals(that.eleType) : that.eleType != null) return false;
        if (eleCapacity != null ? !eleCapacity.equals(that.eleCapacity) : that.eleCapacity != null) return false;
        if (residentNum != null ? !residentNum.equals(that.residentNum) : that.residentNum != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPtype != null ? !userPtype.equals(that.userPtype) : that.userPtype != null) return false;
        if (userPid != null ? !userPid.equals(that.userPid) : that.userPid != null) return false;
        if (userTel != null ? !userTel.equals(that.userTel) : that.userTel != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (newVilPerId != null ? !newVilPerId.equals(that.newVilPerId) : that.newVilPerId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newId;
        result = 31 * result + (vilName != null ? vilName.hashCode() : 0);
        result = 31 * result + (adminArea != null ? adminArea.hashCode() : 0);
        result = 31 * result + (eleAddress != null ? eleAddress.hashCode() : 0);
        result = 31 * result + (eleType != null ? eleType.hashCode() : 0);
        result = 31 * result + (eleCapacity != null ? eleCapacity.hashCode() : 0);
        result = 31 * result + (residentNum != null ? residentNum.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPtype != null ? userPtype.hashCode() : 0);
        result = 31 * result + (userPid != null ? userPid.hashCode() : 0);
        result = 31 * result + (userTel != null ? userTel.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (newVilPerId != null ? newVilPerId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dream on 2016/6/3.
 */
@Entity
public class User {
    private int userId;
    private String userName;
    private Integer userPtype;
    private String userPid;
    private String userTel;
    private Double userTicket;
    private Integer userType;
    private Integer userLevel;
    private String userPwd;

    @Id
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "userTicket", nullable = true, precision = 0)
    public Double getUserTicket() {
        return userTicket;
    }

    public void setUserTicket(Double userTicket) {
        this.userTicket = userTicket;
    }

    @Basic
    @Column(name = "userType", nullable = true)
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "userLevel", nullable = true)
    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    @Basic
    @Column(name = "userPwd", nullable = true, length = 25)
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPtype != null ? !userPtype.equals(user.userPtype) : user.userPtype != null) return false;
        if (userPid != null ? !userPid.equals(user.userPid) : user.userPid != null) return false;
        if (userTel != null ? !userTel.equals(user.userTel) : user.userTel != null) return false;
        if (userTicket != null ? !userTicket.equals(user.userTicket) : user.userTicket != null) return false;
        if (userType != null ? !userType.equals(user.userType) : user.userType != null) return false;
        if (userLevel != null ? !userLevel.equals(user.userLevel) : user.userLevel != null) return false;
        if (userPwd != null ? !userPwd.equals(user.userPwd) : user.userPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPtype != null ? userPtype.hashCode() : 0);
        result = 31 * result + (userPid != null ? userPid.hashCode() : 0);
        result = 31 * result + (userTel != null ? userTel.hashCode() : 0);
        result = 31 * result + (userTicket != null ? userTicket.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (userLevel != null ? userLevel.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        return result;
    }
}

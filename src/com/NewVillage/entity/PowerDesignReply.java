package com.NewVillage.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 珏 on 2016/6/3.
 */
@Entity
@Table(name = "PowerDesign_Reply", schema = "newvil", catalog = "")
public class PowerDesignReply {
    private int replyId;
    private Integer replyPerId;
    private Timestamp replyTime;
    private String custOpinion;
    private Integer userId;
    private Timestamp signoffTime;
    private Timestamp custReplyTime;
    private Integer replyType;
    private Timestamp createTime;
    private Integer newId;
    private String status;

    @Id
    @Column(name = "replyId")
    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    @Basic
    @Column(name = "replyPerId")
    public Integer getReplyPerId() {
        return replyPerId;
    }

    public void setReplyPerId(Integer replyPerId) {
        this.replyPerId = replyPerId;
    }

    @Basic
    @Column(name = "replyTime")
    public Timestamp getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    @Basic
    @Column(name = "custOpinion")
    public String getCustOpinion() {
        return custOpinion;
    }

    public void setCustOpinion(String custOpinion) {
        this.custOpinion = custOpinion;
    }

    @Basic
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "signoffTime")
    public Timestamp getSignoffTime() {
        return signoffTime;
    }

    public void setSignoffTime(Timestamp signoffTime) {
        this.signoffTime = signoffTime;
    }

    @Basic
    @Column(name = "custReplyTime")
    public Timestamp getCustReplyTime() {
        return custReplyTime;
    }

    public void setCustReplyTime(Timestamp custReplyTime) {
        this.custReplyTime = custReplyTime;
    }

    @Basic
    @Column(name = "replyType")
    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
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

        PowerDesignReply that = (PowerDesignReply) o;

        if (replyId != that.replyId) return false;
        if (replyPerId != null ? !replyPerId.equals(that.replyPerId) : that.replyPerId != null) return false;
        if (replyTime != null ? !replyTime.equals(that.replyTime) : that.replyTime != null) return false;
        if (custOpinion != null ? !custOpinion.equals(that.custOpinion) : that.custOpinion != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (signoffTime != null ? !signoffTime.equals(that.signoffTime) : that.signoffTime != null) return false;
        if (custReplyTime != null ? !custReplyTime.equals(that.custReplyTime) : that.custReplyTime != null)
            return false;
        if (replyType != null ? !replyType.equals(that.replyType) : that.replyType != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (newId != null ? !newId.equals(that.newId) : that.newId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = replyId;
        result = 31 * result + (replyPerId != null ? replyPerId.hashCode() : 0);
        result = 31 * result + (replyTime != null ? replyTime.hashCode() : 0);
        result = 31 * result + (custOpinion != null ? custOpinion.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (signoffTime != null ? signoffTime.hashCode() : 0);
        result = 31 * result + (custReplyTime != null ? custReplyTime.hashCode() : 0);
        result = 31 * result + (replyType != null ? replyType.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

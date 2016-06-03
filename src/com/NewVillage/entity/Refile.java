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
public class Refile {
    private int refileId;
    private Integer fileId;
    private String filePlace;
    private Timestamp refileTime;
    private Integer newId;
    private String status;

    @Id
    @Column(name = "refileId")
    public int getRefileId() {
        return refileId;
    }

    public void setRefileId(int refileId) {
        this.refileId = refileId;
    }

    @Basic
    @Column(name = "fileId")
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "filePlace")
    public String getFilePlace() {
        return filePlace;
    }

    public void setFilePlace(String filePlace) {
        this.filePlace = filePlace;
    }

    @Basic
    @Column(name = "refileTime")
    public Timestamp getRefileTime() {
        return refileTime;
    }

    public void setRefileTime(Timestamp refileTime) {
        this.refileTime = refileTime;
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

        Refile refile = (Refile) o;

        if (refileId != refile.refileId) return false;
        if (fileId != null ? !fileId.equals(refile.fileId) : refile.fileId != null) return false;
        if (filePlace != null ? !filePlace.equals(refile.filePlace) : refile.filePlace != null) return false;
        if (refileTime != null ? !refileTime.equals(refile.refileTime) : refile.refileTime != null) return false;
        if (newId != null ? !newId.equals(refile.newId) : refile.newId != null) return false;
        if (status != null ? !status.equals(refile.status) : refile.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = refileId;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        result = 31 * result + (filePlace != null ? filePlace.hashCode() : 0);
        result = 31 * result + (refileTime != null ? refileTime.hashCode() : 0);
        result = 31 * result + (newId != null ? newId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

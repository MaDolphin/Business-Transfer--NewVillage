package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xfcq on 2016/6/3.
 */
@Entity
public class JobInfo {
    private int empId;
    private Integer jobNum;
    private Integer jobInfo;
    private String empDep;

    @Id
    @Column(name = "empId", nullable = false)
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "jobNum", nullable = true)
    public Integer getJobNum() {
        return jobNum;
    }

    public void setJobNum(Integer jobNum) {
        this.jobNum = jobNum;
    }

    @Basic
    @Column(name = "jobInfo", nullable = true)
    public Integer getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(Integer jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Basic
    @Column(name = "empDep", nullable = true, length = 10)
    public String getEmpDep() {
        return empDep;
    }

    public void setEmpDep(String empDep) {
        this.empDep = empDep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobInfo jobInfo1 = (JobInfo) o;

        if (empId != jobInfo1.empId) return false;
        if (jobNum != null ? !jobNum.equals(jobInfo1.jobNum) : jobInfo1.jobNum != null) return false;
        if (jobInfo != null ? !jobInfo.equals(jobInfo1.jobInfo) : jobInfo1.jobInfo != null) return false;
        if (empDep != null ? !empDep.equals(jobInfo1.empDep) : jobInfo1.empDep != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (jobNum != null ? jobNum.hashCode() : 0);
        result = 31 * result + (jobInfo != null ? jobInfo.hashCode() : 0);
        result = 31 * result + (empDep != null ? empDep.hashCode() : 0);
        return result;
    }
}

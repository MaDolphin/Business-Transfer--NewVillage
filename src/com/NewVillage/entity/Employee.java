package com.NewVillage.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by xfcq on 2016/6/3.
 */
@Entity
public class Employee {
    private int empId;
    private String empName;
    private String empDep;
    private String empJob;
    private String empTel;
    private String empPwd;

    @Id
    @Column(name = "empId", nullable = false)
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "empName", nullable = true, length = 10)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "empDep", nullable = true, length = 10)
    public String getEmpDep() {
        return empDep;
    }

    public void setEmpDep(String empDep) {
        this.empDep = empDep;
    }

    @Basic
    @Column(name = "empJob", nullable = true, length = 10)
    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    @Basic
    @Column(name = "empTel", nullable = true, length = 25)
    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    @Basic
    @Column(name = "empPwd", nullable = true, length = 255)
    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (empName != null ? !empName.equals(employee.empName) : employee.empName != null) return false;
        if (empDep != null ? !empDep.equals(employee.empDep) : employee.empDep != null) return false;
        if (empJob != null ? !empJob.equals(employee.empJob) : employee.empJob != null) return false;
        if (empTel != null ? !empTel.equals(employee.empTel) : employee.empTel != null) return false;
        if (empPwd != null ? !empPwd.equals(employee.empPwd) : employee.empPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empDep != null ? empDep.hashCode() : 0);
        result = 31 * result + (empJob != null ? empJob.hashCode() : 0);
        result = 31 * result + (empTel != null ? empTel.hashCode() : 0);
        result = 31 * result + (empPwd != null ? empPwd.hashCode() : 0);
        return result;
    }
}

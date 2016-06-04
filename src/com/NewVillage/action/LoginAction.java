package com.NewVillage.action;

import com.NewVillage.dao.EmployeeDao;
import com.NewVillage.entity.Employee;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by xfcq on 2016/6/4.
 */
public class LoginAction extends ActionSupport implements SessionAware {
    private EmployeeDao employeeDao;
    private Map session;
    private int EmpId;
    private String Password;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public String login(){
        if(employeeDao.existEmployee(EmpId,Password)){
            Employee employee = employeeDao.queryEmployeeByID(EmpId);
            session.put("employee",employee);
            return SUCCESS;
        }else {
            return INPUT;
        }
    }
}

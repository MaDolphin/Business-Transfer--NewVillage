package com.NewVillage.dao;

import com.NewVillage.entity.Employee;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface EmployeeDao {
    public boolean addEmployee(Employee employee);
    public Employee queryEmployeeByID(int empid);
    public boolean deleteEmployee(Employee employee);
    public boolean updateEmployee(Employee employee);
    public boolean existEmployee(int empid,String password);
    public List<Employee> allEmployees();
}

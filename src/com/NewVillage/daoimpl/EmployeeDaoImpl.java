package com.NewVillage.daoimpl;

import com.NewVillage.dao.EmployeeDao;
import com.NewVillage.entity.Employee;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

    @Override
    public boolean addEmployee(Employee employee) {
        try{
            this.getHibernateTemplate().save(employee);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Employee queryEmployeeByID(int empid) {
        Employee employee = (Employee) (getHibernateTemplate().get(Employee.class,empid));
        return employee;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        try{
            this.getHibernateTemplate().delete(employee);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        try{
            this.getHibernateTemplate().saveOrUpdate(employee);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean existEmployee(int empid, String password) {
        List list = (List<Employee>) this.getHibernateTemplate().find("from Employee e where e.empId=? and e.empPwd=?",new Object[]{empid,password});
        if(list.size() == 1)
            return true;
        return false;
    }

    @Override
    public List<Employee> allEmployees() {
        List a=(List<Employee>)this.getHibernateTemplate().find("from Employee");
        return a;
    }

    @Override
    public List<Employee> QueryEmployeeByDep(String dep) {
        return (List<Employee>)this.getHibernateTemplate().find("from Employee u where u.empDep=?",new Object[]{dep});
    }
}

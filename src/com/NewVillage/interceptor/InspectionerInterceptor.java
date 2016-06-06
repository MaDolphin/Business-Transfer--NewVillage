package com.NewVillage.interceptor;

import com.NewVillage.entity.Employee;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class InspectionerInterceptor implements Interceptor {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // TODO Auto-generated method stub
        Map<String, Object> session= invocation.getInvocationContext().getSession();
        if(session.get("employee")!=null){
            Employee employee = (Employee) session.get("employee");
            if("报验员".equals(employee.getEmpDep())){
                return invocation.invoke();
            }
            else{
                return "login";
            }
        }else{
            return "login";
        }
    }
}

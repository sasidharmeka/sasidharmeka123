package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Lab4Ex2 {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.getEmployeeDetails();
        employeeService.displayEmployeeDetails(employee);
    }
}

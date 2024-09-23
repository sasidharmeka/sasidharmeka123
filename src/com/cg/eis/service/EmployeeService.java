package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    void displayEmployeeDetails(Employee employee);
}

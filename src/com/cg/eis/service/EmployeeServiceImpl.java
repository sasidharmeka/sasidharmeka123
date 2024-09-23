package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String name = scanner.next();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter Employee Designation:");
        String designation = scanner.next();

        return new Employee(id, name, salary, designation);
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }
}

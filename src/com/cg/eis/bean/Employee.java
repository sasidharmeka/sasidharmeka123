package com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(salary, designation);
    }

    private String determineInsuranceScheme(double salary, String designation) {
        if (salary > 50000) {
            return "Premium";
        } else if (salary > 30000) {
            return "Gold";
        } else if (salary > 20000) {
            return "Silver";
        } else {
            return "No Insurance";
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + ", Designation=" + designation + ", InsuranceScheme=" + insuranceScheme + "]";
    }
}

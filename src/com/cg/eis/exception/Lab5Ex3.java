

import com.cg.eis.exception.EmployeeException;
import java.util.Scanner;

public class Lab5Ex3{

    // Method to validate employee's salary
    public static void validateSalary(double salary) throws EmployeeException {
        // If salary is below 3000, throw custom exception
        if (salary < 3000) {
            throw new EmployeeException("Salary below 3000 is not acceptable.");
        } else {
            System.out.println("Salary is valid: " + salary);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Ask for the employee's salary
        System.out.println("Enter employee's salary:");
        double salary = sc.nextDouble();

        try {
            // Call the method to validate the salary
            validateSalary(salary);
        } catch (EmployeeException e) {
            // Handle the custom exception and print the message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            sc.close();
        }
    }
}


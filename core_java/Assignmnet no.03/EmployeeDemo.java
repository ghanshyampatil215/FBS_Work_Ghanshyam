// Question 2: Employee Salary Calculation
// Design a class named Employee to calculate employee salary
// including company-wide bonus.

class Employee {

    // Bonus rate is common for all employees
    static double bonusRate = 10.0;

    // Employee-specific details
    String employeeName;
    double basicSalary;

    // Constructor
    Employee(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Method to update the common bonus rate
    static void updateBonusRate(double newRate) {
        bonusRate = newRate;
    }

    // Method to calculate total salary
    // Total Salary = Basic Salary + (Basic Salary × Bonus Rate / 100)
    double calculateSalary() {
        return basicSalary + (basicSalary * bonusRate / 100);
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Rate: " + bonusRate + "%");
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println();
    }
}


// Main class
public class EmployeeDemo {

    public static void main(String[] args) {

        // Creating Employee objects
        Employee e1 = new Employee("Shym", 30000);
        Employee e2 = new Employee("Rahul", 40000);

        // Display employee details
        e1.display();
        e2.display();

        // Updating common bonus rate
        Employee.updateBonusRate(15);

        System.out.println("After Bonus Rate Update:");

        // Display updated salary
        e1.display();
        e2.display();
    }
}
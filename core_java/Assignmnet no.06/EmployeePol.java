// Assignment 6
// Employee Hierarchy
// Demonstrate Polymorphism using Method Overriding
// and Superclass Reference.

public class EmployeePol {

    int id;
    String name;
    double salary;

    EmployeePol(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    public static void main(String[] args) {

        EmployeePol e;

        e = new AdminPol(101, "Ghanshyam", 50000, 5000);
        e.work();

        e = new SalesMangerPol(102, "Amit", 60000, 8000, 100);
        e.work();

        e = new HRPoly(103, "Shyam", 55000, 6000);
        e.work();
    }
}


class AdminPol extends EmployeePol {

    double allowance;

    AdminPol(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    void work() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Admin is managing administration work");
        System.out.println();
    }
}


class SalesMangerPol extends EmployeePol {

    double incentive;
    int target;

    SalesMangerPol(int id, String name, double salary, double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    @Override
    void work() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
        System.out.println("Sales Manager is managing sales work");
        System.out.println();
    }
}


class HRPoly extends EmployeePol {

    double commission;

    HRPoly(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    @Override
    void work() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
        System.out.println("HR is handling human resource work");
        System.out.println();
    }
}
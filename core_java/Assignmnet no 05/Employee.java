// Question 1: Employee Hierarchy
// Implement the given Employee hierarchy using Java inheritance.


// Superclass
class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


// Admin is-a Employee
class Admin extends Employee {

    double allowance;

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void displayAdmin() {
        displayEmployee();
        System.out.println("Allowance: " + allowance);
    }
}


// SalesManager is-a Employee
class SalesManager extends Employee {

    double incentive;
    int target;

    SalesManager(int id, String name, double salary,
                 double incentive, int target) {

        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void displaySalesManager() {
        displayEmployee();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}


// HR is-a Employee
class HR extends Employee {

    double commission;

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    void displayHR() {
        displayEmployee();
        System.out.println("Commission: " + commission);
    }
}


// Main class
class EmployeeDemo {

    public static void main(String[] args) {

        Admin a = new Admin(101, "Devendra", 50000, 5000);

        SalesManager sm =  new SalesManager(102, "Amit", 60000, 8000, 100);

        HR h = new HR(103, "Shyam", 55-000, 6000);

        System.out.println("----- Admin Details -----");
        a.displayAdmin();

        System.out.println();

        System.out.println("----- Sales Manager Details -----");
        sm.displaySalesManager();

        System.out.println();

        System.out.println("----- HR Details -----");
        h.displayHR();
    }
}
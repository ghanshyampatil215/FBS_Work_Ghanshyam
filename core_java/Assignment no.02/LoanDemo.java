class Student {

    int rollNo;
    String name;
    double percentage;

    Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }
}


class Employee {

    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}


class Bank {

    // For Student
    void approveLoan(Student s) {

        System.out.println("Student Name: " + s.name);
        System.out.println("Percentage: " + s.percentage);

        if (s.percentage > 80) {
            System.out.println("Loan Approved: Rs. 2,00,000");
        }
        else if (s.percentage >= 60) {
            System.out.println("Loan Approved: Rs. 1,00,000");
        }
        else if (s.percentage >= 40) {
            System.out.println("Loan Approved: Rs. 50,000");
        }
        else {
            System.out.println("No Loan Approved");
        }

        System.out.println();
    }


    // For Employee
    void approveLoan(Employee e) {

        System.out.println("Employee Name: " + e.name);
        System.out.println("Annual Salary: " + e.annualSalary + " LPA");

        if (e.annualSalary > 12) {
            System.out.println("Loan Approved: Rs. 7,00,000");
        }
        else if (e.annualSalary >= 10) {
            System.out.println("Loan Approved: Rs. 6,00,000");
        }
        else if (e.annualSalary >= 6) {
            System.out.println("Loan Approved: Rs. 5,00,000");
        }
        else if (e.annualSalary >= 4) {
            System.out.println("Loan Approved: Rs. 4,00,000");
        }
        else {
            System.out.println("No Loan Approved");
        }

        System.out.println();
    }
}


public class LoanDemo {

    public static void main(String[] args) {

        Bank b = new Bank();

        Student s = new Student(101, "Ghanshyam", 85);
        Employee e = new Employee(501, "Devendra", 11);

        b.approveLoan(s);
        b.approveLoan(e);
    }
}
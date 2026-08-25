class Main {
    public static void main(String[] args) {

        Date d = new Date();
        d.day = 25;
        d.month = 8;
        d.year = 2026;
        d.dow = "Tuesday";
        d.displayDate();

        System.out.println();

        Student s = new Student();
        s.frn = 101;
        s.studentName = "Rahul";
        s.distanceCovered = 15.5;
        s.displayStudent();

        System.out.println();

        PlacedStudent ps = new PlacedStudent();
        ps.frn = 102;
        ps.studentName = "Amit";
        ps.distanceCovered = 20.5;
        ps.companyName = "TCS";
        ps.designation = "Java Developer";
        ps.displayPlacedStudent();

        System.out.println();

        Employee e = new Employee();
        e.id = 201;
        e.name = "Raj";
        e.salary = 30000;
        e.displayEmployee();

        System.out.println();

        HR h = new HR();
        h.id = 202;
        h.name = "Priya";
        h.salary = 40000;
        h.commission = 5000;
        h.displayHR();

        System.out.println();

        SalesManager sm = new SalesManager();
        sm.id = 203;
        sm.name = "Akash";
        sm.salary = 45000;
        sm.incentive = 7000;
        sm.target = 100000;
        sm.displaySalesManager();

        System.out.println();

        Admin a = new Admin();
        a.id = 204;
        a.name = "Sneha";
        a.salary = 35000;
        a.allowance = 4000;
        a.displayAdmin();

        System.out.println();

        BankAccount ba = new BankAccount();
        ba.accountNumber = 123456789;
        ba.holderName = "Rohit";
        ba.currentBalance = 50000;
        ba.interestRate = 6.5;
        ba.displayBankAccount();

        System.out.println();

        Teacher t = new Teacher();
        t.id = 301;
        t.name = "Suresh";
        t.salary = 40000;
        t.subject = "Java";
        t.displayTeacher();

        System.out.println();

        Manager m = new Manager();
        m.id = 302;
        m.name = "Kiran";
        m.salary = 50000;
        m.bonus = 8000;
        m.displayManager();
    }
}
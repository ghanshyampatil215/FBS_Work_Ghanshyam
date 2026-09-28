class Employee {
	int id;
	String name;
	double salary;
	static int count = 0;

	Employee() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 0;
		count++;

		System.out.println("Default Constructor of Employee");
	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;

		System.out.println("Parameterized Constructor of Employee");
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Employee.count = count;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	void display() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
}


class Admin extends Employee {

	double allowance;

	Admin() {
		super(); // calling Employee default constructor

		this.allowance = 0;

		System.out.println("Default Constructor of Admin");
	}

	Admin(int id, String name, double salary, double allowance) {

		super(id, name, salary);
		// calling superclass(Employee) constructor

		this.allowance = allowance;

		System.out.println("Parameterized Constructor of Admin");
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display() {
		super.display();

		System.out.println("Allowance: " + this.allowance);
	}
}


class SalesManager extends Employee {

	double incentive;
	double target;

	SalesManager() {
		super(); // calling Employee default constructor

		this.incentive = 0;
		this.target = 0;

		System.out.println("Default Constructor of SalesManager");
	}

	SalesManager(int id, String name, double salary,
			double incentive, double target) {

		super(id, name, salary);
		// calling superclass(Employee) constructor

		this.incentive = incentive;
		this.target = target;

		System.out.println("Parameterized Constructor of SalesManager");
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	void display() {
		super.display();

		System.out.println("Incentive: " + this.incentive);
		System.out.println("Target: " + this.target);
	}
}


class HR extends Employee {

	double commission;

	HR() {
		super(); // calling Employee default constructor

		this.commission = 0;

		System.out.println("Default Constructor of HR");
	}

	HR(int id, String name, double salary, double commission) {

		super(id, name, salary);
		// calling superclass(Employee) constructor

		this.commission = commission;

		System.out.println("Parameterized Constructor of HR");
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	void display() {
		super.display();

		System.out.println("Commission: " + this.commission);
	}
}


class EmployeeTest {
	public static void main(String[] args) {

	     Employee e1= new Employee(101 ,"Shyam", 50000);
	      e1.display();
	      
	      e1=new Admin(102, "devendra", 20000, 4000);
	      e1.display();
	 
	      e1=new SalesManager(103,"Ghanshyam", 34000, 2500,5);
	      e1.display();

	      e1 = new HR(104, "Rohit", 35000,3000);
          e1.display();
	}
}

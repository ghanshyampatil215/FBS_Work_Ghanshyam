class Vehicle {
	int vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	static int count = 0;

	Vehicle() {
		this.vehicleNumber = 0;
		this.model = "Not Given";
		this.companyName = "Not Given";
		this.noOfWheels = 0;
		this.price = 0;
		count++;

		System.out.println("Default Constructor of Vehicle");
	}

	Vehicle(int vehicleNumber, String model, String companyName,
			int noOfWheels, double price) {

		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
		count++;

		System.out.println("Parameterized Constructor of Vehicle");
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Vehicle.count = count;
	}

	int getVehicleNumber() {
		return vehicleNumber;
	}

	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	int getNoOfWheels() {
		return noOfWheels;
	}

	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void display() {
		System.out.println("Vehicle Number: " + this.vehicleNumber);
		System.out.println("Model: " + this.model);
		System.out.println("Company Name: " + this.companyName);
		System.out.println("No Of Wheels: " + this.noOfWheels);
		System.out.println("Price: " + this.price);
	}
}


class Bike extends Vehicle {

	int noOfStands;
	int noOfHelmets;
	String bikeCategory;

	Bike() {
		super();

		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.bikeCategory = "Not Given";

		System.out.println("Default Constructor of Bike");
	}

	Bike(int vehicleNumber, String model, String companyName,
			int noOfWheels, double price,
			int noOfStands, int noOfHelmets, String bikeCategory) {

		super(vehicleNumber, model, companyName, noOfWheels, price);

		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;

		System.out.println("Parameterized Constructor of Bike");
	}

	int getNoOfStands() {
		return noOfStands;
	}

	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	int getNoOfHelmets() {
		return noOfHelmets;
	}

	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	String getBikeCategory() {
		return bikeCategory;
	}

	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}

	void display() {
		super.display();

		System.out.println("No Of Stands: " + this.noOfStands);
		System.out.println("No Of Helmets: " + this.noOfHelmets);
		System.out.println("Bike Category: " + this.bikeCategory);
	}
}


class Car extends Vehicle {

	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;

	Car() {
		super();

		this.hasPowerSteering = false;
		this.driveMode = "Not Given";
		this.parkingAssistSensors = 0;

		System.out.println("Default Constructor of Car");
	}

	Car(int vehicleNumber, String model, String companyName,
			int noOfWheels, double price,
			boolean hasPowerSteering, String driveMode,
			int parkingAssistSensors) {

		super(vehicleNumber, model, companyName, noOfWheels, price);

		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;

		System.out.println("Parameterized Constructor of Car");
	}

	boolean getHasPowerSteering() {
		return hasPowerSteering;
	}

	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	String getDriveMode() {
		return driveMode;
	}

	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	int getParkingAssistSensors() {
		return parkingAssistSensors;
	}

	void setParkingAssistSensors(int parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}

	void display() {
		super.display();

		System.out.println("Has Power Steering: " + this.hasPowerSteering);
		System.out.println("Drive Mode: " + this.driveMode);
		System.out.println("Parking Assist Sensors: " + this.parkingAssistSensors);
	}
}


class Bus extends Vehicle {

	int passengerCapacity;
	int standingCapacity;

	Bus() {
		super();

		this.passengerCapacity = 0;
		this.standingCapacity = 0;

		System.out.println("Default Constructor of Bus");
	}

	Bus(int vehicleNumber, String model, String companyName,
			int noOfWheels, double price,
			int passengerCapacity, int standingCapacity) {

		super(vehicleNumber, model, companyName, noOfWheels, price);

		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;

		System.out.println("Parameterized Constructor of Bus");
	}

	int getPassengerCapacity() {
		return passengerCapacity;
	}

	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	int getStandingCapacity() {
		return standingCapacity;
	}

	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}

	void display() {
		super.display();

		System.out.println("Passenger Capacity: " + this.passengerCapacity);
		System.out.println("Standing Capacity: " + this.standingCapacity);
	}
}


class VehicleTest {
	public static void main(String[] args) {

		Bike b1 = new Bike(
				101,"Splendor","Hero",2,85000,1,2,"Commuter");

		Car c1 = new Car(
				102,"Creta","Hyundai",4,1500000,true,"Automatic",4);

		Bus bus1 = new Bus(
				103,"Starbus","Tata",6,2500000,40,20);

		System.out.println();

		b1.display();

		System.out.println();

		c1.display();

		System.out.println();

		bus1.display();

		System.out.println();

		System.out.println("Vehicle's Count: " + Vehicle.getCount());
	}
}
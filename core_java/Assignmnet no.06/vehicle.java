
public class vehicle {
	
	String vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	
	void brake() {
		System.out.println("Vehicle is braking");
	}

	public static void main(String[] args) {
		vehicle v;
		
		v=new Bike("MH19DD7003", "platina", "bajaj", 2,120000,2,2,"Sports");
		
		v.brake();
		
		v = new Car("MH19DD4563", "creta", "Hyundai",4,15000000,true,"Automatic", 4);

		v.brake();
		
		v= new Bus("MH19EF3424", "volvo", "volvo", 6, 5000000, 50,30);
		
		v.brake();
	}

}
class Bike extends vehicle{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	
	Bike(String vehicleNumber,String model, String companyName, int noOfWheels,double price,
			    int noOfStands,int noOfHelmets, String bikeCategory){
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	
	void brake() {

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Company: " + companyName);
        System.out.println("Wheels: " + noOfWheels);
        System.out.println("Price: " + price);
        System.out.println("Stands: " + noOfStands);
        System.out.println("Helmets: " + noOfHelmets);
        System.out.println("Category: " + bikeCategory);
        System.out.println("Bike is braking");
        System.out.println();
    
	}
}

class Car extends vehicle {
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	
	Car(String vehicleNumber,String model,String companyName,int noOfWheels, double price,
			  boolean hasPowerSteering, String driveMode, int parkingAssistSensors){
		
		super(vehicleNumber,model,companyName, noOfWheels, price);
		
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
	    this.parkingAssistSensors = parkingAssistSensors;
	}
	  @Override
	    void brake() {

	        System.out.println("Vehicle Number: " + vehicleNumber);
	        System.out.println("Model: " + model);
	        System.out.println("Company: " + companyName);
	        System.out.println("Wheels: " + noOfWheels);
	        System.out.println("Price: " + price);
	        System.out.println("Power Steering: " + hasPowerSteering);
	        System.out.println("Drive Mode: " + driveMode);
	        System.out.println("Parking Sensors: " + parkingAssistSensors);
	        System.out.println("Car is braking");
	        System.out.println();
	    }
}
	  //bus
	  class Bus extends vehicle {
		  int passengerCapacity;
		  int standingCapacity;
		  
		  Bus(String vehicleNumber,String model, String companyName,
				  int noOfWheels,double price,
				  int passengerCapacity,int standingCapacity){
			  super(vehicleNumber,model, companyName, noOfWheels,price);
			  
			  this.passengerCapacity = passengerCapacity;
			  this.standingCapacity = standingCapacity;
		  }
		  void brake () {
			  
		        System.out.println("Vehicle Number: " + vehicleNumber);
		        System.out.println("Model: " + model);
		        System.out.println("Company: " + companyName);
		        System.out.println("Wheels: " + noOfWheels);
		        System.out.println("Price: " + price);
		        System.out.println("Passenger Capacity: " + passengerCapacity);
		        System.out.println("Standing Capacity: " + standingCapacity);
		        System.out.println("Bus is braking");
		        System.out.println();
		    }
		  }
	  
	  


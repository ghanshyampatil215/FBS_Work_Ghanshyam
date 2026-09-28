import java.util.Scanner;

abstract class ElectricityBill {
     
	String customerName;
	double units;
	
	ElectricityBill(String customerName, double units){
		this.customerName = customerName;
		this.units = units;
	}
	  
	void showUsage() {
		System.out.println("customer Name:" + customerName);
        System.out.println("Units Cosumed:" + units);
	}
	
	abstract double calculateBill();
	
	final void generateBill() {
		double bill = calculateBill();
		
		double tax = bill * 0.05;
		double fixedCharge = 50;
		double finalBill = bill + tax + fixedCharge;
	    
		showUsage();
		System.out.println("unit charges: "+ bill);
		System.out.println("Tax (5%):" +tax);
		System.out.println("Fixed Charge:" + fixedCharge);
		System.out.println("Final Bill: " + finalBill);
	}
	
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	      
	   System.out.println("Enter 1 for Residential");
	   System.out.println("Enter 2 for Commercial");
	   
	   int choice = sc.nextInt();
	   
	   sc.nextLine();
	   
	   System.out.println("Enter Customer Name:");
	   String name = sc.nextLine();
	   
	   System.out.println("Enter Units:");
	   double units = sc.nextDouble();
	   
	   ElectricityBill bill;
	   
	   if(choice == 1) {
		   bill = new Residential(name, units);
		   
	   } else if(choice == 2) {
		   bill = new Commercial (name,units);
		   
	   } else {
		   System.out.println("Invalid choice");
		   sc.close();
	       return;
	       
	   }
	   
	   bill.generateBill();
	   sc.close();
	  
	}

}

class Residential extends ElectricityBill {
	Residential(String customerName, double units) {
		super(customerName, units);
	}
	
	@Override
	double calculateBill() {
		
		double bill;
		
		if(units <= 100) {
			bill = units * 2.5;
		}
		else if (units <= 300) {
			bill = units * 3.5;
		} else {
			bill = units * 5;
		} if(units > 500) {
			bill = bill + 150;
		}
		
		return bill;
	}
	
}

class Commercial extends ElectricityBill {
	
	Commercial(String customerName, double units) {
		super(customerName, units);
	}

	@Override
	double calculateBill() {
		   
		double bill = units * 6.5;
		
		if(units < 200) {
			bill = 1500;
		}
		if(units > 1000) {
			bill = bill + (bill * 0.08);
		}
		return bill;
	}
}

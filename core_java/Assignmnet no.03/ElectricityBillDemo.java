class ElectricityBill {

    // Same for all customers
    static double ratePerUnit = 8.0;

    // Different for each customer
    String customerName;
    int unitsConsumed;

    ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Update electricity rate
    static void updateRate(double newRate) {
        ratePerUnit = newRate;
    }

    // Calculate total bill
    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate Per Unit: " + ratePerUnit);
        System.out.println("Total Bill: " + calculateBill());
        System.out.println();
    }
}


public class ElectricityBillDemo {

    public static void main(String[] args) {

        ElectricityBill e1 = new ElectricityBill("Shym", 100);
        ElectricityBill e2 = new ElectricityBill("Rahul", 100);

        e1.display();
        e2.display();

        ElectricityBill.updateRate(10);

        System.out.println("After Rate Update:");

        e1.display();
        e2.display();
    }
}
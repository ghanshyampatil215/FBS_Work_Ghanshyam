
abstract class Payment {
   
	 String paymentId;
	 double amount;
	 String payerName;
	 String status;
	 
	 Payment(String paymentId, double amount, String payerName){
		 this.paymentId = paymentId;
		 this.amount = amount;
		 this.payerName = payerName;
		 this.status = "PENDING";
	 }
	 
	 void printSummary() {
		 System.out.println("Payment ID:" + paymentId);
		 System.out.println("Amount :" + amount);
		 System.out.println("Payer Name : " + payerName);
		 System.out.println("Status :"+ status);
	 }
	 
	 final void process() {
		 
		 if(validate()) {
			 deductAmount();
			 sendNotification();
			 status = "SUCCESS";
		 } else {
			 status = "FAILED";
			 System.out.println("Payment validation failed.");
		 }
	 }
	 
	 abstract boolean validate();

     abstract void deductAmount();
     
     abstract void sendNotification();
}

class CardPayment extends Payment {
	 String cardNumber;
	 String cvv;
	 
	 CardPayment(String paymentId, double amount, String payerName,
			         String cardNumber, String cvv) {
		 
		 super(paymentId, amount, payerName);
		 
		 this.cardNumber = cardNumber;
		 this.cvv = cvv;
	 }

	@Override
	boolean validate() {
		  return cardNumber.matches("\\d{16}") && cvv.matches("\\d{3}") && amount >0;
	}

	@Override
	void deductAmount() {
		
			System.out.println("Amount" + amount + " deducted from card.");
		}

	@Override
	void sendNotification() {
		  System.out.println("card payment notification sent.");
		
	}
}

class UPIPayment extends Payment {
	String upiId;
	
	UPIPayment(String paymentId, double amount, String payerName, String upiId) {
		super(paymentId, amount, payerName);
		
		this.upiId = upiId;
	}

	@Override
	boolean validate() {
	       return upiId.contains("@") && amount >= 1 && amount <= 100000;
	}
	@Override
	void deductAmount() {
		System.out.println("Amount" + amount + " deducted through UPI.");
		
	}
	

	@Override
	void sendNotification() {
		System.out.println("UPI payment notification sent..");
		
	}
}

 class PaymentTest {

    public static void main(String[] args) {

        Payment p;

        p = new CardPayment("p101", 5000, "Ghanshyam", "1234567890987654", "123" );

        p.process();
        p.printSummary();

        System.out.println();

        p = new UPIPayment("p102",3000, "Devendra","deva@upi");

        p.process();
        p.printSummary();
    }
}
 
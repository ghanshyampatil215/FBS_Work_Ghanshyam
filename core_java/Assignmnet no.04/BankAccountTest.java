class BankAccount {
	
	String accountNumber;
	String accountHolderName;
	double balance;
	
	BankAccount(){
		this.accountNumber = "Not Given";
		this.accountHolderName = "Not Given";
		this.balance = 0;
		System.out.println("default constructor of BankAccount");
	}
	
	BankAccount(String accountNumber, String accountHolderName, double balance) {
		 this.accountNumber = accountNumber;
		 this.accountHolderName = accountHolderName;
		 this.balance = balance;
		 
		 System.out.println("Parametrized Constructor of BankAccount");
	}
	String getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	String getAccountHolderName() {
		return accountHolderName;
	}
	
	void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Account Number: "+ this.accountNumber);
		System.out.println("Account Holder Name:" + this.accountHolderName);
		System.out.println("Balance" + this.balance);
	}
}

class SavingsAccount extends BankAccount {
	double interestRate;
	SavingsAccount() {
		super();
		this.interestRate = 0;
		
		System.out.println("default Constructor of SavingAccount");
		
	}
	SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		
		this.interestRate = interestRate;
		
	 System.out.println("Parametrized Constructor of SavingAccount");
	}
	
	double getInterestRate() {
		return interestRate;
		
	}
	 void setInterestRate(double interestRate) {
		 this.interestRate = interestRate;
	 }
	 void display() {
		 super.display();
		 System.out.println("interest Rate:" + this.interestRate);
	 }
}
class CurrentAccount extends BankAccount {
	double overdraftLimit;
	
	CurrentAccount() {
		super();
		
		this.overdraftLimit = 0;
      System.out.println("default Constructor of CurrentAccount");
      
	}
	CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit ){
	     super(accountNumber, accountHolderName, balance);
	     
	     this.overdraftLimit = overdraftLimit;
	     
	     System.out.println("parameterized Constructor of CurrentAccount");
	} 	 
	  double getOverdraftLimit() {
		  return overdraftLimit;
	  }
	void  setOverdraftLimit(double overdraftLimit) {
	    	 this.overdraftLimit = overdraftLimit;
	     }
	

    void display() {
    	super.display();
         System.out.println("Overdraft Limit:" + this.overdraftLimit);
    }	
  }

public class BankAccountTest {

	public static void main(String[] args) {
	      SavingsAccount s1 = new SavingsAccount("SB101", "Ghanshyam", 500000, 6.5);
	      
	      CurrentAccount c1 = new CurrentAccount("CA102","Devendra",250000, 1500);
	      
	      System.out.println();
	      
	      System.out.println("Saving Account Details");
	      s1.display();
	      
	      System.out.println();
	      
	      System.out.println("Current Account Details:");
	      c1.display();
	 
	}

}

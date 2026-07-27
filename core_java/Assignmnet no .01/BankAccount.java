class BankAccount{
     long accountNumber;
     long holder;
     int currentBalance;
     int interestRate;
}
//class BankAccount ends here
  
       class TestBankAccount {
        public static void main(String[] args){
        
         BankAccount b1; //refernce
         b1= new BankAccount();
         System.out.println(b1);

        BankAccount b2;
        b2 = new BankAccount();
        System.out.println(b2);
   }
}
     
  
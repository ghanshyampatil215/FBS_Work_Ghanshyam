class BankAccount {
    long accountNumber;
    String holderName;
    double currentBalance;
    double interestRate;

    void displayBankAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Interest Rate: " + interestRate);
    }
}
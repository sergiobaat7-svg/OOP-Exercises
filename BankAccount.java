package bankaccount;

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) { this.accountNumber = accountNumber; this.holderName = holderName; this.balance = balance; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds!");
    }
    public void displayBalance() { System.out.println("Account: " + holderName + " | Balance: " + balance); }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) { super(accountNumber, holderName, balance); this.interestRate = interestRate; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public void applyInterest() { setBalance(getBalance() + getBalance() * interestRate / 100); }
}

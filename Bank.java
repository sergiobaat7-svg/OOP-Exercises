import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Account class to maintain account details
class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// Bank class with collection of Account objects
public class Bank {
    private List<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Remove account by account number
    public boolean removeAccount(String accountNumber) {
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account acc = iterator.next();
            if (acc.getAccountNumber().equals(accountNumber)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Deposit money to an account
    public boolean depositToAccount(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount);
                return true;
            }
        }
        return false;
    }

    // Withdraw money from an account
    public boolean withdrawFromAccount(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc.withdraw(amount);
            }
        }
        return false;
    }

    // List all accounts
    public void listAccounts() {
        for (Account acc : accounts) {
            System.out.println("Account Number: " + acc.getAccountNumber() +
                               ", Customer Name: " + acc.getCustomerName() +
                               ", Balance: $" + acc.getBalance());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("1001", "Sergio Baat", 200.0);
        Account acc2 = new Account("1002", "Sarge baat", 500.0);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        System.out.println("Accounts after adding:");
        bank.listAccounts();

        bank.depositToAccount("1001", 200.0);
        bank.withdrawFromAccount("1002", 150.0);

        System.out.println("\nAccounts after deposit and withdrawal:");
        bank.listAccounts();

        bank.removeAccount("1001");
        System.out.println("\nAccounts after removing account 1001:");
        bank.listAccounts();
    }
}
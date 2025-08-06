package bank_system;

public class Account {
    private String ownerName;
    private int accountNumber;
    private double balance;

    public Account(String ownerName, int accountNumber, double initialDeposit) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }
    public Account(String ownerName) {
        this.ownerName = ownerName;
        
    }
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void transfer(Account target, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            target.balance += amount;
            System.out.println("₹" + amount + " transferred to Account " + target.getAccountNumber());
        } else {
            System.out.println("Transfer failed. Check balance/amount.");
        }
    }
}

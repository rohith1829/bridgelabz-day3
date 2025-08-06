package bank_system;

public class Bank {
    private Account[] accounts;
    private int accountCount;
    private static int nextAccountNumber = 1001; // Unique account numbers

    public Bank(int size) {
        accounts = new Account[size];
        accountCount = 0;
    }

    public void addAccount(String ownerName, double initialDeposit) {
        if (accountCount >= accounts.length) {
            System.out.println("Bank is full! Cannot add more accounts.");
            return;
        }
        accounts[accountCount] = new Account(ownerName, nextAccountNumber++, initialDeposit);
        System.out.println("Account created successfully! Account Number: " + accounts[accountCount].getAccountNumber());
        accountCount++;
    }

    public Account findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("\n--- All Accounts ---");
        for (int i = 0; i < accountCount; i++) {
            System.out.println("Account No: " + accounts[i].getAccountNumber() +
                    ", Owner: " + accounts[i].getOwnerName() +
                    ", Balance: ₹" + accounts[i].getBalance());
        }
    }
}

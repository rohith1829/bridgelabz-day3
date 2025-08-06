package atm_system;

import java.util.Scanner;

public class ATM {
    private User[] users;
    private int[] failedAttempts;

    public ATM(User[] users) {
        this.users = users;
        this.failedAttempts = new int[users.length];
    }

    private int validatePin(String enteredPin) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getPin().equals(enteredPin)) {
                return i;
            }
        }
        return -1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String pin = sc.nextLine();
        int index = validatePin(pin);

        if (index == -1) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (failedAttempts[index] >= 3) {
            System.out.println("Account locked due to too many failed attempts.");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + users[index].getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    users[index].deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double with = sc.nextDouble();
                    users[index].withdraw(with);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

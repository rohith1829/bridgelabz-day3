package atm_system;
import java.util.Scanner;

public class ATM {
    private User[] users;
    private int[] failedAttempts;

    public ATM(User[] users) {
        this.users = users;
        this.failedAttempts = new int[users.length];
    }

    private int findUserByPin(String enteredPin) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getPin().equals(enteredPin)) {
                return i;
            }
        }
        return -1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter your PIN (or type EXIT to quit): ");
            String enteredPin = sc.nextLine();

            if (enteredPin.equalsIgnoreCase("exit")) {
                System.out.println("Exiting ATM...");
                break;
            }

            int userIndex = findUserByPin(enteredPin);

            if (userIndex == -1) {
                System.out.println("Invalid PIN!");
                continue; 
            }

            if (failedAttempts[userIndex] >= 3) {
                System.out.println("Account locked due to too many failed attempts.");
                continue;
            }

            
            if (!users[userIndex].getPin().equals(enteredPin)) {
                failedAttempts[userIndex]++;
                System.out.println("Incorrect PIN! Attempt " + failedAttempts[userIndex] + "/3");
                continue;
            }

            
            failedAttempts[userIndex] = 0;

            
            while (true) {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Logout");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: ₹" + users[userIndex].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        users[userIndex].deposit(dep);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double with = sc.nextDouble();
                        users[userIndex].withdraw(with);
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        sc.nextLine(); // clear buffer
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

                if (choice == 4) break;
            }
        }
    }
}

package bank_system;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(10); // Max 10 accounts

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter owner name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double deposit = sc.nextDouble();
                    bank.addAccount(name, deposit);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int depAcc = sc.nextInt();
                    Account accDep = bank.findAccount(depAcc);
                    if (accDep != null) {
                        System.out.print("Enter deposit amount: ");
                        double amt = sc.nextDouble();
                        accDep.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int withAcc = sc.nextInt();
                    Account accWith = bank.findAccount(withAcc);
                    if (accWith != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double amt = sc.nextDouble();
                        accWith.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter sender account number: ");
                    int senderAccNo = sc.nextInt();
                    System.out.print("Enter receiver account number: ");
                    int receiverAccNo = sc.nextInt();
                    Account sender = bank.findAccount(senderAccNo);
                    Account receiver = bank.findAccount(receiverAccNo);
                    if (sender != null && receiver != null) {
                        System.out.print("Enter transfer amount: ");
                        double amt = sc.nextDouble();
                        sender.transfer(receiver, amt);
                    } else {
                        System.out.println("One or both accounts not found!");
                    }
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Exiting Bank System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

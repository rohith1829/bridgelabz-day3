package library_system;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(5); // Max 5 books

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. List Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter Book Title to Issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle);
                    break;

                case 3:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 4:
                    library.listAvailableBooks();
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

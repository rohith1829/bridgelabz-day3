package employee_system;

import java.util.Scanner;

public class EmployeePromotionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company company = new Company(5); // Max 5 employees

        while (true) {
            System.out.println("\n--- Employee Promotion Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Promote Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    company.addEmployee(new Employee(id, name, "Junior", salary));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to promote: ");
                    int promoteId = sc.nextInt();
                    company.promoteEmployee(promoteId);
                    break;

                case 3:
                    company.displayAllEmployees();
                    break;

                case 4:
                    System.out.println("Exiting Employee Promotion System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


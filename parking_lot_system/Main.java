package parking_lot_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingArea p = new ParkingArea(5);

        while (true) {
            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Parked Vehicles");
            System.out.println("4. Show Revenue");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (car/truck/bike): ");
                    String type = sc.next();
                    System.out.print("Enter vehicle number: ");
                    String num = sc.next();

                    Vehicle v = null;
                    if (type.equalsIgnoreCase("car"))
                        v = new Car(num);
                    else if (type.equalsIgnoreCase("bike"))
                        v = new Bike(num);
                    else if (type.equalsIgnoreCase("truck"))
                        v = new Truck(num);
                    else {
                        System.out.println("Invalid vehicle type!");
                        break;
                    }

                    p.parkVehicle(v);
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String removeNum = sc.next();
                    p.removeVehicle(removeNum);
                    break;

                case 3:
                    p.showParkedVehicles();
                    break;

                case 4:
                    p.getRevenue();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

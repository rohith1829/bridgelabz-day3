package parking_lot_system;

public class ParkingArea {
    private int revenue;
    private int capacity;
    private Vehicle[] slots;

    public ParkingArea(int capacity) {
        this.capacity = capacity;
        this.slots = new Vehicle[capacity];
    }

    public void parkVehicle(Vehicle v) {
        for (int i = 0; i < capacity; i++) {
            if (slots[i] == null) {
                slots[i] = v;
                revenue += v.getCharge();
                System.out.println("Vehicle parked at slot " + i);
                return;
            }
        }
        System.out.println("Parking is full");
    }

    public void removeVehicle(String num) {
        for (int i = 0; i < capacity; i++) {
            if (slots[i] != null && slots[i].getNumber().equals(num)) {
                slots[i] = null;
                System.out.println("Vehicle with number " + num + " removed from slot " + i);
                return;
            }
        }
        System.out.println("No vehicle found with number: " + num);
    }

    public int getRevenue() {
        return revenue;
    }

    public void showParkedVehicles() {
        boolean found = false;
        for (int i = 0; i < capacity; i++) {
            if (slots[i] != null) {
                System.out.println("Slot " + i + ": " + slots[i].getType() + " - " + slots[i].getNumber());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles are currently parked.");
        }
    }

    public void showRevenue() {
        System.out.println("Total Revenue: ₹" + revenue);
    }
}

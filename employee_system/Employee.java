package employee_system;

public class Employee {
    private int id;
    private String name;
    private String designation; // Junior, Mid, Senior, Lead
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void promote() {
        switch (designation.toLowerCase()) {
            case "junior":
                designation = "Mid";
                salary += 10000;
                System.out.println(name + " promoted to Mid. New salary: ₹" + salary);
                break;
            case "mid":
                designation = "Senior";
                salary += 15000;
                System.out.println(name + " promoted to Senior. New salary: ₹" + salary);
                break;
            case "senior":
                designation = "Lead";
                salary += 20000;
                System.out.println(name + " promoted to Lead. New salary: ₹" + salary);
                break;
            case "lead":
                System.out.println(name + " is already at the highest level (Lead).");
                break;
            default:
                System.out.println("Invalid designation for " + name);
        }
    }
}


package employee_system;

public class Company {
    private Employee[] employees;
    private int employeeCount;

    public Company(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }

    public void addEmployee(Employee emp) {
        if (employeeCount >= employees.length) {
            System.out.println("Company is full! Cannot add more employees.");
            return;
        }
        employees[employeeCount] = emp;
        employeeCount++;
        System.out.println("Employee " + emp.getName() + " added successfully.");
    }

    public Employee findEmployee(int id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void promoteEmployee(int id) {
        Employee emp = findEmployee(id);
        if (emp != null) {
            emp.promote();
        } else {
            System.out.println("Employee not found!");
        }
    }

    public void displayAllEmployees() {
        System.out.println("\n--- Employees List ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("ID: " + employees[i].getId() +
                    ", Name: " + employees[i].getName() +
                    ", Level: " + employees[i].getDesignation() +
                    ", Salary: ₹" + employees[i].getSalary());
        }
    }
}


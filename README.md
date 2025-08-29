# BridgeLabz - Day 3 Assignments: Object-Oriented System Designs 🛠️

This repository contains a collection of Java assignments completed as part of the BridgeLabz program. These assignments focus on applying **Object-Oriented Programming (OOP) principles** to design and implement various real-world systems, demonstrating robust problem-solving and modular code development.

---

## Systems / Assignments Included 📂

This repository is organized into several independent Java-based system simulations:

### 1. ATM System 💰

This system simulates the basic functionalities of an ATM.

* `ATM.java`: Core ATM logic for operations like withdrawal, deposit, check balance.
* `MiniATMSystem.java`: A simpler or condensed version of the ATM system.
* `User.java`: Defines the user entity for the ATM, including account details.

### 2. Bank System 🏦

A foundational banking system to manage accounts and transactions.

* `Account.java`: Represents a bank account.
* `Bank.java`: Core bank operations, managing multiple accounts.
* `BankSystem.java`: The main class or a broader system orchestrator for banking operations.

### 3. Employee System 🧑‍💼

A system for managing employee data and related organizational tasks.

* `Company.java`: Represents a company entity.
* `Employee.java`: Defines an employee, including attributes and methods.
* `EmployeePromotionSystem.java`: Logic related to employee promotion within the company.

### 4. Library System 📚

A basic library management system to handle books and their management.

* `Book.java`: Represents a book in the library.
* `Library.java`: Core library operations, managing a collection of books.
* `LibrarySystem.java`: The main class or a broader system orchestrator for library functions.

### 5. Parking Lot System 🚗🅿️

A system designed to simulate and manage vehicle parking within a designated area.

* `Bike.java`: Represents a `Bike` vehicle type.
* `Car.java`: Represents a `Car` vehicle type.
* `Main.java`: The main entry point for the parking lot application.
* `ParkingArea.java`: Defines the core logic for the parking lot.
* `Truck.java`: Represents a `Truck` vehicle type.
* `Vehicle.java`: A base class (or interface) defining common attributes and behaviors for all types of vehicles.

---

## Technologies Used

* **Language:** Java
* **IDE (Recommended):** IntelliJ IDEA, VS Code with Java extensions, or Eclipse.

---

## How to Run These Projects 🏃‍♂️

To get started with any of these Java-based systems, follow these steps:

1.  **Clone the Repository:**
    Open your terminal or Git Bash and clone this repository to your local machine:
    ```bash
    git clone [https://github.com/rohit1829/bridgelabz-day3.git](https://github.com/rohit1829/bridgelabz-day3.git)
    ```

2.  **Navigate to the Specific Project Directory:**
    Each system (e.g., `atm_system`, `bank_system`, `parking_lot_system`) resides in its own folder. Change your current directory into the system you wish to run:
    ```bash
    cd bridgelabz-day3/atm_system
    # OR
    cd bridgelabz-day3/parking_lot_system
    ```

3.  **Open in your IDE:**
    Import the entire `bridgelabz-day3` project into your preferred Java Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse). The IDE should recognize the project structure and build paths.

4.  **Compile and Run:**
    * Navigate to the specific system's folder (e.g., `atm_system`, `parking_lot_system`) within your IDE.
    * Locate the `Main.java` file (or the primary entry point like `ATM.java`, `BankSystem.java`, `Company.java`, `LibrarySystem.java` within their respective folders) which contains the `public static void main(String[] args)` method.
    * You can then compile and run this file directly from within your IDE.

    Alternatively, using the **command line** (assuming you are in the specific project's directory, e.g., `bridgelabz-day3/parking_lot_system`):
    ```bash
    # Compile all Java files in the current directory
    javac *.java
    # Run the main application (replace 'Main' with the actual main class for other systems)
    java Main
    ```

---

## Author

**CHAGALERU ROHITH**
* GitHub: [rohit1829](https://github.com/rohit1829)

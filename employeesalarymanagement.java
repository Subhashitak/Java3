import java.util.Scanner;

class Employee {
    // Fields
    private String name;
    private int id;
    private double basicSalary;
    private double allowances;

    // Default constructor
   
    // Parameterized constructor
    public Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Handle the case of zero employees
        if (numEmployees == 0) {
            System.out.println("No employees to manage.");
            scanner.close();
            return;
        }

        // Array to store employees
        Employee[] employees = new Employee[numEmployees];

        // Input details for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Create and store employee object
            employees[i] = new Employee(name, id, basicSalary, allowances);
        }

        // Display details of each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }

        // Close the scanner
        scanner.close();
    }
}

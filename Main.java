/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Check if Employee Exists");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    Employee newEmployee = new Employee(name, id);
                    if (employeeManager.addEmployee(newEmployee)) {
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee already exists.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Employee Name: ");
                    String checkName = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int checkId = scanner.nextInt();
                    Employee checkEmployee = new Employee(checkName, checkId);
                    if (employeeManager.employeeExists(checkEmployee)) {
                        System.out.println("Employee exists.");
                    } else {
                        System.out.println("Employee does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("List of Employees:");
                    employeeManager.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}



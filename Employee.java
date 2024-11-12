package lab02;
import java.util.*;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class EmployeeManager {
    private HashSet<Employee> employees;

    public EmployeeManager() {
        employees = new HashSet<>();
    }

    // Add a new employee
    public boolean addEmployee(Employee employee) {
        return employees.add(employee); // Returns true if the employee was added
    }

    // Check if an employee already exists
    public boolean employeeExists(Employee employee) {
        return employees.contains(employee);
    }

    // Display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}


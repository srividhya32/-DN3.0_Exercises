package EmployeeManagementSystem;

import java.util.Scanner;

public class Main {
    private static Employee[] employees = new Employee[10];
    private static int employeeCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Traverse Employees");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Exit");
            System.out.println("**********************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    searchEmployee(scanner);
                    break;
                case 3:
                    traverseEmployees();
                    break;
                case 4:
                    deleteEmployee(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void addEmployee(Scanner scanner) {
        if (employeeCount < employees.length) {
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Position: ");
            String position = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            employees[employeeCount++] = new Employee(id, name, position, salary);
            System.out.println("Employee added successfully.");
            System.out.println("**********************************");
        } else {
            System.out.println("Employee array is full.");
            System.out.println("**********************************");
        }
    }

    private static void searchEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == id) {
                System.out.println("Employee found: " + employees[i].getName() + ", " + employees[i].getPosition() + ", " + employees[i].getSalary());
                System.out.println("**********************************");
                return;
            }
        }
        System.out.println("Employee not found.");
        System.out.println("**********************************");
 
    }

    private static void traverseEmployees() {
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].getEmployeeId() + ": " + employees[i].getName() + ", " + employees[i].getPosition() + ", " + employees[i].getSalary());
        }
        
        System.out.println("**********************************");
    }

    private static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--employeeCount] = null;
                System.out.println("Employee deleted successfully.");
                System.out.println("**********************************");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}

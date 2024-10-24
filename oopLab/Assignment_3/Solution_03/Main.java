import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Full-time Employee");
            System.out.println("2. Add Part-time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Print Employees by Birth Year");
            System.out.println("5. Exit");
            System.out.print("Please select an option (1-5): ");

            int choice = input.nextInt();
            input.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addFullTimeEmployee();
                    break;
                case 2:
                    addPartTimeEmployee();
                    break;
                case 3:
                    displayAllEmployees();
                    break;
                case 4:
                    printEmployeesByBirthYearInput();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }

    private static void addFullTimeEmployee() {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter id: ");
        int id = input.nextInt();
        System.out.println("Enter birth day in integer: ");
        int day = input.nextInt();
        System.out.println("Enter birth month in integer: ");
        int month = input.nextInt();
        System.out.println("Enter birth year in integer: ");
        int year = input.nextInt();
        System.out.println("Enter monthly salary: ");
        double monthlySalary = input.nextDouble();
        input.nextLine(); // Clear the buffer

        Employee fullTimeEmp = new FulltimeEmployee(name, id, day, month, year, monthlySalary);
        addEmployee(fullTimeEmp);
    }

    private static void addPartTimeEmployee() {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter id: ");
        int id = input.nextInt();
        System.out.println("Enter birth day in integer: ");
        int day = input.nextInt();
        System.out.println("Enter birth month in integer: ");
        int month = input.nextInt();
        System.out.println("Enter birth year in integer: ");
        int year = input.nextInt();
        System.out.println("Enter work hour: ");
        int hr = input.nextInt();
        System.out.println("Enter hourly rate: ");
        double hrRate = input.nextDouble();
        input.nextLine(); // Clear the buffer

        Employee partTimeEmp = new ParttimeEmployee(name, id, day, month, year, hr, hrRate);
        addEmployee(partTimeEmp);
    }

    private static void addEmployee(Employee employee) {
        if (!isEmployeeIdExist(employee.getId())) {
            employees.add(employee);
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee ID already exists. Please try again.");
        }
    }

    private static void displayAllEmployees() {
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println("Employee type: " + e.getEmployeeType());
            System.out.println("Print Details: " + e);
            System.out.println("Salary: " + e.getSalary());
        }
    }

    private static void printEmployeesByBirthYearInput() {
        System.out.println("Enter birth year to find employee info: ");
        int birthYear = input.nextInt();
        printEmployeesByBirthYear(birthYear);
    }

    public static boolean isEmployeeIdExist(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void printEmployeesByBirthYear(int year) {
        System.out.println("Employees born in " + year + ":");
        for (Employee e : employees) {
            if (e.getDateOfBirth().get(Calendar.YEAR) == year) {
                System.out.println("Name: " + e.getName() + ", ID: " + e.getId() +
                        ", DOB: " + e.getDateOfBirth().get(Calendar.YEAR));
            }
        }
    }
}

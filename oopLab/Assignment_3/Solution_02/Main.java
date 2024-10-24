
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        // Main menu loop
        while (running) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (choice) {
                case 1 -> addOutdoorPatient();
                case 2 -> addIndoorPatient();
                case 3 -> sortPatientsByAge();
                case 4 -> printPatientsWithHighOrLowBloodPressure();
                case 5 -> showAllPatientDetails();
                case 0 -> {
                    System.out.println("Exiting the program.");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the menu
    public static void showMenu() {
        System.out.println("\n--- Patient Management Menu ---");
        System.out.println("1. Add Outdoor Patient");
        System.out.println("2. Add Indoor Patient");
        System.out.println("3. Sort Patients by Age");
        System.out.println("4. Print Patients with High or Low Blood Pressure");
        System.out.println("5. Show All Patient Details");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add an outdoor patient
    public static void addOutdoorPatient() {
        System.out.println("Enter OutdoorPatient details: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Systolic: ");
        int systolic = input.nextInt();
        System.out.print("Diastolic: ");
        int diastolic = input.nextInt();
        System.out.print("Diabetes Point: ");
        int diabetesPoint = input.nextInt();
        input.nextLine(); // Clear newline
        System.out.print("Specialty: ");
        String specialty = input.nextLine();
        System.out.print("Consultation Fee: ");
        double consultationFee = input.nextDouble();
        input.nextLine(); // Clear newline

        Patient outdoorPatient = new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, specialty, consultationFee);
        patients.add(outdoorPatient);
        System.out.println("Outdoor patient added successfully.");
    }

    // Method to add an indoor patient
    public static void addIndoorPatient() {
        System.out.println("Enter IndoorPatient details: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Systolic: ");
        int systolic = input.nextInt();
        System.out.print("Diastolic: ");
        int diastolic = input.nextInt();
        System.out.print("Diabetes Point: ");
        int diabetesPoint = input.nextInt();
        input.nextLine(); // Clear newline
        System.out.print("Admission Date: ");
        String admissionDate = input.nextLine();
        System.out.print("Bed No: ");
        int bedNo = input.nextInt();
        System.out.print("Daily Fee: ");
        double dailyFee = input.nextDouble();
        input.nextLine(); // Clear newline

        Patient indoorPatient = new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, admissionDate, bedNo, dailyFee);
        patients.add(indoorPatient);
        System.out.println("Indoor patient added successfully.");
    }

    // Method to sort patients by age
    public static void sortPatientsByAge() {
        Collections.sort(patients);
        System.out.println("Patients sorted by age.");
    }

    // Method to print patients with high or low blood pressure
    public static void printPatientsWithHighOrLowBloodPressure() {
        System.out.println("Patients with high or low blood pressure:");
        for (Patient p : patients) {
            if (p.getSystolic() > 120 || p.getDiastolic() < 80) {
                System.out.println(p);
            }
        }
    }

    // Method to show details of all patients
    public static void showAllPatientDetails() {
        System.out.println("Details of all patients:");
        for (Patient p : patients) {
            System.out.println("Patient type: " + p.getPatientType());
            System.out.println("Patient details: " + p);
            System.out.println("Invoice: " + p.getInvoice());
        }
    }
}

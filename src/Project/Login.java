package Project;

import java.util.Scanner;

public class Login {
    private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PASSWORD = "1234";

    private Scanner scanner = new Scanner(System.in);

    public String promptUserRole() {
        System.out.println("=== Welcome to Student Management System ===");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.print("Enter choice: ");
        return scanner.nextLine();
    }

    public boolean authenticateAdmin() {
        System.out.print("Admin Username: ");
        String user = scanner.nextLine();
        System.out.print("Admin Password: ");
        String pass = scanner.nextLine();
        return user.equals(ADMIN_USERNAME) && pass.equals(ADMIN_PASSWORD);
    }

    public String authenticateStudent(ManageStudent manageStudent) {
        System.out.print("Enter your Student ID: ");
        String studentId = scanner.nextLine();

        for (Student s : manageStudent.getStudents()) {
            if (s.getStudentId().equals(studentId)) {
                System.out.println("Welcome, " + s.getName());
                return studentId;
            }
        }

        System.out.println("Student ID not found.");
        return null;
    }
}

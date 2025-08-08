package Project;

import java.util.Scanner;

public class StudentPanel {
    private ManageEnrollment manageEnrollment;
    private ManageStudent manageStudent;
    private Scanner scanner = new Scanner(System.in);
    private String studentId;

    public StudentPanel(ManageStudent manageStudent, ManageEnrollment manageEnrollment, String studentId) {
        this.manageStudent = manageStudent;
        this.manageEnrollment = manageEnrollment;
        this.studentId = studentId;
    }

    public void run() {
        Student student = null;
        for (Student s : manageStudent.getStudents()) {
            if (s.getStudentId().equals(studentId)) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        boolean back = false;
        while (!back) {
            System.out.println("\n--- Student Panel ---");
            System.out.println("1. View Profile");
            System.out.println("2. View Enrolled Courses");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(student);
                    break;
                case "2":
                    viewStudentEnrollments();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void viewStudentEnrollments() {
        boolean found = false;
        for (Enrollment e : manageEnrollment.getEnrollments()) {
            if (e.getStudentId().equals(studentId)) {
                System.out.println("Enrolled in Course ID: " + e.getCourseId());
                found = true;
            }
        }
        if (!found) {
            System.out.println("You are not enrolled in any courses.");
        }
    }
}

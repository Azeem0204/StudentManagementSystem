package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageEnrollment {
    private ArrayList<Enrollment> enrollments = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void enrollStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course ID: ");
        String courseId = scanner.nextLine();

        enrollments.add(new Enrollment(studentId, courseId));
        System.out.println("Student enrolled in course.");
    }

    public void viewEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
        } else {
            for (Enrollment e : enrollments) {
                System.out.println(e);
            }
        }
    }

    public void removeEnrollment() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course ID: ");
        String courseId = scanner.nextLine();

        enrollments.removeIf(e -> e.getStudentId().equals(studentId) && e.getCourseId().equals(courseId));
        System.out.println("Enrollment removed if existed.");
    }

    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }
}

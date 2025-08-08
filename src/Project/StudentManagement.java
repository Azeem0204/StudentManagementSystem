package Project;
import java.util.Scanner;

public class StudentManagement {
    private ManageStudent manageStudent = new ManageStudent();
    private ManageCourse manageCourse = new ManageCourse();
    private ManageEnrollment manageEnrollment = new ManageEnrollment();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;
        while (running) {
            printMainMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    studentMenu();
                    break;
                case "2":
                    courseMenu();
                    break;
                case "3":
                    enrollmentMenu();
                    break;
                case "0":
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n=== Student Management System ===");
        System.out.println("1. Manage Students");
        System.out.println("2. Manage Courses");
        System.out.println("3. Manage Enrollments");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void studentMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Manage Students ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. List Students");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manageStudent.addStudent();
                    break;
                case "2":
                    manageStudent.updateStudent();
                    break;
                case "3":
                    manageStudent.removeStudent();
                    break;
                case "4":
                    manageStudent.listStudents();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void courseMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Manage Courses ---");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Remove Course");
            System.out.println("4. List Courses");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manageCourse.addCourse();
                    break;
                case "2":
                    manageCourse.updateCourse();
                    break;
                case "3":
                    manageCourse.removeCourse();
                    break;
                case "4":
                    manageCourse.listCourses();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void enrollmentMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Manage Enrollments ---");
            System.out.println("1. Enroll Student in Course");
            System.out.println("2. View Enrollments");
            System.out.println("3. Remove Enrollment");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manageEnrollment.enrollStudent();
                    break;
                case "2":
                    manageEnrollment.viewEnrollments();
                    break;
                case "3":
                    manageEnrollment.removeEnrollment();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

package Project;
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        ManageStudent manageStudent = new ManageStudent();
        ManageCourse manageCourse = new ManageCourse();
        ManageEnrollment manageEnrollment = new ManageEnrollment();

        String role = login.promptUserRole();

        if (role.equals("1")) {
            if (login.authenticateAdmin()) {
                StudentManagement adminSystem = new StudentManagement(
                );
                adminSystem.run();
            } else {
                System.out.println("Admin authentication failed.");
            }

        } else if (role.equals("2")) {
            String studentId = login.authenticateStudent(manageStudent);
            if (studentId != null) {
                StudentPanel studentPanel = new StudentPanel(
                    manageStudent, manageEnrollment, studentId
                );
                studentPanel.run();
            }

        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}



package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ManageStudent() {
        // Preloaded Indian student data
        students.add(new Student("101", "Rahul Sharma", "rahul.sharma@gmail.in"));
        students.add(new Student("102", "Priya Verma", "priya.verma@gmail.in"));
        students.add(new Student("103", "Amit Patel", "amit.patel@gmail.in"));
        students.add(new Student("104", "Sneha Reddy", "sneha.reddy@gmail.in"));
        students.add(new Student("105", "Vikram Singh", "vikram.singh@gmail.in"));
    }

    public void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        students.add(new Student(id, name, email));
        System.out.println("Student added successfully.");
    }

    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.print("Enter new name: ");
                s.setName(scanner.nextLine());
                System.out.print("Enter new email: ");
                s.setEmail(scanner.nextLine());
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        String id = scanner.nextLine();
        students.removeIf(s -> s.getStudentId().equals(id));
        System.out.println("Student removed if existed.");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

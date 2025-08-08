package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCourse {
	 private ArrayList<Course> courses = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);

	    public ManageCourse() {
	        // Preloaded Indian-style courses
	        courses.add(new Course("CSE101", "B.Tech Computer Science", 4));
	        courses.add(new Course("ECE201", "B.Tech Electronics", 4));
	        courses.add(new Course("BBA301", "Bachelor of Business Administration", 3));
	        courses.add(new Course("BSC401", "B.Sc Mathematics", 3));
	        courses.add(new Course("MBA501", "Master of Business Administration", 2));
	    }

    public void addCourse() {
        System.out.print("Enter course ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter credits: ");
        int credits = Integer.parseInt(scanner.nextLine());

        courses.add(new Course(id, name, credits));
        System.out.println("Course added successfully.");
    }

    public void updateCourse() {
        System.out.print("Enter course ID to update: ");
        String id = scanner.nextLine();
        for (Course c : courses) {
            if (c.getCourseId().equals(id)) {
                System.out.print("Enter new name: ");
                c.setCourseName(scanner.nextLine());
                System.out.print("Enter new credits: ");
                c.setCredits(Integer.parseInt(scanner.nextLine()));
                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void removeCourse() {
        System.out.print("Enter course ID to remove: ");
        String id = scanner.nextLine();
        courses.removeIf(c -> c.getCourseId().equals(id));
        System.out.println("Course removed if existed.");
    }

    public void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            for (Course c : courses) {
                System.out.println(c);
            }
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

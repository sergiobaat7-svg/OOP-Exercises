
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;
    private List<String> courses;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Method to remove a course
    public boolean removeCourse(String course) {
        return courses.remove(course);
    }

   
public static void main(String[] args) {
    Student student = new Student("Sergio", "2nd year of college");

    // Add courses
    student.addCourse("NETWORING");
    student.addCourse("DSA");
    student.addCourse("OOP");

    // Print name, grade, and courses
    System.out.println("Name: " + student.getName());
    System.out.println("Grade: " + student.getGrade());
    System.out.println("Courses: " + student.getCourses());

    // Remove a course
    student.removeCourse("DSA");

    // Print updated courses
    System.out.println("Courses after removal: " + student.getCourses());
}
}

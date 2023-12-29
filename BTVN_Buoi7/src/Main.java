import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.getStudents();
        university.getCourses();
        Student s= new Student();
        university.addStudent(s);
        university.removeStudent(s);
        Course c= new Course();
        university.addCourse(c);
        university.removeCourse(c);
        university.enrollStudentInCourse();
    }
}
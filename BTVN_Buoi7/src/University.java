import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students;
    private List<Course> courses;
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public University(List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public University() {
    }
    public void getStudents() {
        for(Student i: students) i.displayInfor();
    }
    public void getCourses() {
        for(Course i: courses) i.displayInfor();
    }
    public void addStudent(Student s) {
        students.add(s);
    }
    public void removeStudent(Student s) {
        for(int i=0;i<students.size();i++)
            if(students.get(i).getId().equals(s.getId()))
                students.remove(i);
    }
    public void addCourse(Course s) {
        courses.add(s);
    }
    public void removeCourse(Course s) {
        for(int i=0;i<courses.size();i++)
            if(courses.get(i).getCourseID().equals(s.getCourseID()))
                courses.remove(i);
    }
    public Student findStudent(String id) {
        for (Student s : students) {
            if(s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public Course findCourse(String id) {
        for (Course s : courses) {
            if(s.getCourseID().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void enrollStudentInCourse() {
        Scanner sc= new Scanner(System.in);
        String studentId = sc.nextLine();
        String courseId = sc.nextLine();
        Student s = findStudent(studentId);
        Course c = findCourse(courseId);
        c.enrolStudent(s);
    }
}

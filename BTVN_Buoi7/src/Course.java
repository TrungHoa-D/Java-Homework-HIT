import java.util.ArrayList;
import java.util.List;

public class Course implements Displayable{
    private String courseID;
    private String courseName;
    private List<Student> students;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course(String courseID, String courseName, List<Student> students) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.students = students;
    }

    public Course() {
    }
    public void enrolStudent(Student student) {
        students.add(student);
        student.enroll(this);
    }
    @Override
    public void displayInfor() {
        System.out.println("Course ID: "+this.getCourseID());
        System.out.println("Course Name: "+this.getCourseName());
        for(Student i : students) {
            i.displayInfor();
        }
    }
}

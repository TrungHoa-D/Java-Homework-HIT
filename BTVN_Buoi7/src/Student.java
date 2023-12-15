import java.util.List;

public class Student extends Person{
    private int age;
    private String grade;
    private List<Course> courses;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String id, String name, int age, String grade) {
        super(id, name);
        this.age = age;
        this.grade = grade;
    }
    public void enroll(Course course) {
        courses.add(course);
    }
    public Student() {
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Age: "+this.getAge());
        System.out.println("Grade: "+this.getGrade());
    }
}

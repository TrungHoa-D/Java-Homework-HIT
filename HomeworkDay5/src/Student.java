import java.util.Scanner;

public class Student extends Person implements Comparable<Student>{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria =2;

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.gpa, o.gpa);
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("Input information of Student");
        System.out.print("Input student ID: ");this.setId(sc.nextInt());sc.nextLine();
        System.out.print("Input class: ");this.setNameClass(sc.nextLine());
        System.out.print("Input GPA: ");this.setGpa(sc.nextFloat());sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Student ID: "+this.getId());
        System.out.println("Class: "+this.getNameClass());
        System.out.println("GPA: "+this.getGpa());
    }
    public void outputTable() {
        System.out.printf("%-5d%-15s%-5d%-15s%-15s%-15s%-15s%-10.2f\n",this.getId(),this.getName(),this.getAge(),this.getAddress().getCommune(),this.getAddress().getDistrict(),this.getAddress().getCity(),this.getNameClass(),this.getGpa());
    }
    private boolean checkFall()
    {
        if(this.getGpa()< this.getCriteria()) return true;
        return false;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student() {
    }
}

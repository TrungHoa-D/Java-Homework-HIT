import java.util.Scanner;

public class Student {
    private static int count =1;
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
        this.id=count++;
    }
    public void display() {
        System.out.printf("%5d%30s%10d%30s%10.2f",this.getId(),this.getName(),this.getAge(),this.getAddress(),this.getGpa());
    }

    public Student(String name, int age, String address, double gpa) {
        this.id=count++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input student name: ");
        setName(sc.nextLine());
        System.out.println("Input student age: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Input student address: ");
        setAddress(sc.nextLine());
        System.out.println("Input student GPA: ");
        setGpa(sc.nextDouble());
        sc.nextLine();
    }
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

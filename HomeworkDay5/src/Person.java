import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Address address =new Address();
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input personal information");
        System.out.print("Input name: ");this.setName(sc.nextLine());
        System.out.print("Input age: ");this.setAge(sc.nextInt());sc.nextLine();
        address.input();
    }
    public void output() {
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        address.output();
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }
}

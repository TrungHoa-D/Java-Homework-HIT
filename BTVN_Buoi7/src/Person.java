public class Person implements Displayable{
    private String id;
    private String name;
    @Override
    public void displayInfor() {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }
}

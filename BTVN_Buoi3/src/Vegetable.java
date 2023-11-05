import java.util.Scanner;

public class Vegetable {
    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input vegetable!");
        System.out.print("Input ID: ");
        String id=sc.nextLine();
        this.id=id;
        System.out.print("Input name: ");
        String name=sc.nextLine();
        this.name=name;
        System.out.print("Input unit: ");
        String unit=sc.nextLine();
        this.unit=unit;
        System.out.print("Input Quantity sold: ");
        int qs=sc.nextInt();sc.nextLine();
        this.quantitySold=qs;
        System.out.print("Input Sale: ");
        int sale=sc.nextInt();sc.nextLine();
        this.sale=sale;
        System.out.print("Input price: ");
        double price=sc.nextDouble();sc.nextLine();
        this.price=price;
    }
    public void display () {
        System.out.printf("%-3s%-15s%-10s%-15d%-5d%-15.0f%-15.0f\n", id, name, unit, quantitySold, sale, price, getTotalRevenue());
    }
    public double getTotalRevenue(){
        return (price*(100-sale)/100*quantitySold);
    }
    public Vegetable() {
    }

    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

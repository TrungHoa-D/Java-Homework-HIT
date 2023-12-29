import java.util.Scanner;

public class Product implements Comparable<Product> {
    private String name;
    private String dvt;
    private int number;
    private int cost;
    @Override
    public int compareTo(Product o) {
        return Integer.compare(o.cost, this.cost);
    }
    public long total() {
        return cost*number;
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập sản phẩm: ");
        System.out.print("Nhập tên hàng hóa, dịch vụ: ");
        name=sc.nextLine();
        System.out.print("Nhập đơn vị tính: ");
        dvt=sc.nextLine();
        System.out.print("Nhập số lượng: ");
        number=sc.nextInt();sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        cost=sc.nextInt();sc.nextLine();
    }
    public void output() {
        System.out.printf("%-25s%-15s%-15d%-15d%-15d\n",name,dvt,number,cost,this.total());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name, String dvt, int number, int cost) {
        this.name = name;
        this.dvt = dvt;
        this.number = number;
        this.cost = cost;
    }

    public Product() {
    }
}

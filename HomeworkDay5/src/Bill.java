import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bill {
    private String kyHieu;
    private int num;
    private String date;
    private Seller seller=new Seller();
    private Customer customer=new Customer();
    private ArrayList<Product> li = new ArrayList<>();
    public long total(){
        long ans=0;
        for(Product i: li) ans+=i.total();
        return ans;
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập ký hiệu: ");
        kyHieu=sc.nextLine();
        System.out.print("Nhập số hóa đơn: ");
        num=sc.nextInt();sc.nextLine();
        System.out.print("Nhập ngày lập: ");
        date=sc.nextLine();
        seller.input();
        customer.input();
        System.out.println("Nhập số sản phẩm: ");
        int n=sc.nextInt();sc.nextLine();
        for(int i=1;i<=n;i++) {
            Product product= new Product();
            product.input();
            li.add(product);
        }
        Collections.sort(li);
    }
    public Product most() {
        int n=0;
        Product ans= new Product();
        for(Product i: li) if(i.getNumber()>n) {
            n=i.getNumber();
            ans=i;
        }
        return ans;
    }
    public void output() {
        System.out.println("                     HÓA ĐƠN BÁN HÀNG                     ");
        System.out.printf("%-50s\n",("Ký hiệu: "+kyHieu));
        System.out.printf("%-50s\n",("Số: "+num));
        System.out.println("                "+date);
        seller.output();
        System.out.println("----------------------------------------------------------------");
        customer.output();
        System.out.println("----------------------------------------------------------------");
        int c=1;
        System.out.printf("%-5s%-25s%-15s%-15s%-15s%-15s\n","STT","Tên hàng hóa, dịch vụ","Đơn vị tính","Số lươợng","Đơn giá","Thành tiền");
        for(Product i:li) {
            System.out.printf("%-5d",c);
            i.output();
        }
        System.out.println("Tổng tiền thanh toán: "+this.total());
        System.out.printf("%-20s%-20s\n","Người mua hàng","Người bán hàng");
        System.out.printf("%-20s%-20s\n",customer.getName(), seller.getName());
        System.out.println("Cần kiểm tra, đối chiếu khi lập, nhận hóa đơn");
    }
    public String getKyHieu() {
        return kyHieu;
    }

    public void setKyHieu(String kyHieu) {
        this.kyHieu = kyHieu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getLi() {
        return li;
    }

    public void setLi(ArrayList<Product> li) {
        this.li = li;
    }

    public Bill(String kyHieu, int num, String date, Seller seller, Customer customer, ArrayList<Product> li) {
        this.kyHieu = kyHieu;
        this.num = num;
        this.date = date;
        this.seller = seller;
        this.customer = customer;
        this.li = li;
    }

    public Bill() {
    }
}

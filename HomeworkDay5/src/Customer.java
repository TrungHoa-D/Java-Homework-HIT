import java.util.Scanner;

public class Customer {
    private String fullName;
    private String name;
    private String diaChi;
    private String stk;
    private String httt;
    private String mst;
    private String money;
    public void output() {
        System.out.println("Họ và tên người mua hàng: "+fullName);
        System.out.println("Tên người mua: "+name);
        System.out.println("Địa chỉ: "+diaChi+" Số tài khoản: "+stk);
        System.out.println("Hình thức thanh toán: "+httt+" MST: "+mst+" Đồng tiền thanh toán: "+money);
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin người mua hàng");
        System.out.print("Nhập họ và tên người mua: ");fullName=sc.nextLine();
        System.out.print("Nhập tên người mua: ");name=sc.nextLine();
        System.out.print("Nhập địa chỉ người mua: ");diaChi=sc.nextLine();
        System.out.print("Nhập số tài khoản người mua: ");stk=sc.nextLine();
        System.out.print("Nhập hình thức thanh toán: ");httt=sc.nextLine();
        System.out.print("Nhập mã số thuế người mua: ");mst=sc.nextLine();
        System.out.print("Nhập đồng tiền thanh toán: ");money=sc.nextLine();
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getHttt() {
        return httt;
    }

    public void setHttt(String httt) {
        this.httt = httt;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Customer(String fullName, String name, String diaChi, String stk, String httt, String mst, String money) {
        this.fullName = fullName;
        this.name = name;
        this.diaChi = diaChi;
        this.stk = stk;
        this.httt = httt;
        this.mst = mst;
        this.money = money;
    }

    public Customer() {
    }
}

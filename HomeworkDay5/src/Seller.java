import java.util.Scanner;

public class Seller {
    private String name;
    private String mst;
    private String diaChi;
    private String stk;
    private String phoneNumber;

    public Seller() {
    }

    public Seller(String name, String mst, String diaChi, String stk, String phoneNumber) {
        this.name = name;
        this.mst = mst;
        this.diaChi = diaChi;
        this.stk = stk;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin người bán");
        System.out.print("Nhập tên người bán: ");name=sc.nextLine();
        System.out.print("Nhập mã số thuế: ");mst=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");diaChi=sc.nextLine();
        System.out.print("Nhập số tài khoản: ");stk=sc.nextLine();
        System.out.print("Nhập số điện thoại: ");phoneNumber=sc.nextLine();
    }
    public void output() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Tên người bán: "+name);
        System.out.println("Mã số thuế: "+mst);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Số tài khoản: "+stk);
        System.out.println("Điện thoại: "+phoneNumber);
    }
}

import java.util.Scanner;

public class Sach {
    private String id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x;
    public void output(){
        System.out.println("ID: "+id+"\nTên sách: "+tenSach+"\nThể loại: "+theLoai+"\nNăm xuất bản: "+namXuatBan);
        x.output();
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin sách!");
        System.out.print("Nhập id sách: ");id=sc.nextLine();
        System.out.print("Nhập tên sách: ");tenSach=sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");namXuatBan=sc.nextInt();sc.nextLine();
        System.out.print("Nhập thể loại sách: ");theLoai=sc.nextLine();
        x.input();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    public Sach(String id, String tenSach, int namXuatBan, String theLoai, TacGia x) {
        this.id = id;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.x = x;
    }

    public Sach() {
    }
}

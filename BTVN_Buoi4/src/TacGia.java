import java.util.Scanner;

public class TacGia {
    private String tenTacGia;
    private int namSinh;
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thong tin tác giả!");
        System.out.print("Nhập tên tác giả: ");tenTacGia=sc.nextLine();
        System.out.print("Nhập năm sinh tác giả: ");namSinh=sc.nextInt();sc.nextLine();
    }
    public void output(){
        System.out.println("Tên tác giả: "+tenTacGia+", năm sinh: "+namSinh);
    }
    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public TacGia() {
    }
}

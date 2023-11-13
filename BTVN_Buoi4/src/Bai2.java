import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    private static ArrayList<May> mays= new ArrayList<>();
    private static PhongMay phongMay= new PhongMay();
    private static int n=0;
    static {
        mays.add(new May(1,"Dell","Tốt"));
        mays.add(new May(2,"Asus","Tốt"));
        mays.add(new May(3,"Lenovo","Khá"));
        mays.add(new May(4,"HP","Tệ"));
        mays.add(new May(5,"Acer","Tốt"));
        QuanLy quanLy= new QuanLy("01","Liên");
        phongMay= new PhongMay("001","Lab",quanLy,mays,5);
    }
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("Menu");
        System.out.println("1. Nhập thông tin phòng máy");
        System.out.println("2. In ra thông tin phòng máy");
        System.out.println("3. Tìm máy theo kiểu máy");
        System.out.println("4. Tìm máy theo mã máy");
        System.out.println("5. Thoát");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean go=true;
        while(go) {
            menu();
            System.out.print("Nhập lựa chọn: ");
            int choose=sc.nextInt();sc.nextLine();
            if(choose==1) {
                phongMay.input();
            } else if (choose==2) {
                phongMay.output();
            } else if (choose==3) {
                System.out.print("Nhập kiểu máy cần tìm: ");
                String kieuMay=sc.nextLine();
                for(May i: phongMay.getMays()) if(i.getKieuMay().equals(kieuMay)) i.output();
            } else if (choose==4) {
                System.out.print("Nhập mã máy cần tìm: ");
                int maMay=sc.nextInt();sc.nextLine();
                for(May i: phongMay.getMays()) if(i.getMaMay()==maMay) i.output();
            } else if (choose==5) {
                go=false;
                System.out.println("Đã thoát!");
            }
        }
    }
}
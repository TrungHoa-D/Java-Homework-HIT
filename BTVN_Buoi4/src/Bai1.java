import java.util.Scanner;

public class Bai1 {
    private static Sach[] saches= new Sach[10000];
    private static int n=0;
    static {
        n=5;
        TacGia x= new TacGia("Cô Đơn Địa Phi",1970);
        saches[1]= new Sach("1","Đạo",1992,"Luận",x);
        saches[2]= new Sach("2","Nhất",1994,"Luận",x);
        saches[3]= new Sach("3","Vạn",1932,"Luận",x);
        saches[4]= new Sach("4","Cầu",1972,"Luận",x);
        saches[5]= new Sach("5","Thất",1996,"Luận",x);
    }
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("Menu");
        System.out.println("1. Nhập n cuốn sách");
        System.out.println("2. In ra thông tin các cuốn sách");
        System.out.println("3. Tìm sách theo tên");
        System.out.println("4. Sắp xếp lại sách theo tên tác giả");
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
                System.out.print("Nhập số cuốn sách muốn nhập: ");
                int N=sc.nextInt();sc.nextLine();
                while(N>0) {
                    N--;
                    n++;
                    Sach sach= new Sach();
                    sach.input();
                    saches[n]=sach;
                }
            } else if (choose==2) {
                for (int i=1;i<=n;i++) saches[i].output();
            } else if (choose==3) {
                System.out.print("Nhập tên sách cần tìm: ");
                String name=sc.nextLine();
                for(int i=1;i<=n;i++) if(name.equals(saches[i].getTenSach())) saches[i].output();
            } else if (choose==4) {
                for(int i=1;i<n;i++)
                    for(int j=i+1;j<=n;j++)
                        if(saches[i].getX().getTenTacGia().compareTo("")>saches[j].getX().getTenTacGia().compareTo(""))
                        {
                            Sach t=saches[i];
                            saches[i]=saches[j];
                            saches[j]=t;
                        }
            } else if (choose==5) {
                go=false;
                System.out.println("Đã thoát!");
            }
        }
    }
}
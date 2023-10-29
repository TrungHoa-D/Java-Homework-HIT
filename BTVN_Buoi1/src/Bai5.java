import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập 5 số nguyên : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<y) {
            x=x+y;
            y=x-y;
            x=x-y;
        }
        {
            int a=sc.nextInt();
            if(a>x) {
                y=x;
                x=a;
            }
            else if(a<=x && a>y) {
                y=a;
            }
        }
        {
            int a=sc.nextInt();
            if(a>x) {
                y=x;
                x=a;
            }
            else if(a<=x && a>y) {
                y=a;
            }
        }
        {
            int a=sc.nextInt();
            if(a>x) {
                y=x;
                x=a;
            }
            else if(a<=x && a>y) {
                y=a;
            }
        }
        System.out.println("hai số lớn nhất là: "+y+" "+x);
    }
}

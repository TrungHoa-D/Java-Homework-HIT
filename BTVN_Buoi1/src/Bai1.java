import java.util.Scanner;

public class Bai1 {
    public static int GCD(int x, int y)
    {
        if(x>y) {
            x=x+y;
            y=x-y;
            x=x-y;
        }
        if(x==0) return y;
        return GCD(y%x,x);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập a,b,c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("BCNN(a, b, c)= "+ (a*b/GCD(a,b))*c/GCD(c,a*b/GCD(a,b)) );
        System.out.println("UCLN(a, b, c)= "+ GCD(GCD(a,b),c));
    }
}

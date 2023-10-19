import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n=sc.nextInt();
        long s=1;
        while(n>0)
        {
            s*=n%10;
            n/=10;
        }
        System.out.println("tích các chữ số của số nguyên n là: "+s);
    }
}

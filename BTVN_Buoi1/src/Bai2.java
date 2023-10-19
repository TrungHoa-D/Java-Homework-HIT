import java.util.Scanner;

public class Bai2 {
    public static String trans(int a, int b)
    {
        String ans="";
        while(a!=0)
        {
            if(a%b== 10) {ans='A'+ans;}
            else if(a%b== 11) {ans='B'+ans;}
            else if(a%b== 12) {ans='C'+ans;}
            else if(a%b== 13) {ans='D'+ans;}
            else if(a%b== 14) {ans='E'+ans;}
            else if(a%b== 15) {ans='F'+ans;}
            else {ans=a%b+ans;}
            a/=b;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số hệ 10: ");
        int a=sc.nextInt();
        System.out.print("Nhập hệ cơ số b: ");
        int b=sc.nextInt();
        System.out.println("Số hệ "+b+": "+trans(a,b));
    }
}

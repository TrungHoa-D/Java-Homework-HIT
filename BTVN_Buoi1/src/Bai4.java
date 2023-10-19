import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập phép tính: ");
        String s=sc.nextLine();
        int a=0;
        int b=0;
        int t=1;
        boolean f=true;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ' && f) {
                f=false;
                i++;
                if(s.charAt(i)=='+') {t=1;}
                else if(s.charAt(i)=='-') {t=2;}
                else if(s.charAt(i)=='*') {t=3;}
                else if(s.charAt(i)=='/') {t=4;}
                i+=2;
            }
            if(f) a=a*10+(int)(s.charAt(i)-48);
            else b=b*10+(int)(s.charAt(i)-48);
        }
        //System.out.println(a+" "+b);
        if( t ==1) {
            System.out.print("= "+a+b);
        }
        else if (t==2) {
            System.out.print("= "+(a-b));
        }
        else if (t==3) {
            System.out.print("= "+a*b);
        }
        else if (t==4) {
            System.out.print("= "+a/b);
        }
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        String regexDate="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập ngày theo định dạng(dd/MM/yyyy): ");
        String date=sc.nextLine();
        Pattern pattern= Pattern.compile(regexDate);
        Matcher matcher= pattern.matcher(date);
        if(matcher.matches()){
            System.out.println("Hợp lệ");
        }
        else{
            System.out.println("Không hợp lệ");
        }
    }
}

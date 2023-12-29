import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String regexIP= "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        System.out.print("Nhập địa chỉ IP: ");
        String IP= sc.nextLine();
        Pattern pattern= Pattern.compile(regexIP);
        Matcher matcher= pattern.matcher(IP);
        if(matcher.matches()){
            System.out.println("IP hợp lệ!");
        }
        else {
            System.out.println("IP không hợp lệ");
        }
    }
}

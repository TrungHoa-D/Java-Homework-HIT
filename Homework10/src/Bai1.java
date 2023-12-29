import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    public  static List<String> username= new ArrayList<>();
    public static void menu() {
        System.out.println("\n1. Tạo tài khoản mới");
        System.out.println("2. Dừng chương trình");
        System.out.print("Nhập lựa chọn: ");
    }
    public static boolean exist(String name) {
        for(String i: username) if(i.equals(name)) return false;
        return true;
    }
    public static void main(String[] args) {
        String regexUsername = "^(?!^\\d)[a-z\\d]{6,}$";
        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=])[A-Za-z\\d!@#$%^&*()-_+=]{8,}$";
        Scanner sc= new Scanner(System.in);
        boolean go=true;
        while(go) {
            menu();
            int choose=sc.nextInt();sc.nextLine();
            if(choose==1) {
                boolean right=false;
                while(!right){
                    right=true;
                    System.out.println("Đăng kí tài khoản");
                    System.out.print("Tên đăng nhập: ");
                    String userName=sc.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String pass= sc.nextLine();
                    Pattern pattern = Pattern.compile(regexUsername);
                    Matcher matcher = pattern.matcher(userName);
                    if(matcher.matches()){}
                    else
                    {
                        System.out.println("Tên người dùng không khả dụng!");
                        right=false;
                    }
                    pattern = Pattern.compile(regexPassword);
                    matcher = pattern.matcher(pass);
                    if(matcher.matches()){}
                    else
                    {
                        System.out.println("Mật khẩu không hợp lệ");
                        right=false;
                    }
                    if(!exist(userName)) {
                        System.out.println("Tên người dùng đã tồn tại");
                        right=false;
                    }
                    if(right) {
                        System.out.println("Đăng kí thành công!");
                        username.add(userName);
                    }
                }
            }
            else {
                System.out.println("Dừng chương trình!");
                go=false;
            }
        }
    }
}

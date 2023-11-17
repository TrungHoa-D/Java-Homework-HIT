import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void menu() {
        System.out.println("========================");
        System.out.println("Menu manage class");
        System.out.println("1. Input student");
        System.out.println("2. Show student");
        System.out.println("3. Sort by GPA");
        System.out.println("4. Delete student by ID");
        System.out.println("5. Exit");
        System.out.print("Enter your choose: ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ClassRoom classRoom= new ClassRoom();
        boolean go=true;
        while(go) {
            menu();
            int choose=sc.nextInt();sc.nextLine();
            if(choose==1) {
                classRoom.input();
            }
            else if(choose==2) {
                classRoom.output();
            }
            else if(choose==3) {
                classRoom.sortByGPA();
            }
            else if(choose==4) {
                System.out.print("Input student ID need remove: ");
                int id=sc.nextInt();sc.nextLine();
                if(classRoom.removeByID(id)) System.out.println("Remove success!");
                else System.out.println("remove failure");
            }
            else if(choose==5) {
                System.out.println("Exit!");
                go=false;
            }
        }
    }
}

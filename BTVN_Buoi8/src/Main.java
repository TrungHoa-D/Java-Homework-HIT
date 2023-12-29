import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("MENU");
        System.out.println("1.Add Student");
        System.out.println("2.Delete Student");
        System.out.println("3.Display");
        System.out.println("4.Find Student");
        System.out.println("5.Sort");
        System.out.println("6.Exit");
        System.out.print("Choose your choice: ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StudentArrayList studentArrayList= new StudentArrayList();
        boolean go=true;
        if(go) {
            Menu();
            int choice= sc.nextInt();sc.nextLine();
            if(choice==1)
            {
                Student x= new Student();
                x.input();
                studentArrayList.add(x);
            }
            else if(choice==2)
            {
                studentArrayList.display();
            }
            else if(choice==3)
            {

            }
            else if(choice==4)
            {

            }
            else if(choice==5)
            {

            }
            else if(choice==6)
            {
                go=false;
                System.out.println("Exit!");
            }
        }
    }
}
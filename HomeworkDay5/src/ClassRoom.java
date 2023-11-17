import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassRoom {
    private static ArrayList<Student> li= new ArrayList<>();
    public void sortByGPA() {
        Collections.sort(li);
    }
    public void input() {
        Scanner sc= new Scanner(System.in);
        boolean go=true;
        while(go==true) {
            Student student= new Student();
            student.input();
            li.add(student);
            if (student.getId()== 555) go=false;
        }
    }
    public void output() {
        System.out.printf("%-5s%-15s%-5s%-15s%-15s%-15s%-15s%-10s\n","ID","Name","Age","Commune","District","City","Class","GPA");
        for(Student i : li) {
            i.outputTable();
        }
    }
    public boolean removeByID(int iD) {
        for(Student i : li)
            if(i.getId()== iD){
                li.remove(i);
                return true;
            }
        return false;
    }
    public ClassRoom( ArrayList<Student> li) {
        this.li=li;
    }

    public ClassRoom() {
    }

    public static ArrayList<Student> getLi() {
        return li;
    }

    public static void setLi(ArrayList<Student> li) {
        ClassRoom.li = li;
    }
}

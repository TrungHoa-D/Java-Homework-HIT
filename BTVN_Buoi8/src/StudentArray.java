import java.util.ArrayList;
import java.util.List;

public class StudentArray {
    private ArrayList<Student> s= new ArrayList<>();

    public StudentArray() {
    }

    public StudentArray(ArrayList<Student> s) {
        this.s = s;
    }

    public ArrayList<Student> getS() {
        return s;
    }

    public void setS(ArrayList<Student> s) {
        this.s = s;
    }

    public int size() {
        return s.size();
    }
    public boolean isEmpty() {
        if(this.size()==0) return true;
        else return false;
    }
    public void display() {
        System.out.printf("%5d%30s%10d%30s%10.2f","ID","Name","Age","Address","GPA");
        for(Student i: s) i.display();
    }
}

import java.util.Collection;
import java.util.List;

public class StudentSet extends StudentArray{
    private StudentComparator comparator;
    public void sort() {
        this.setS(this.getS().sort(););
    }
    public StudentSet() {
        sort();
    }

    public StudentSet(Student[] s, StudentComparator comparator) {
        super(s);
        this.comparator = comparator;
        sort();
    }

    public StudentComparator getComparator() {
        return comparator;
    }

    public void setComparator(StudentComparator comparator) {
        this.comparator = comparator;
    }
    public void insert(Student sv) {
        Student s[]= new Student[this.size()+1];
        s=this.getS();
        s[this.size()]= sv;
        this.setS(s);
        sort();
    }
    public void remove(Student sv) {
        int ID=-1;
        for(Student i: this.getS()) if(i.getId()==sv.getId()) ID=i.getId();
        if(ID!=-1) {
            Student[] s = new Student[this.size() - 1];
            for (int i = 0; i < this.size(); i++) {
                if (this.getS()[i].getId() < ID) s[i] = this.getS()[i];
                if (this.getS()[i].getId() > ID) s[i - 1] = this.getS()[i];
            }
            this.setS(s);
        }
    }
    public boolean contain(Student sv) {
        int ID=-1;
        for(Student i: this.getS()) if(i.getId()==sv.getId()) ID=i.getId();
        if(ID==-1) return false;
        else return true;
    }
}

public class StudentArrayList extends StudentArray{
    public StudentArrayList() {
    }

    public StudentArrayList(Student[] s) {
        super(s);
    }
    public void add(Student sv) {
        Student[] x= new Student[2];
        if(this.getS()!=null)x=this.getS();
        x[this.size()]= sv;
        this.setS(x);
    }
    public void delete(Student sv) {
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
    private void sort(StudentComparator comparator) {
        Student[] s=this.getS();
        for(int i=0;i<this.size()-1;i++)
            for(int j=i+1;j<this.size();j++)
                if(!comparator.compare(s[i],s[j])) {
                    Student t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
        this.setS(s);
    }
}

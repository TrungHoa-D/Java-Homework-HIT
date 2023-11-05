import java.util.Scanner;

public class Main_Vegetable {
    public static void menu(){
        System.out.println("-------------------------------------");
        System.out.println("Manger Vegetable Menu");
        System.out.println("1.Add new vegetable");
        System.out.println("2.Show vegetable list");
        System.out.println("3.Sort by revenue");
        System.out.println("4.Sort by unit");
        System.out.println("5.Search by name");
        System.out.println("6.Exit");
        System.out.print("Choose your option(1-6): ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vegetable[] vegetables= new Vegetable[100001];
        int n=0;
        boolean go=true;
        while (go) {
            System.out.print("Press Enter to continue!");
            sc.nextLine();
            menu();
            int choose=sc.nextInt();sc.nextLine();
            if(choose==1) {
                Vegetable vegetable=new Vegetable();
                vegetable.input();
                boolean ac=true;
                for(int i=1;i<=n;i++)
                    if(vegetable.getId().equals(vegetables[i].getId())) {
                        ac=false;
                        break;
                    }
                if(ac) {n++;vegetables[n]=vegetable;}
                else System.out.println("Add failed! Id already exists!");
            }
            else if(choose==2){
                System.out.printf("%-3s%-15s%-10s%-15s%-5s%-15s%-15s\n","Id","Name","Unit","Quantity sold","Sale", "Price","Revenue");
                for(int i=1;i<=n;i++) vegetables[i].display();
            }
            else if(choose==3){
                for(int i=1;i<n;i++)
                    for(int j=i+1;j<=n;j++)
                    if(vegetables[i].getTotalRevenue()>vegetables[j].getTotalRevenue())
                    {
                        Vegetable t= vegetables[i];
                        vegetables[i]=vegetables[j];
                        vegetables[j]=t;
                    }
                System.out.println("Sort completed!");
            }
            else if(choose==4){
                for(int i=1;i<n;i++)
                    for(int j=i+1;j<=n;j++)
                        if(vegetables[i].getUnit().compareTo("")>vegetables[j].getUnit().compareTo("")){
                            Vegetable t= vegetables[i];
                            vegetables[i]=vegetables[j];
                            vegetables[j]=t;
                        }
                for(int i=1;i<n;i++)
                    for(int j=i+1;j<=n;j++)
                        if(vegetables[i].getPrice()>vegetables[j].getPrice() && vegetables[i].getUnit().equals(vegetables[j].getUnit()))
                        {
                            Vegetable t= vegetables[i];
                            vegetables[i]=vegetables[j];
                            vegetables[j]=t;
                        }
                System.out.println("Sort completed!");
            }
            else if(choose==5){
                System.out.print("Input vegetable name: ");
                String name=sc.nextLine();
                System.out.printf("%-3s%-15s%-10s%-15s%-5s%-15s%-15s\n","Id","Name","Unit","Quantity sold","Sale", "Price","Revenue");
                for (int i=1;i<=n;i++) if(vegetables[i].getName().equals(name)) vegetables[i].display();
            }
            else if(choose==6){
                System.out.println("Exited!");
                go=false;
            }
        }
    }
}

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input address!");
        System.out.print("Input commune: ");this.setCommune(sc.nextLine());
        System.out.print("Input district: ");this.setDistrict(sc.nextLine());
        System.out.print("Input city: ");this.setCity(sc.nextLine());
    }
    public void output() {
        System.out.println("Commune: "+this.getCommune()+", district: "+this.getDistrict()+", city: "+this.getCity());
    }
    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public Address() {
    }
}

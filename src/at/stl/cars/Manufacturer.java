package at.stl.cars;

public class Manufacturer {
    private String name;
    private String country;
    private float discount;

    public Manufacturer(String name, String country, float discount){
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    //Methods
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    public float getDiscount() {return discount;}

    public void setDiscount(float discount) {this.discount = discount;}
}

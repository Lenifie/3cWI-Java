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
    public String getCountry() {return country;}
    public float getDiscount() {return discount;}
}

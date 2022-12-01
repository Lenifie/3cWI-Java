package at.stl.objects;

public class Truck extends Car {
    private String trailer;
    public Truck(Engine engine, String brand, String color, String trailer) {
        super(engine, brand, color);
        this.trailer = trailer;
    }

    //Methods

    public String getTrailer() {return trailer;}
    public void setTrailer(String trailer) {this.trailer = trailer;}
}

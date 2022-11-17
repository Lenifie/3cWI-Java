package at.stl.cars;
//package manufactur hinzufügen

public class Car {
private String color;
private float basisPrice;

private Engine engine;
private Manufacturer manufacturer;

public Car(String color, Engine engine,float basisPrice, Manufacturer manufacturer){
    this.color = color;
    this.engine = engine;
    this.basisPrice = basisPrice;
    this.manufacturer = manufacturer;
}

//Methods
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public float getBasisPrice() {return basisPrice;}
    public void setBasisPrice(float BasisPrice){this.basisPrice = basisPrice;}
    public void Price (float BasisPrice, )

    public Engine getEngine(){ return  engine;}
    public void  setEngine(Engine engine){this.engine = engine; }

    public Manufacturer getManufacturer() {return manufacturer;}
    public void setManufacturer(Manufacturer manufacturer) {this.manufacturer = manufacturer;}
}

package at.stl.objects;

public class Car {
    // Instanz / Gedächtnisvariablen
    //don't do that later
    private Engine engine;
    private String brand; //Marke
    private String color; //Autofarbe
    private int honkCounter;

    //Private dinge die nach außen nicht sichtbar sind

    public Car(Engine engine, String brand,String color){
       this.engine = engine;
       this.brand=brand;
       this.color=color;
       this.honkCounter =0;
    }
    //Methode

    public void honk(){
        System.out.println("ich bin ein "+ this.brand +"und habe die Farbe "+ this.color + "und habe "+this.getEngine().getHorsePower() + "ps");
        this.honkCounter++;
    }
    public String getBrand(){return brand;}
    public void setBrands(String brand){this.brand = brand;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public int getHonkCounter(){return honkCounter;}
    public Engine getEngine(){ return  engine;}
    public void  setEngine(Engine engine){this.engine = engine; }


}

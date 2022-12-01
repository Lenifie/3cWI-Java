package at.stl.objects;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächtnisvariablen
    //don't do that later
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire>tires;
    private String brand; //Marke
    private String color; //Autofarbe
    private int honkCounter;

    //Private dinge die nach außen nicht sichtbar sind

    public Car(Engine engine, String brand,String color){
       this.engine = engine;
       this.brand=brand;
       this.color=color;
       this.honkCounter =0;
       this.mirrors = new ArrayList<>();
       this.tires = new ArrayList<>();
    }
    //Methode
    public void  addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }
    public void addTire(Tire Tire){this.tires.add(Tire);}
    public List<Tire>getTires(){return tires;}
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

    public void drive(){
        System.out.println("I am driving");
    }

    public void stop(){
        System.out.println("I am breaking ... car");
    }
}

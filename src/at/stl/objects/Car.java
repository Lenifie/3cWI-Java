package at.stl.objects;

public class Car {
    // Instanz / Gedächtnisvariablen
    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public String color;
    public int fuelAmount;

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount -fuelConsumption;
        System.out.println("I am driving");
    }
}

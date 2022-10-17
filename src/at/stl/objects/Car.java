package at.stl.objects;

public class Car {
    // Instanz / Gedächtnisvariablen

    //don't do that later
    public int fuelConsumption; //Verbrauch pro km
    public String brand; //Marke
    public String serialNumber; //Seriennummer
    public String color; //Autofarbe
    public int fuelAmount; //Tankstand
    public int amountOfRepetitions; //Anzahl hupen
    public Car(int fuelConsumption2, String brand2,String serialNumber2){
        this.fuelConsumption = fuelConsumption2;
        this. brand = brand2;
        this.serialNumber = serialNumber2;
    }
    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount -fuelConsumption;
        System.out.println("I am driving");
    }

    public void brake(){
        System.out.println("I brake");
    }
    public void turboBoost(){
        if (this.fuelAmount > (this.fuelAmount * 0.1)){
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
    public void honk(){
        for (int i = 0; i< amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }
    public void getRemainingRange(){
        int remainingRange = this.fuelAmount/ this.fuelConsumption;
        System.out.println("The remaining Range is" +remainingRange + "km");
    }
}

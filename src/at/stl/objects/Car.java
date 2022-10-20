package at.stl.objects;

public class Car {
    // Instanz / Gedächtnisvariablen

    //don't do that later
    private int fuelConsumption; //Verbrauch pro km
    private int Tank;
    private String brand; //Marke
    private String serialNumber; //Seriennummer
    private String color; //Autofarbe
    private int fuelAmount; //Tankstand
    private int amountOfRepetitions; //Anzahl hupen
    private int amountFuelIntoMotor;

    //Private dinge die nach außen nicht sichtbar sind

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

    public void setTank(int tank){
        Tank = tank;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
       this.color = color;
    }
    public void setFuelAmount(int fuelAmount){
        if(fuelAmount > 100){
            this.fuelAmount = 100;
        }else{
            this.fuelAmount = fuelAmount;
        }

    }
    public void setFuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getTank() {
        return Tank;
    }
}

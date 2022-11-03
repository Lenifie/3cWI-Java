package at.stl.objects;

public class Engine {


    public enum TYPE{DIESEL,GAS}
    private int horsePower;
    private TYPE type; //Diesel oder Benzin
    private int amount; //tank
    private int speed; //geschwindigkeit
    private int fuelConsumption; //Verrauch pro km
    public Engine(int horsePower,TYPE type, int amount, int speed, int fuelConsumption){
        this.horsePower = horsePower;
        this.type=type;
        this.amount = amount;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;

    }
    //amount should be between0 and 100
    public void drive(int amount, int speed){
        System.out.println("The motor is running with "+amount);
        this.amount = this.amount -fuelConsumption;
        if (speed == 1){
            System.out.println("Langsam");
        }
        else if (speed == 100){
            System.out.println("Vollgas");
        }
        else {
            System.out.println("Normal");
        }

    }

    public int getHorsePower(){
        return horsePower;
    }
    public int getSpeed(){
        return speed;
    }
    public int getAmount(){
        return amount;
    }

    public TYPE getType(){
        return type;
    }
}

package at.stl.cars;

public class Engine {
    private float maxSpeed;



    public enum TYPE{DIESEL,GAS}
    private TYPE type;
    private int horsePower;
    private float fuelConsumption; //verbrauch steigt bei 50.000km um 9.8% (1,098 oder 0,098)
    private float amount;
    public Engine(float maxSpeed, TYPE type, int horsePower,float amount ){
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.horsePower = horsePower;
        this.amount = amount;
    }

    //Methods
    public float getMaxSpeed() {return  maxSpeed;}
    public void setMaxSpeed(float maxSpeed) {this.maxSpeed = maxSpeed;}

    public int getHorsePower(){
        return horsePower;
    }
    public void setHorsePower(int horsePower) {this.horsePower = horsePower;}

    public TYPE getType(){
        return type;
    }
    public void setType(TYPE type) {this.type = type;}

    public float getFuelConsumption() {return fuelConsumption;}
    public void setFuelConsumption() {this.fuelConsumption = fuelConsumption;}

    public float getAmount() {return amount;}
    public void setAmount(float amount) {this.amount = amount;}

    public void drive(){
        fuelConsumption = amount * 2;
        if(fuelConsumption > 50000){
            fuelConsumption = (float) (fuelConsumption * 1.098);
        }

    }
}



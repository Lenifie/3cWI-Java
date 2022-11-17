package at.stl.cars;

public class Engine {
    private float maxSpeed;
    public enum TYPE{DIESEL,GAS}
    private TYPE type;
    private int horsePower;

    public Engine(float maxSpeed, TYPE type, int horsePower){
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.horsePower = horsePower;
    }

    //Methods
    public float getMaxSpeed() {return  maxSpeed;}
    public int getHorsePower(){
        return horsePower;
    }
    public TYPE getType(){
        return type;
    }
}



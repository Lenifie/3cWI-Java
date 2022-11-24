package at.stl.lamp;

public class glowingElements {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status; //on off

    public glowingElements(String name, String color, float powerConsumption, boolean status){
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }
    //Methods
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public double getPowerConsumption() {return powerConsumption;}
    public void setPowerConsumption(double powerConsumption) {this.powerConsumption = powerConsumption;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    public void turnOn(){
        if (status == true){
            System.out.println("Mein Name ist "+ name + ". Ich bin bereits eingeschaltet.");
        }
        else{
            System.out.println(name + " wird eingeschaltet.");
            status = true;
        }
        powerConsumption = powerConsumption + 5.0;
    }
}

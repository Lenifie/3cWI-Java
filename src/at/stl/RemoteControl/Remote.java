package at.stl.RemoteControl;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private int turnOn;
    private int turnOff;
    private float getStatus;
    private float battery_1;
    private float battery_2;
    private float chargingStatus_1;
    private float chargingStatus_2;

    public Remote(int turnOn,int turnOff, float getStatus){
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.getStatus = getStatus;
    }
    //Battery
    public void setBattery_1(float chargingStatus_1){
        this.chargingStatus_1 = chargingStatus_1;
    }
    public float getBattery_1() {return battery_1;}

    public void setBattery_2(float chargingStatus_2){
        this.chargingStatus_2 = chargingStatus_2;
    }

    public float getBattery_2() {return battery_2;}

    public float getChargingStatus_1() {return chargingStatus_1;}
    public float getChargingStatus_2(){return chargingStatus_2;}

    //Status
    public void getStatus(){
        System.out.println("Der Batteriestatus ist: " + (chargingStatus_1 +chargingStatus_2)/2);
    }

    //turnOn
    public void setTurnOn(int turnOn) {
        this.turnOn = turnOn;

    }
    public int getTurnOn() {

        return turnOn;
    }
    public void turnON(){
        System.out.println("Verbraucher Angeschlossen");
        chargingStatus_1 = (float) (chargingStatus_1 -(chargingStatus_1 * 0.05));
        chargingStatus_2 = (float) (chargingStatus_2 -(chargingStatus_2 * 0.05));
    }
    //turnOff
    public void setTurnOff(int turnOff) {
        this.turnOff = turnOff;

    }
    public int getTurnOff() {
        System.out.println("Kein Verbraucher Angeschlossen");
        return turnOff;
    }


}

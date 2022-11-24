package at.stl.lamp;

import java.util.ArrayList;
import java.util.List;

public class lamp {
    private ArrayList<glowingElements> glowingElements = new ArrayList<glowingElements>();
    private double powerUsage;



    //Methods
    public void addGlowingElement(glowingElements glowingElements){
        this.glowingElements.add(glowingElements);
    }
   public List<glowingElements> getMirrors() {return glowingElements;}
    public void turnAllOn(){
        for (int i = 0; i < this.glowingElements.size(); i++) {
            this.glowingElements.get(i).turnOn();
        }
    }
    public void getOverallPowerUsage(){
        for (int i = 0; i < this.glowingElements.size(); i++) {
            powerUsage= this.glowingElements.get(i).getPowerConsumption() + powerUsage;

        }
        System.out.println(powerUsage);
    }
    public void printNamesOfLightElements(){
        for (int i = 0; i < this.glowingElements.size(); i++) {

            System.out.println(this.glowingElements.get(i).getName());
        }
    }




    public ArrayList<at.stl.lamp.glowingElements> getGlowingElements() {return glowingElements;}
    public void setGlowingElements(ArrayList<at.stl.lamp.glowingElements> glowingElements) {this.glowingElements = glowingElements;}
    public double getPowerUsage() {return powerUsage;}
    public void setPowerUsage(double powerUsage) {this.powerUsage = powerUsage;}
}

package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class phone {
    private String color;

    private sim sim;
    private SDCard SDCard;
    private camera camera;
    private List<PhoneFile> phoneFiles;
    public phone(String color, sim sim, SDCard SDCard, camera camera){
        this.color = color;
        this.sim = sim;
        this.SDCard = SDCard;
        this.camera= camera;
        this.phoneFiles = new ArrayList<>();

    }

    //Methods

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}

    public void takePicture(PhoneFile phoneFile){
        this.SDCard.saveFile(phoneFile);
    }

    public void makeCall(){
        this.sim.doCall();
    }

    public void getFreeSpace(PhoneFile phoneFile){
        this.SDCard.getFreeSpace(phoneFile);
    }

    public void printAllFiles(){
        this.SDCard.getAllFiles();
    }
}

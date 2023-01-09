package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class camera {
    private String resolution;
    private List<PhoneFile> phoneFiles;
    private SDCard SDCard;

    public camera(String resolution){
        this.resolution = resolution;
        this.phoneFiles = new ArrayList<>();
        this.SDCard = SDCard;
    }

    //Methods

    public String getResolution() {return resolution;}
    public void setResolution(String resolution) {this.resolution = resolution;}

    public void makePic(PhoneFile phoneFile){
        this.SDCard.saveFile(phoneFile);
    }

}

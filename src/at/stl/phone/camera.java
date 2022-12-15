package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class camera {
    private String resolution;
    private List<PhoneFile> phoneFiles;


    public camera(String resolution){
        this.resolution = resolution;
        this.phoneFiles = new ArrayList<>();
    }

    //Methods
    public void saveFile(PhoneFile phoneFile){
        this.phoneFiles.add(phoneFile);
    }
}

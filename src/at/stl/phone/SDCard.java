package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(float capacity){
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();

    }

    //Methods
    public void saveFile(PhoneFile phoneFile){
        this.phoneFiles.add(phoneFile);


    }

    public void getAllFiles(PhoneFile phoneFile){

    }

    public void getFreeSpace(PhoneFile phoneFile){
        capacity = capacity - phoneFile.getSize();
    }
}

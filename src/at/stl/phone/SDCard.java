package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(float capacity){
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<PhoneFile>();
    }

    //Methods

    public float getCapacity() {
        System.out.println(capacity);
        return capacity;
    }

    public void setCapacity(float capacity) {this.capacity = capacity;}

    public void saveFile(PhoneFile phoneFile){
        this.phoneFiles.add(phoneFile);
        this.capacity -= phoneFile.getSize();

    }

    public void getAllFiles(){
        for (PhoneFile p:this.phoneFiles)
        {
            p.getInfo();
        }
    }

    public void getFreeSpace(PhoneFile phoneFile){
        capacity = capacity + phoneFile.getSize();
    }
}

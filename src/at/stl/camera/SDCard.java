package at.stl.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float capacity;
    private List<PhoneFile> files;
    private Camera.RESOLUTION resolution;

    public SDCard (float capacity){
        this.capacity = capacity;
        this.files = new ArrayList<PhoneFile>();

    }

    public void saveFile(PhoneFile file){
        this.files.add(file);
    }

    //Methods


    public List<PhoneFile> getAllFiles(){
      return files;
    }

}

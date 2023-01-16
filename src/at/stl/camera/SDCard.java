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



    //Methods

    public void setCapacity(float capacity) {this.capacity = capacity;}
    public float getCapacity() {return capacity;}

    public void setFiles(List<PhoneFile> files) {this.files = files;}
    public List<PhoneFile> getFiles() {return files;}

    public void setResolution(Camera.RESOLUTION resolution) {this.resolution = resolution;}
    public Camera.RESOLUTION getResolution() {return resolution;}

    public void saveFile(PhoneFile file){
        if(capacity < file.getSize()){
            System.out.println("Bild konte nicht gespeichert werden. Speicher ist voll. SDCard wechseln!");
        }
        else{
            this.files.add(file);
            this.capacity -= file.getSize();
            System.out.println("File gespeichert");
        }
    }

    public List<PhoneFile> getAllFiles(){
      return files;
    }

}

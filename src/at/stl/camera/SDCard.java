package at.stl.camera;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float capacity;
    private List<Picture>pictures;
    private camera.RESOLUTION resolution;

    public SDCard (float capacity){
        this.capacity = capacity;
        this.pictures = new ArrayList<Picture>();

    }

    //Methods
    public void takePic(Picture pictures){
        this.pictures.add(pictures);
        if (resolution == camera.RESOLUTION.k) {
            pictures.setSize(2);
        }
        else if (resolution == camera.RESOLUTION.m){
            pictures.setSize(4);
        } else if (resolution == camera.RESOLUTION.s) {
            pictures.setSize(6);
        }
        this.capacity -= pictures.getSize();
        if (capacity == 0) {
            System.out.println("Speicher ist voll!");
        }
    }

    public void getAllFiles(){
        for (Picture p:this.pictures)
        {
            p.getInfo();
        }
    }

}

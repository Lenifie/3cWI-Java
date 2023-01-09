package at.stl.camera;
import at.stl.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float capacity;
    private List<Picture>pictures;

    public SDCard (float capacity){
        this.capacity = capacity;
        this.pictures = new ArrayList<Picture>();
    }

    //Methods
    public void takePic(Picture pictures){
        this.pictures.add(pictures);
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

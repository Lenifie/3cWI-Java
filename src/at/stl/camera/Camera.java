package at.stl.camera;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private float pixel;
    private float weight;
    private String color;
    public enum RESOLUTION{k,m,s}
    private RESOLUTION resolution;
    private SDCard SDCard;

    private  Lens Lens;
    private ManufacturerCamera manufacturerCamera;

    public Camera(float pixel, float weight, String color, RESOLUTION resolution, SDCard SDCard, Lens Lens, ManufacturerCamera manufacturerCamera){
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.SDCard = SDCard;
        this.Lens = Lens;
        this.manufacturerCamera = manufacturerCamera;

    }

    //Methods
    public void takePic(){
        PhoneFile picture ;
        if (resolution == Camera.RESOLUTION.k) {
           //  make pictue
            picture = new PhoneFile("image","jpg",2000);
        }
        else if (resolution == Camera.RESOLUTION.m){
            picture = new PhoneFile("image","jpg",4000);
        } else  {
            picture = new PhoneFile("image","jpg",6000);
        }

        this.SDCard.saveFile(picture);

    }


}

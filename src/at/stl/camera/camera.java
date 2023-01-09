package at.stl.camera;

import at.stl.cars.Engine;

import java.util.ArrayList;
import java.util.List;

public class camera {
    private float pixel;
    private float weight;
    private String color;
    public enum RESOLUTION{k,m,s}
    private RESOLUTION resolution;
    private SDCard SDCard;
    private List<Picture> pictures;

    public camera(float pixel,float weight,String color,RESOLUTION resolution, SDCard SDCard){
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.SDCard = SDCard;
        this.pictures = new ArrayList<Picture>();
    }

    //Methods
    public void takePic(Picture pictures){
        this.SDCard.takePic(pictures);
        if (resolution == RESOLUTION.k) {
            pictures.setSize() == 2;
        }
    }
}

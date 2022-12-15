package at.stl.phone;

import at.stl.ISaHASa.Animal;

import java.util.ArrayList;
import java.util.List;

public class phone {
    private String color;
    private List<PhoneFile> phoneFiles;
    public phone(String color){
        this.color = color;
        this.phoneFiles = new ArrayList<>();
    }

    //Methods

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}

    public void takePicture(){

    }

    public void makeCall(){

    }

    public void getFreeSpace(){

    }

    public void printAllFiles(){
        for (PhoneFile phoneFile: this.phoneFiles){
            System.out.println("Name.extension size "+ phoneFile.getName() + phoneFile.getExtension() + " "+ phoneFile.getSize() );
        }
    }
}

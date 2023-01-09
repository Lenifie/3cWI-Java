package at.stl.phone;

public class PhoneFile {
    private String extension; //jpg und so
    private float size;
    private String name;

    public PhoneFile(String name, String extension, float size){
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    //Methoden
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setExtension(String extension) {this.extension = extension;}
    public String getExtension() {return extension;}

    public void setSize(float size) {this.size = size;}
    public float getSize() {return size;}

    public void getInfo(){
        System.out.println("Name "+ name+"."+extension+" "+ "Größe "+ size );
    }
}

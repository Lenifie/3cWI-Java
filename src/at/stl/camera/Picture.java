package at.stl.camera;

public class Picture {
    private String name;
    private String date;
    private float size;

    public Picture(String name, String date, float size){
        this.name = name;
        this.date = date;
        this.size = size;
    }

    //Methods
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setDate(String date) {this.date = date;}
    public String getDate() {return date;}

    public void setSize(float size) {this.size = size;}
    public float getSize() {return size;}

    public void getInfo(){
        System.out.println("Name "+ name+" "+ "Größe "+ size );
    }
}

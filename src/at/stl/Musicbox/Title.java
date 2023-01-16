package at.stl.Musicbox;

public class Title {
    public String title;
    private float length;

    public Title(String title,float length){
        this.title = title;
        this.length = length;
    }

    //Methods
    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}

    public void setLength(float length) {this.length = length;}
    public float getLength() {return length;}
}

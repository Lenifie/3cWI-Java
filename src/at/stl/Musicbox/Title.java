package at.stl.Musicbox;

public class Title {
    public String title;
    private double length;

    public Title(String title,double length){
        this.title = title;
        this.length = length;
    }

    //Methods
    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}

    public void setLength(double length) {this.length = length;}
    public double getLength() {return length;}


}

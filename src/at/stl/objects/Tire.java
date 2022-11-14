package at.stl.objects;

public class Tire {
    private int size;
    private int position; //0-10 vorne rechts-links, 11-20 hinten rechts-links
    public enum TYPE{WINTERREIFEN,SOMMERREIFEN};
    private TYPE type;

    public Tire(int size,int position,TYPE type){
        this.size = size;
        this.position=position;
        this.type =type;
    }

    public int getSize() {
        return size;
    }
    public int getPosition() {
        return position;
    }
    public TYPE getType() {
        return type;
    }
}

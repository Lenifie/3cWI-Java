package at.stl.objects;

public class RearMirror {
    private int size;
    private int position; //0 neutral, -10 nach links, +10 nach rechts

    public RearMirror(int size, int position){
        this.size = size;
        this.position = position;
    }

    public int getSize(){
        return size;
    }

    public int getPosition(){
        return position;
    }
    }

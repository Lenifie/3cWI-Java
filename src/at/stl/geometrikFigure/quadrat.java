package at.stl.geometrikFigure;

public class quadrat extends geometrikFigure{
    private double length;

    public quadrat(String name,double length) {
        super(name);
        this.length = length;
    }

    //Methods
    public void getArea() {
        System.out.println("Quadratfläche: "+this.length*this.length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}

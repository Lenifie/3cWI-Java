package at.stl.geometrikFigure;

public class rectangle extends geometrikFigure{
    private double length;
    private double width;

    public rectangle(String name,double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    //Methods

    public void getArea() {
        System.out.println("Rechteckfläche: "+this.length * this.width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

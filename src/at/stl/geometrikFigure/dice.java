package at.stl.geometrikFigure;

public class dice extends geometrikFigure{
    private double length;
    private double high;

    public dice(String name,double length, double high) {
        super(name);
        this.length = length;
        this.high = high;
    }

    //Methods


    public void getArea() {
        System.out.println("Würfelfläche: " + 6 * (this.length*this.length));

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }
}

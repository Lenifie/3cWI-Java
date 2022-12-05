package at.stl.geometrikFigure;

public class dice extends geometrikFigure{
    private double length;
    private double high;

    public dice(String name,double area, double length, double high) {
        super(name,area);
        this.length = length;
        this.high = high;
    }

    //Methods

    @Override
    public void setArea(double area) {
        area = 6 * (length*length);
        super.setArea(area);
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

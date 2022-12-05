package at.stl.geometrikFigure;

public class quadrat extends geometrikFigure{
    private double length;

    public quadrat(String name,double area, double length) {
        super(name,area);
        this.length = length;
    }

    //Methods

    @Override
    public void setArea(double area) {
        area = length*length;
        super.setArea(area);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}

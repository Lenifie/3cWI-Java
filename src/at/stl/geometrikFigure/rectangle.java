package at.stl.geometrikFigure;

public class rectangle extends geometrikFigure{
    private double length;
    private double width;

    public rectangle(String name,double area, double length, double width) {
        super(name,area);
        this.length = length;
        this.width = width;
    }

    //Methods
    @Override
    public void setArea(double area) {
        area = length * width;
        super.setArea(area);
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

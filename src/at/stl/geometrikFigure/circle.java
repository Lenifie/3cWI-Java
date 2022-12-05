package at.stl.geometrikFigure;

public class circle extends geometrikFigure{

    private double radius;

    public circle(String name,double area, double radius) {
        super(name,area);
        this.radius = radius;
    }

    //Methods
    @Override

    public void setArea(double area) {
        area = 2 * radius * 3.14;
        super.setArea(area);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

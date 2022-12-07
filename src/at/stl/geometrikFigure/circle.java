package at.stl.geometrikFigure;

public class circle extends geometrikFigure{

    private double radius;

    public circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }

    //Methods
  public void getArea(){
      System.out.println("Kreisfläche: " + 2*this.radius*3.14);
  }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

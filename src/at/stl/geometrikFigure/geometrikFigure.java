package at.stl.geometrikFigure;

public class geometrikFigure {
    private String name;
    private double area;



    public geometrikFigure(String name, double area){
        this.name = name;
        this.area = getArea();

    }

    //Methods

    public double getArea(){
        System.out.println(area);
        return 0;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void setArea(double area) {
        this.area = area;
    }
}

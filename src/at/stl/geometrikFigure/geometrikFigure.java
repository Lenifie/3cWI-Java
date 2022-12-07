package at.stl.geometrikFigure;

public class geometrikFigure {
    private String name;
    private double area;



    public geometrikFigure(String name){
        this.name = name;


    }

    //Methods

    public void getArea(){
        System.out.println(area);

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void setArea(double area) {
        this.area = area;
    }
}

package at.stl.geometrikFigure;

public class main {
    public static void main(String[] args) {


        circle c1 = new circle("kreis1",10);
        c1.getArea();

        dice d1 = new dice("würfel1",4,7);
        d1.getArea();

        rectangle r1 = new rectangle("rechteck2",2,8);
        r1.getArea();

        quadrat q1 = new quadrat("quadrat3",7);
        q1.getArea();
    }




}

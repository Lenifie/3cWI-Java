package at.stl.objects;
import at.stl.objects.Engine;
import at.stl.objects.Car;
public class Main2 {
   public static void main(String[] args) {
      Engine e1 = new Engine(140,Engine.TYPE.DIESEL,50,100,10);
      RearMirror r1 = new RearMirror(100,0);
      RearMirror r2 = new RearMirror(90,-40);
      Tire t1= new Tire(100,0, Tire.TYPE.SOMMERREIFEN);
      Tire t2 = new Tire(100,10, Tire.TYPE.SOMMERREIFEN);
      Tire t3 = new Tire(100,11, Tire.TYPE.SOMMERREIFEN);
      Tire t4= new Tire(100,20, Tire.TYPE.SOMMERREIFEN);

      Car c1 = new Car(e1,"BMW","blue");
      c1.addMirror(r1);
      c1.addMirror(r2);
      c1.addTire(t1);
      c1.addTire(t2);
      c1.addTire(t3);
      c1.addTire(t4);



      System.out.println(e1.getSpeed());
      System.out.println(e1.getAmount());
      e1.drive(e1.getAmount(),e1.getSpeed() );
      System.out.println(e1.getAmount());
      System.out.println(c1.getEngine().getHorsePower());
      System.out.println("----------------");
      System.out.println(c1.getMirrors().get(0).getPosition());
      System.out.println("----------------");
      System.out.println(c1.getTires().get(0).getType());
      System.out.println("----------------");

      Truck tr1 = new Truck(e1,"mercedes","green","trailer1");
      System.out.println(tr1.getColor() + " " + tr1.getTrailer());
      tr1.drive();
      tr1.stop();
   }
}

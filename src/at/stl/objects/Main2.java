package at.stl.objects;
import at.stl.objects.Engine;
import at.stl.objects.Car;
public class Main2 {
   public static void main(String[] args) {
      Engine e1 = new Engine(140,Engine.TYPE.DIESEL,50,100,10);
      RearMirror r1 = new RearMirror(100,0);
      RearMirror r2 = new RearMirror(90,-40);
      RearMirror r3 = new RearMirror(90,40);

      Car c1 = new Car(e1,"BMW","blue");
      c1.addMirror(r1);
      c1.addMirror(r2);
      c1.addMirror(r3);


      System.out.println(e1.getSpeed());
      System.out.println(e1.getAmount());
      e1.drive(e1.getAmount(),e1.getSpeed() );
      System.out.println(e1.getAmount());
      System.out.println(c1.getEngine().getHorsePower());
      System.out.println("----------------");
      System.out.println(c1.getMirrors().get(0).getPosition());


   }
}

package at.stl.objects;
import at.stl.objects.Engine;
import at.stl.objects.Car;
public class Main2 {
   public static void main(String[] args) {
      Engine e1 = new Engine(140,Engine.TYPE.DIESEL,50,100,10);
      Car c1 = new Car(e1,"BMW","blue");
      System.out.println(c1.getEngine());
      System.out.println(e1.getSpeed());
      System.out.println(e1.getAmount());
      e1.drive(e1.getAmount(),e1.getSpeed() );
      System.out.println(e1.getAmount());



   }
}

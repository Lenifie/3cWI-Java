import at.stl.objects.Car;
public class Main2 {
    public static void main(String[] args) {
        int a = 7;
        Car c1 = new Car();
        c1.brand="Audi";
        c1.fuelKonsumption =7;
        c1.serialNumber = "A1234";

        Car c2= new Car();
        c2.brand = "Mercedes";
        c2.fuelKonsumption = 6;
        c2.serialNumber = "M1234";

        System.out.println(c1.serialNumber);
    }
}

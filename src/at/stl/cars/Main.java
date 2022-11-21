package at.stl.cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(180, Engine.TYPE.DIESEL,100, 26000);
        Manufacturer m1 = new Manufacturer("Rodomir","Vandalin", 5);
        Car c1 = new Car("rot", e1,27500,m1);

        System.out.println("Auto Charakteristik: ");
        System.out.println("Farbe: " + c1.getColor());
        System.out.println("Basis Preis: " + c1.getBasisPrice()+"\n");

        System.out.println("Motor Charakteristik: ");
        System.out.println("Max Schnelligkeit: " + c1.getEngine().getMaxSpeed());
        System.out.println("Sprit: " + c1.getEngine().getType());
        System.out.println("Pferdestärke: "+c1.getEngine().getHorsePower()+"\n");

        System.out.println("Händler Charakteristik: ");
        System.out.println("Name: "+c1.getManufacturer().getName());
        System.out.println("Land: "+c1.getManufacturer().getCountry());
        System.out.println("Händlerrabatt: "+c1.getManufacturer().getDiscount()+ "%" + "\n");

        c1.Price(c1.getBasisPrice(), c1.getManufacturer().getDiscount());
        c1.drive();

        System.out.println(c1.getEngine().getFuelConsumption());

    }
}

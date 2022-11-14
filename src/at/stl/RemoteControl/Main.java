package at.stl.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Remote r1 = new Remote(1,0, 0);
        r1.setBattery_1(100);
        r1.setBattery_2(100);
        r1.getStatus();
        r1.turnON();
        r1.getStatus();

    }
}

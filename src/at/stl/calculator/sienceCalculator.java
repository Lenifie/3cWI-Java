package at.stl.calculator;

public class sienceCalculator extends rootCalculator{
    public sienceCalculator(double number1, double number2) {
        super(number1, number2);
    }


    //Methods
    public void sin(){
        double sin1 = Math.sin(number1);
        System.out.println("Sinus von " + number1 + " ist: " + sin1);
        double sin2 = Math.sin(number2);
        System.out.println("Sinus von " + number2 + " ist: " + sin2);
    }

    public void cos(){
        double cos1 = Math.cos(number1);
        System.out.println("Cosinus von " + number1 + " ist: " + cos1);
        double cos2 = Math.cos(number2);
        System.out.println("Cosinus von " + number2 + " ist: " + cos2);
    }
}

package at.stl.calculator;

public class rootCalculator extends calculator{
    public rootCalculator(double number1, double number2) {
        super(number1, number2);
    }

    //Methods
    public void root(){
        double root1 = Math.sqrt(number1);
        System.out.println("Wurzel aus: " + root1);
        double root2 = Math.sqrt(number2);
        System.out.println("Wurzel aus: "+ root2);

    }
}


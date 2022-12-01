package at.stl.calculator;

public class Main {
    public static void main(String[] args) {

        calculator c1 = new calculator(18.0,6.0);
        c1.sum();
        c1.subtraction();
        c1.multiply();
        c1.division();
        System.out.println("----------------");
        rootCalculator r1 = new rootCalculator(18,6);
        r1.root();
        r1.sum();
        r1.subtraction();
        r1.multiply();
        r1.division();
        System.out.println("----------------");
        sienceCalculator s1  = new sienceCalculator(18,6);
        s1.sin();
        s1.cos();
        s1.root();
        s1.sum();
        s1.subtraction();
        s1.multiply();
        s1.division();
    }
}

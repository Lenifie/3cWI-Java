package at.stl.calculator;

public class calculator {
    double number1;
    double number2;

    public calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    //Methods

    public double getNumber1() {return number1;}
    public void setNumber1(double number1) {this.number1 = number1;}

    public double getNumber2() {return number2;}
    public void setNumber2(double number2) {this.number2 = number2;}

    public void sum(){
        double sum;
        sum = number1 + number2;
        System.out.println("Die Summe ist: " + sum);
    }

    public void subtraction(){
        double subtraction;
        subtraction = number1 - number2;
        System.out.println("Das Ergebnis der Subtraktion ist: " + subtraction);
    }

    public void multiply(){
        double multiply;
                multiply = number1 * number2;
        System.out.println("Das Ergebnis der Multiplikation lautet: " + multiply);
    }

    public void division(){
        double division;
        division = number1 / number2;
        System.out.println("Das Ergebnis der Division lautet: " + division);
    }
}

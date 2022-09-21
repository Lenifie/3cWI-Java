import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //int - ganze Zahl
        //float - kommazahl
        //double - kommazahl (groß)
        //boolean - true/false
        //char - zeichen
        //string - zeichenkette

        int number = 16;
        String name = "Leonie";

        System.out.println(name);
        System.out.println(number);

        int number2 = 16;
        String name2 = "Leonie-Sopie";

        System.out.println(name2);
        System.out.println(number2);

        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if(randomNumber<20){
            System.out.println("Mini");
        } else if ((randomNumber>20)&&(randomNumber<50)) {
            System.out.println("Medium");
        } else if (randomNumber>50) {
            System.out.println("Large");
        }


    }

    //strg blank
}

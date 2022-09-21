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

        switch (randomNumber){
            case 10:
                System.out.println("is 10");
                break;
            case 9:
                System.out.println("is 9");
                break;
            case 8:
                System.out.println("is 8");
                break;
        }

        int number1 = 1;
        int summe = 0;
        for (int i = 0; i < 100; i++){
            summe = summe + number1;
        }
        System.out.println("Summe" + summe);

        Random random1 = new Random();
        int summe2 = 0;
        boolean isFinished = true;

        while (isFinished)
        {
            int randomNumber1 = random1.nextInt((30)); //generiert 0-30
            if (randomNumber1 >10)
            {
                if ((randomNumber1 == 15) || (randomNumber1 == 25))
                {
                    break;
                }
                summe2 = summe2 + randomNumber1;
                System.out.println("Summe2-"+ ""+summe2);
            }
        }
        System.out.println("Die Summe lautet:"+summe2);
    }


    //strg blank
}

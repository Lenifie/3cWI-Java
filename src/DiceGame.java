import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

       /*Erstelle ein Würfelspiel! Du spielst gegen den Computer.
       Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
       Er spielt dabei gegen den Computer.
       Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen,
       ansonsten der Computer*/

        Random random = new Random();
        int cubeShotUser = 0;
        int cubeShotComputer = 0;

        boolean isProgrammRunning = true;

    while (isProgrammRunning){



        System.out.println("Welcher Spieler soll beginnen:");
        System.out.println("Spieler (s)");
        System.out.println("Computer (c)");
        System.out.println("Ergebnis (e)");
        Scanner inputFromScanner = new Scanner(System.in);
        char selectionOfUser = inputFromScanner.next().charAt(0);

        switch (selectionOfUser){
            case 's':
                for(int i = 1; i < 7; i++)
                {
                    int randomNumber = random.nextInt(6)+1;
                    System.out.println(i +". Wurf: " + randomNumber);
                    cubeShotUser += randomNumber;
                }
                System.out.println("Spieler hat eine Augensumme von: " + cubeShotUser +'\n');
                break;
            case 'c':
                for(int i = 1; i < 7; i++)
                {
                    int randomNumber = random.nextInt(6)+1;
                    System.out.println(i +". Wurf: " + randomNumber);
                    cubeShotComputer += randomNumber;
                }
                System.out.println("Computer hat eine Augensumme von: " + cubeShotComputer +'\n');
                break;
            case 'e':
                if(cubeShotUser>cubeShotComputer){
                    System.out.println("Spieler hat gewonnen");

                }
                else if(cubeShotComputer>cubeShotUser){
                    System.out.println("Computer hat gewonnens" );

                }
                else {
                    System.out.println("Gleichstand");

                }
                cubeShotUser = 0;
                cubeShotComputer = 0;

                break;
        }


    }


    }
}

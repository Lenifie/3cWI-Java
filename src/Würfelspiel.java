import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {

       /*Erstelle ein Würfelspiel! Du spielst gegen den Computer.
       Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
       Er spielt dabei gegen den Computer.
       Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen,
       ansonsten der Computer*/

        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        int cubeShotUser = 0;

        for(int i = 1; i < 7; i++)
        {

            System.out.println(i +". Wurf: " + randomNumber);
            cubeShotUser += randomNumber;
        }
        System.out.println("Spieler hat eine Augensumme von: " + cubeShotUser +'\n');


    }
}

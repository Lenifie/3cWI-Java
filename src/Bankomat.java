import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {


        int balance = 0;
        boolean isProgrammRunning = true;


       while(isProgrammRunning){
           System.out.println("Auswahlmenü:");
           System.out.println("1. Einzahlen (e)");
           System.out.println("2. Abheben (a)");
           System.out.println("3. Kontostand (k)");
           System.out.println("4. Beenden (b)");

           Scanner inputFromScanner = new Scanner(System.in);

           char selectionOfUser = inputFromScanner.next().charAt(0);
           System.out.println(selectionOfUser);

           switch (selectionOfUser)
           {
               case 'e':
                   System.out.println("Geldmenge: ");
                   int value = inputFromScanner.nextInt();
                   balance += value;
                   break;
               case 'a':
                   System.out.println("Geldmenge: ");
//                eingabe.nextInt(abheben);
//                kontostand = kontostand - abheben;
                   break;
               case 'k':
                   System.out.println("Der kontostand ist: ");
                   System.out.println(balance);
                   break;
               case 'b':
                   System.out.println("Wird beendet ...");
                   isProgrammRunning = false;
                   break;
           }
       }
    }
}

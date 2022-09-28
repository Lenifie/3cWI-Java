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


           switch (selectionOfUser)
           {
               case 'e':
                   System.out.println("Geldmenge: ");
                   int payIn = inputFromScanner.nextInt();
                   balance += payIn;
                   System.out.println("Der Betrag von "+ payIn + " wurde eingezahlt.");
                   break;
               case 'a':
                   System.out.println("Geldmenge: ");
                    int drawOut = inputFromScanner.nextInt();
                    balance -= drawOut;
                   System.out.println("Der Betrag von "+ drawOut + " wurde abgehoben.");
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

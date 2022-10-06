import java.util.Arrays;
import java.util.Scanner;


public class Verschluesselung {
    public static String encrypt(int Verschiebung, String Satz)
    {
        String Satzencrypt = "";
        int Buchstabe = 0;

        for(int i = 0; i < Satz.length(); i++)
        {
            Buchstabe = Satz.charAt(i);
            Buchstabe += Verschiebung;
            Satzencrypt += Buchstabe;
        }
        return Satzencrypt;
    }
    public static String decrypt(String Satz)
    {
        int Buchstabe = 0;
        String SatzEncrypted = "";
        boolean isProgrammRunning = true;

        while(isProgrammRunning=true){
            for(int i = 0; i<Satz.length(); i++)
            {
                Buchstabe = Satz.charAt(i);
                Buchstabe -= 1;
                SatzEncrypted += Buchstabe;
            }
            System.out.println("Der Text lautet: ");
            System.out.println(Satz);
            System.out.println("Wurde derText entschluesselt? Wenn ja (1)");
            Scanner inputFromScanner2 = new Scanner(System.in);
            int programmEnd = inputFromScanner2.nextInt();
            if (programmEnd == 1)
            {
                isProgrammRunning = false;
            }

        }
        return Satz;
    }


    public static void main(String[] args) {

        boolean isProgrammRunning = true;
        String SatzE = " ";
        String Puffer= " ";
        int VerschiebungE = 0;
        String Ausgabe = " ";

        while (isProgrammRunning)
        {
            System.out.println("Auswahlmenü:");
            System.out.println("1. Verschlüsseln (e)");
            System.out.println("2. Entschlüsseln (d)");
            System.out.println("3. Beenden (b)");
            Scanner inputFromScanner = new Scanner(System.in);
            char selectionOfUser = inputFromScanner.next().charAt(0);

            switch (selectionOfUser)
            {
                case'e':
                    System.out.println("Um wieviel soll der Text verschoben werden?");
                    VerschiebungE = inputFromScanner.nextInt();
                    System.out.println("Geben Sie einen Text ein:");
                    SatzE = inputFromScanner.next();
                    System.out.println("Der Verschüsselte Text lautet:");
                    Ausgabe = encrypt(VerschiebungE,SatzE);
                    System.out.println(Ausgabe);
                    break;
                case 'd':
                    System.out.println("Eingabe des zu entschluesselnden Textes: ");
                    SatzE = inputFromScanner.next();

                    Ausgabe = decrypt(SatzE);
                    System.out.println(Ausgabe);
                    break;
                case 'b':
                    System.out.println("Wird beendet ...");
                    isProgrammRunning = false;
                    break;
            }


        }
    }


}

import java.util.Arrays;
import java.util.Scanner;


public class Verschluesselung {
    public String encrypt()
    {
        int Verschiebung = 0;
        String Satz = "";
        int Buchstabe = 0;

        for(int i = 0; i < Satz.length(); i++)
        {
            Buchstabe = Satz[i];
            Buchstabe += Verschiebung;
            Satz[i] = Buchstabe;
        }
        return Satz;
    }
    public String decrypt(String Satz)
    {
        int Buchstabe = Satz[i];
        boolean isProgrammRunning = true;
        do{
            for(int i = 0; i<Satz.length(); i++)
            {
                Buchstabe = Satz[i];
                Buchstabe -= 1;
                Satz[i]= Buchstabe;
            }
            System.out.println("Der Text lautet: ");
            System.out.println(Satz);
            System.out.println("Wurde derText entschluesselt? Wenn ja (j)");
            Scanner inputFromScanner = new Scanner(System.in);
            char programmEnd = inputFromScanner.next().charAt();
            if (programmEnd == 'j')
            {
                isProgrammRunning = flase;
            }
        }while(isProgrammRunning = false);
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

                    System.out.println("Der Verschüsselte Text lautet:e");
                    SatzE = inputFromScanner.next();

                    Ausgabe = encrypt(Verschiebung, Satz);
                    System.out.println(Ausgabe);
                    break;
                case 'd':
                    System.out.println("Eingabe des zu entschluesselnden Textes: ");
                    SatzE = inputFromScanner.next();

                    Ausgabe = decrypt(Satz);
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

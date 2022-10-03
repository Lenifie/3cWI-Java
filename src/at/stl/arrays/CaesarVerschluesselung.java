package at.stl.arrays;
import java.util.Scanner;

public class CaesarVerschluesselung
{
    public static void main(String[] args)
    {
    /*Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine
    fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c,
    f wird zu h, z wird zu b usw.

    Implementiere eine Methode encrypt(String):
    String und eine Methode decrypt(String):String */

        //encyprt Verschlüsseln
        //decrypt Entschlüsseln
        boolean isProgrammRunning = true;



        while (isProgrammRunning)
        {
            System.out.println("Möchten Sie eine NAchricht entschlüsseln oder verschlüsseln?");
            System.out.println("(e) Text verschlüsseln");
            System.out.println("(d) Text entschlüsseln");

            Scanner inputFromScanner = new Scanner(System.in);
            char selectionOfUser = inputFromScanner.next().charAt(0);



            switch (selectionOfUser)
            {
                case 'e':
                    System.out.println("Um wie viel soll es verschoben werden?");
                    int moveLetter = inputFromScanner.nextInt();
                    System.out.println(moveLetter);

                    System.out.println("Eingabe des Textes");
                    String sentence = inputFromScanner.toString();

                    break;
                case 'd':
                    break;
            }
        }
    }
}

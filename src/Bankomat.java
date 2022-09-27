import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        int einzahlen = 0;
        int abheben = 0;
        int kontostand = 0;
        int beenden = 0;
        Scanner eingabe = new Scanner(System.in);
        int eingabe = eingabe.nextInte();
        Scanner auswahl = new Scanner(System.in);
        boolean auswahl = auswahl.nextBoolean();
        System.out.println("Auswahlmenü:");
        System.out.println("1. Einzahlen (e)");
        System.out.println("2. Abheben (a)");
        System.out.println("3. Kontostand (k)");
        System.out.println("4. Beenden (b)");
        auswahl.nextBoolean();

        switch (auswahl)
        {
            case e:
                System.out.println("Geldmenge: ");
                eingabe.nextInt(einzahlen);
                kontostand = kontostand + einzahlen;
                System.out.println(kontostand);

                break;
            case a:
                System.out.println("Geldmenge: ");
                eingabe.nextInt(abheben);
                kontostand = kontostand - abheben;
                break;
            case k:
                System.out.println("Der kontostand ist: ");
                System.out.println(kontostand);
                break;
            case b:
                System.out.println("Wird beendet ...");
                break;
        }
    }
}

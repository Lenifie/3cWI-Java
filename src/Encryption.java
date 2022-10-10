import java.util.Scanner;


public class Encryption {
    public static String encrypt(int letterShift,String sentenceToEncrypt)
    {
        String encryptedSentence = "";
        int letter = 0;

        for(int i = 0; i < sentenceToEncrypt.length(); i++)
        {
            letter = sentenceToEncrypt.charAt(i);

            letter += letterShift;

            if (letter > 96 && letter>122){
                letter = 96 + (letter - 122);
            }else if(letter > 64 && letter > 90){
                letter = 64 + (letter - 90);
            }
            String letterAsString = Character.toString(letter);
            encryptedSentence += letterAsString;
        }
        return encryptedSentence;
    }
    public static String decrypt(int letterShift,String sentenceToDecrypt)
    {
        int letter = 0;
        String encryptedSentence = "";
        boolean isProgrammRunning = true;

        while(isProgrammRunning=true){
            for(int i = 0; i<sentenceToDecrypt.length(); i++)
            {
                letter = sentenceToDecrypt.charAt(i);

                String letterAsString = Character.toString(letter);
                encryptedSentence += letterAsString;
            }
            System.out.println("Der Text lautet: ");
            System.out.println(sentenceToDecrypt);
            System.out.println("Wurde derText entschluesselt? Wenn ja (1)");
            Scanner inputFromScanner2 = new Scanner(System.in);
            int programmEnd = inputFromScanner2.nextInt();
            if (programmEnd == 1)
            {
                isProgrammRunning = false;
            }

        }
        return sentenceToDecrypt;
    }

    public static void run(){
        boolean isProgrammRunning = true;
        String letterShiftE, sentenceToDecrypt = " ";
        String Puffer= " ";
        int letterShiftE = 0;
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
                    letterShiftE = inputFromScanner.nextInt();
                    System.out.println("Geben Sie einen Text ein:");
                    letterShiftE, sentenceToDecrypt = inputFromScanner.next();
                    System.out.println("Der Verschüsselte Text lautet:");
                    Ausgabe = encrypt(letterShiftE,letterShiftE, sentenceToDecrypt);
                    System.out.println(Ausgabe);
                    break;
                case 'd':
                    System.out.println("Eingabe des zu entschluesselnden Textes: ");
                    letterShiftE, sentenceToDecrypt = inputFromScanner.next();

                    Ausgabe = decrypt(letterShiftE, sentenceToDecrypt);
                    System.out.println(Ausgabe);
                    break;
                    
                case 'b':
                    System.out.println("Wird beendet ...");
                    isProgrammRunning = false;
                    break;
            }


        }
    }

    public static void main(String[] args) {
        //run();
        String result = encrypt(2,"ABYZabyz");
        System.out.println(result);
        result = decrypt(sentenceToDecrypt);
        System.out.println(result);
    }


}

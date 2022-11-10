package at.stl;

import java.util.Scanner;

public class beep {
    public static void main(String[] args) {
        System.out.println("Eingabe einer Zahl zwischen 1-100:");
        Scanner inputFromScanner = new Scanner(System.in);
        int eingabe = inputFromScanner.nextInt();
        boolean isProgrammRunning = true;

        while(isProgrammRunning) {
            if ((eingabe > 1) && (eingabe < 100)) {
                eingabe = eingabe +1;
                if (eingabe % 10 == 0) {
                    System.out.println("BEEP");
                }
                if (eingabe > 100) {
                    isProgrammRunning = false;
                    System.out.println("Ende");
                }
            }
        }


    }
}

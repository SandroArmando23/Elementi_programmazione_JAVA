package esercizi_lezione01;

import java.util.Scanner;
import java.time.LocalDate;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            // Mostra il menu
            System.out.println("\nMenu:");
            System.out.println("1. Saluta");
            System.out.println("2. Mostra data");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione (1-3): ");

            // Input della scelta
            scelta = scanner.nextInt();

            // Gestione delle opzioni
            switch (scelta) {
                case 1:
                    System.out.println("Ciao! Come stai oggi?");
                    break;
                case 2:
                    LocalDate data = LocalDate.now();
                    System.out.println("Oggi è: " + data);
                    break;
                case 3:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Errore: opzione non valida. Scegli un numero tra 1 e 3.");
            }
        } while (scelta != 3);

        scanner.close();
    }
}
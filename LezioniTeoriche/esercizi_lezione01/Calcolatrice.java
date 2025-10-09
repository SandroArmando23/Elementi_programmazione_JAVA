package esercizi_lezione01;

import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operazione;

        while (true) {
            // Input dell'operazione
            System.out.print("Inserisci l'operazione (+, -, *, /) o 'fine' per uscire: ");
            operazione = scanner.nextLine();

            // Controllo se l'utente vuole uscire
            if (operazione.equalsIgnoreCase("fine")) {
                System.out.println("Calcolatrice terminata.");
                break;
            }

            // Verifica se l'operazione è valida
            if (!operazione.equals("+") && !operazione.equals("-") && 
                !operazione.equals("*") && !operazione.equals("/")) {
                System.out.println("Errore: operazione non valida. Usa +, -, *, / o 'fine'.");
                continue;
            }

            // Input dei due numeri
            System.out.print("Inserisci il primo numero: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Inserisci il secondo numero: ");
            double numero2 = scanner.nextDouble();
            scanner.nextLine(); // Consuma il newline residuo

            // Esecuzione dell'operazione con switch
            double risultato;
            switch (operazione) {
                case "+":
                    risultato = numero1 + numero2;
                    System.out.println(numero1 + " + " + numero2 + " = " + risultato);
                    break;
                case "-":
                    risultato = numero1 - numero2;
                    System.out.println(numero1 + " - " + numero2 + " = " + risultato);
                    break;
                case "*":
                    risultato = numero1 * numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + risultato);
                    break;
                case "/":
                    if (numero2 == 0) {
                        System.out.println("Errore: divisione per zero non consentita.");
                    } else {
                        risultato = numero1 / numero2;
                        System.out.println(numero1 + " / " + numero2 + " = " + risultato);
                    }
                    break;
            }
        }
        scanner.close();
    }
}
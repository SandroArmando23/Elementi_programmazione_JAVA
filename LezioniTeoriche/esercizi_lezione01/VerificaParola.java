package esercizi_lezione01;

import java.util.Scanner;

public class VerificaParola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input della parola
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine().trim();
        
        // Verifica se la parola è vuota
        if (parola.isEmpty()) {
            System.out.println("Nessuna parola inserita");
        } 
        // Verifica se inizia con una vocale
        else if (parola.toLowerCase().matches("^[aeiou].*")) {
            System.out.println("Inizia con vocale");
        } 
        // Verifica se la parola ha più di 5 caratteri
        else if (parola.length() > 5) {
            System.out.println("Parola lunga");
        } 
        // Caso rimanente: parola corta
        else {
            System.out.println("Parola corta");
        }
        
        scanner.close();
    }
}

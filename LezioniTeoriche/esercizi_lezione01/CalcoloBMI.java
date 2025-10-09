package esercizi_lezione01;

import java.util.Scanner;

public class CalcoloBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input del peso
        System.out.print("Inserisci il peso in kg: ");
        double peso = scanner.nextDouble();
        
        // Input dell'altezza
        System.out.print("Inserisci l'altezza in metri: ");
        double altezza = scanner.nextDouble();
        
        // Validazione degli input
        if (peso <= 0 || altezza <= 0) {
            System.out.println("Errore: peso e altezza devono essere maggiori di zero.");
            scanner.close();
            return;
        }
        
        // Calcolo del BMI
        double bmi = peso / (altezza * altezza);
        
        // Determinazione della categoria
        if (bmi < 18.5) {
            System.out.printf("BMI: %.2f - Sottopeso%n", bmi);
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("BMI: %.2f - Normopeso%n", bmi);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.printf("BMI: %.2f - Sovrappeso%n", bmi);
        } else {
            System.out.printf("BMI: %.2f - Obeso%n", bmi);
        }
        
        scanner.close();
    }
}
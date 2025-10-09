package esercizi_lezione01;
import java.util.Scanner;
public class ValutazioneEsami {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input dei tre voti
	        System.out.print("Inserisci il voto del primo esame (0-30): ");
	        int voto1 = scanner.nextInt();
	        System.out.print("Inserisci il voto del secondo esame (0-30): ");
	        int voto2 = scanner.nextInt();
	        System.out.print("Inserisci il voto del terzo esame (0-30): ");
	        int voto3 = scanner.nextInt();
	        
	        // Validazione dei voti
	        if (voto1 < 0 || voto1 > 30 || voto2 < 0 || voto2 > 30 || voto3 < 0 || voto3 > 30) {
	            System.out.println("Errore: i voti devono essere compresi tra 0 e 30.");
	            scanner.close();
	            return;
	        }
	        
	        // Calcolo della media
	        double media = (voto1 + voto2 + voto3) / 3.0;
	        
	        // Verifica se almeno un voto è inferiore a 18
	        if (voto1 < 18 || voto2 < 18 || voto3 < 18) {
	            System.out.println("Attenzione: hai almeno un esame insufficiente");
	        }
	        
	        // Valutazione della media
	        if (media >= 28) {
	            System.out.printf("Media: %.2f - Promosso con lode%n", media);
	        } else if (media >= 18) {
	            System.out.printf("Media: %.2f - Promosso%n", media);
	        } else {
	            System.out.printf("Media: %.2f - Bocciato%n", media);
	        }
	        
	        scanner.close();
	    }
}

package esercizi_lezione01;
import java.util.Scanner;
public class esercizi_lezione2 {
	public static void main(String[] args) {
		
		/**
		 * ### Esercizi Lezione 2: if, for, switch, while ecc
		 */

		
		/**1. Esercizio1
Un negozio offre uno sconto speciale ai clienti che soddisfano almeno una di
due condizioni: Sono membri del club fedeltà. Hanno speso più di 100 euro
nell'ultimo acquisto.
*/
		
		
		
		
		
		
		
		/**
		 * 2. Esercizio2
		 
		Scrivi un programma che chiede all'utente di inserire un numero compreso tra
		10 e 20. Usa l'operatore ||
*/
		
		
		
		
		
		
		

		/**3. Esercizio3
		Sono un docente devo assegnare dei voti. Se il voro è sotto il 70
		assegno F, se il voro è sotto 80 assegno C, se il voto è sotto 90 assegno B,
		se è maggiore di 90 assegno A
*/
		
		
		
		
		
		
		
		
		
		
		
	/**	4. Esercizio4
		Scrivi un programma che prenda in input il numero del mese (1-12) e stampi la stagione corrispondente:

		- Dicembre, Gennaio, Febbraio: "Inverno"
		- Marzo, Aprile, Maggio: "Primavera"
		- Giugno, Luglio, Agosto: "Estate"
		- Settembre, Ottobre, Novembre: "Autunno"
*/
		
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Inserisci il numero del mese (1-12): ");
		        int mese = scanner.nextInt();
		        
		        switch (mese) {
		            case 12:
		            case 1:
		            case 2:
		                System.out.println("Inverno");
		                break;
		            case 3:
		            case 4:
		            case 5:
		                System.out.println("Primavera");
		                break;
		            case 6:
		            case 7:
		            case 8:
		                System.out.println("Estate");
		                break;
		            case 9:
		            case 10:
		            case 11:
		                System.out.println("Autunno");
		                break;
		            default:
		                System.out.println("Errore: inserisci un numero di mese valido (1-12)");
		        }
		        
		        scanner.close();
	


		
		
		
		
		
		
		
	/**	5. Esercizio5
		Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa "Zoom", per tutti i multipli di 5 stampa "Boom". Per tutti i multipli di 3 e 5 stampa "Zoom Boom"
*/
		
	
		
		
	/**	6. Esercizio6
		Crea una calcolatrice che continui a chiedere all'utente:
		- Due numeri
		- Un'operazione (+, -, *, /)
		Usa switch per gestire le operazioni e while per ripetere finché l'utente non digita "fine".
*/
		
		
		
		
		
	/**	7. Esercizio7
		Scrivi un programma che mostri un menu con le seguenti opzioni:
		- Saluta
		- Mostra data
		- Esci
		Il programma deve continuare a mostrare il menu finché l'utente non sceglie l'opzione 3. Usa un ciclo do-while.
*/
		
		
		
		
		
		
		
		
		
		
		
		
	/**	8. Esercizio8
		Scrivi un programma che chieda all'utente il voto di tre esami (da 0 a 30). Calcola la media e stampa:

		- "Promosso con lode" se la media è maggiore o uguale a 28
		- "Promosso" se la media è maggiore o uguale a 18
		- "Bocciato" se la media è minore di 18

		Inoltre, se almeno un voto è inferiore a 18, stampa anche "Attenzione: hai almeno un esame insufficiente".

*/
		
		
		
		
		
		
		
		
		
		
	/**	9. Esercizio9
		Scrivi un programma che chieda peso (in kg) e altezza (in metri) e calcoli il BMI con la formula: BMI = peso / (altezza * altezza)
		Stampa la categoria corrispondente:

		- BMI < 18.5: "Sottopeso"
		- BMI >= 18.5 e < 25: "Normopeso"
		- BMI >= 25 e < 30: "Sovrappeso"
*/
		
		
		
		
		
		
		
		
		
		
		
		
	/**	10. Esercizio10
		Scrivi un programma che chieda all'utente una parola e verifichi:

		- Se la parola è vuota, stampa "Nessuna parola inserita"
		- Se la parola inizia con una vocale, stampa "Inizia con vocale"
		- Se la parola ha più di 5 caratteri, stampa "Parola lunga"
		- Altrimenti stampa "Parola corta"
		*/
		
		
		
		
		
		
		
	}

}

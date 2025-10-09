package lezione01_statement;

import java.util.Scanner;

public class While_statement {
	public static void main(String[] args) {
		
		//while fa parte dei Cicli indefiniti
		//non so a priori quando si fermerà, quanti giri farà
		
		/**
		 * SINTASSI:
		 * while (condizione){
		 * .....esegui fin quando la condizione è TRUE
		 * }
		 */
		
		//Posso replicare un ciclo for utilizzando while
		
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);                   // va all'infinito perche 0 è sempre minore di 10 percio si aggiunge i++
			i++;
		}
		
		// do-while: questo costrutto prima permette di eseguire qualcosa, poi controlla
		//almeno una volta, la prima, viene eseguito il codice 
		
		int m = 1;
		
		do {
			int risultato = m * 5;
			System.out.println("5 x " + m + "=" + risultato);
			m++;
		}while (m <= 10);
		
		
		
		//esempio con scanner
		//l'utente non entra finchè la pw non è corretta
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Inserisci la parola d'ordine");
		
		String pass = scann.nextLine();
		int tentativi = 1;
		boolean indovinato = true;
		
		while(!pass.equals("ciaoCiccio")) {
			
			tentativi++;
			
			if(tentativi < 4) {
			System.out.println("parola d'ordine errata");
			System.out.println("Riprova");
			pass = scann.nextLine();
			} else {
				System.out.println("Mi spiace, non puoi più provare");
				indovinato = false;
				break;
			} 
	}
		if (indovinato) {
			System.out.println("Bravo, hai indovinato la password al " + tentativi + " tentativo");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

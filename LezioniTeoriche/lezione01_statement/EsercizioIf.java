package lezione01_statement;

public class EsercizioIf {
	public static void main(String[] args) {

		/**
		 * Un negozio offre uno sconto speciale ai clienti che soddisfano almeno una di
		 * due condizioni: Sono membri del club fedeltà. Hanno speso più di 100 euro
		 * nell'ultimo acquisto.
		 */

		double spesaTotale = 90.50;
		boolean hasFedelta = false;
		double spesaScontata = 0; //questa si chiama variabile di supporto

		if (hasFedelta || spesaTotale >= 100) {
			System.out.println("Carissimo cliente, hai diritto ad uno sconto del 5%");
			// Calcolare lo sconto e stampare il prezzo scontato del 5%
			spesaScontata = spesaTotale - (spesaTotale * 5 / 100);
			System.out.println("Adesso pagherai: " + spesaScontata);
		} else {
			System.out.println("Acquisto senza sconti!!");
			System.out.println("Prezzo finale: " + spesaTotale);
		}

		/**
		 * Scrivi un programma che chiede all'utente di inserire un numero compreso tra
		 * 10 e 20. Usa l'operatore ||
		 */
		
		int numeroUser = 25;
		
		if(numeroUser < 10 || numeroUser > 20) {
			System.out.println("Errore, hai inserito un numero fuori dall'intervallo");
		}else {
			System.out.println("Hai inserito un numero nell'intervallo corretto");
		}

		/**
		 * Un sistema di sicurezza fa scattare un allarme se la temperatura in una
		 * stanza supera i 40 gradi o se il livello di umidità supera il 75%.
		 */

		int temp = 35;
		int hum = 60;

		if (temp >= 40 || hum >= 75) {
			System.out.println("Fa molto caldo in casa, aprire le finestre");
		} else {
			System.out.println("Temperatura e umidità nella norma");
		}
	}
}

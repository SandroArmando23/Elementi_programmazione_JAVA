package lezione01_statement;

public class If_Statement {
	public static void main(String[] args) {

		/**
		 * Sintassi IF if(condizione){ ...eseguo se condizione è TRUE }else
		 * if(condizione2){ ...eseguo se condizione2 è TRUE } else{ ...eseguo se tutto
		 * il resto è FALSE }
		 */

		boolean piove = true;

		if (piove) {
			System.out.println("Porta un ombrello !!");
		} else {
			System.out.println("Oggi non piove, vestiti come vuoi");
		}

		// esempio

		int miaEta = 2;

		if (miaEta >= 18) {
			System.out.println("Sei maggiorenne!");
		} else {
			System.out.println("Sei minorenne!");
		}

		// esempio: posso giocare solo se sono maggiorenne, se sono minorenne devo
		// essere accompagnato, se sono più piccolo di 10 anni non posso proprio entrare

		if (miaEta >= 18) {
			System.out.println("Benvenuto, puoi giocare !");
		} else if (miaEta < 18 && miaEta >= 10) {
			System.out.println("Puoi giocare solo se accompagnato da un maggiorenne !");
		} else if (miaEta >= 0 && miaEta < 10) {
			System.out.println("Mi spiace, non puoi proprio giocare !");
		} else {
			System.out.println("Hai inserito un'età non valida !!");
		}

		// Esercizio: Sono un docente devo assegnare dei voti. Se il voro è sotto il 70
		// assegno F, se il voro è sotto 80 assegno C, se il voto è sotto 90 assegno B,
		// se è maggiore di 90 assegno A

		int voto = 87;

		if (voto < 70 && voto > 0) {
			System.out.println("Votazione: F");
		} else if (voto >= 70 && voto < 80) {
			System.out.println("Votazione: C");
		} else if (voto >= 80 && voto < 90) {
			System.out.println("Votazione: B");
		} else if (voto >= 90 && voto <= 100) {
			System.out.println("Votazione: A");
		} else {
			System.out.println("Voto inserito non corretto");
		}

		if (voto <= 100 && voto > 0) {

			if (voto >= 90) {
				System.out.println("Votazione: A");
			} else if (voto >= 80) {
				System.out.println("Votazione: B");
			} else if (voto >= 70) {
				System.out.println("Votazione: C");
			} else{
				System.out.println("Votazione: F");
			}

		} else {
			System.out.println("Voto inserito non corretto");
		}

		
		
		
		
	}
}

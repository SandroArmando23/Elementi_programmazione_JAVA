package lezione01_statement;

public class Stringhe {
	public static void main(String[] args) {
		
		//Le stringhe non sono tipi primitivi, sono paragonabili agli oggetti 
		String mioNome = "Dario";
		
		System.out.println(mioNome.charAt(0));
		System.out.println(mioNome.charAt(1));
		System.out.println("I caratteri nella stringa sono: " + mioNome.length());
		
		//esiste un altro modo per dichiarare le stringhe, usando la parola chiave new
		String tuoNome = new String("Dario");
//		String tuoNome = "Dario";
		
		System.out.println(tuoNome);
		System.out.println(tuoNome.length());
		
		//Att: se devo confrontare 2 stringhe non mi conviene usare == ma dovrò usare .equals()
		
		if(mioNome == tuoNome) {
			System.out.println("Oh, ci chiamiamo allo stesso modo!");
		}else {
			System.out.println("Abbiamo nomi diversi");
		}

		if(mioNome.equals(tuoNome)) {
			System.out.println("Ci chiamiamo allo stesso modo");
		}else {
			System.out.println("Abbiamo nomi diversi");
		}
		
		
		/**
		 * ACCESSO AL SITO WEB
		 * Un utente può avere vari ruoli, se è "moderatore" oppure "amministratore" può accedere ad un'area riservata. Se è un utente "base" accede solo all'area di visualizzazione. Se non ha un ruolo non può proprio accedere alla piattaforma
		 */
		
		String tuoRuolo = "moderatore";
		
		
		if(tuoRuolo.equalsIgnoreCase("amministratore") || tuoRuolo.equalsIgnoreCase("moderatore")) {
			System.out.println("Ciao " + tuoRuolo + " benvenuto nella tua area riservata");
		}else if(tuoRuolo.equalsIgnoreCase("base")) {
			System.out.println("Ciao utente " + tuoRuolo + " benvenuto nell'area di visualizzazione");
		}else {
			System.out.println("Mi spiace, non puoi accedere");
		}
		
		if(tuoRuolo.equals("ammistratore")) {
			System.out.println("Ciao " + tuoRuolo + " benvenuto nella tua area riservata");
		}else if(tuoRuolo.equalsIgnoreCase("moderatore")) {
			System.out.println("Ciao " + tuoRuolo + " benvenuto nella tua area riservata");			
		}else if(tuoRuolo.equalsIgnoreCase("base")) {
			System.out.println("Ciao utente " + tuoRuolo + " benvenuto nell'area di visualizzazione");
		}else {
			System.out.println("Mi spiace, non puoi accedere");
		}
		
		System.out.println("BUONA SERATA A TUTTI !!!!");
		
	}
}

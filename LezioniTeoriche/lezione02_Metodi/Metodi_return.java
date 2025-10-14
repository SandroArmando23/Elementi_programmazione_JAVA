package lezione02_Metodi;

public class Metodi_return {
// tipo del vaLORE DI RITORNO 
	//quando ho un valore da restituire devo obbligartoriamente usare la parola chiave return
	public static double calcolaQualcosa() {
		double numero = 8 * 2.3;
		return numero;
	}
	
	public static double calcolaAltro(double num) {
		double risultato = num / 9;
		return risultato;
	}
	
	public static String[] stampaAula() {
		String[] nomiStudenti = {
				"CAZZO-GIGA",
	    		"Frank",
	    		"Francesco",
	    		"Ajmal",
	    		"Andrea",
	    		"Matteo",
	    		"Pablo",
	    		"Hossein",
	    		"Madhi"};
		
		return nomiStudenti;
	}
 	
	public static void main(String[] args) {
		//devo raccogliere il valore che mi viene restituito dal metodo
		double numero = calcolaQualcosa();
		
		System.out.println(numero);
		
		//posso anche raccoglierlo direttamente nel syso
		
		System.out.println(calcolaQualcosa());
		
		//chiamo calcolaAltro passando un numero in ingresso
		double risultato = calcolaAltro(81.3);
		System.out.println("Il risultato del calcolo è: " + risultato);
		
		//chiamo stampaAula
		String[] studenti = stampaAula();
		for(int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}
	}
	
}


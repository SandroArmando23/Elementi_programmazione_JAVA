package lezione01_statement;

public class esemoi_for {
	public static void main(String[] args) {
		
		String[] nomeStudenti = {
				"Andrea",
				"Francesco",
				"Giacomo",
				"Frank",
				"Madhi",
				"Matteo",
				"Pablo"
		};
		
		System.out.println("In classe sono presenti " + nomeStudenti.length + "studenti");
		
		//Voglio leggere il nome degli studenti
		for(int i= 0; i < nomeStudenti.length; i++) {
			System.out.println("Ciao" + nomeStudenti[i]);
			
	}
		
		
		
		// Leggo elenco al contrario
		
		System.out.println("Leggo l'elenco al contrario");
		for(int i = nomeStudenti.length -1; i >= 0; i--) { // -1 perche sono 8 gli indici, finchè i>=0 e i-- per partire da 8 (il -1 di prima) a scendere
			System.out.println("Ciao " + nomeStudenti[i]);
		}
		
		
		
		//Posso leggere gli array utilizzando il foreach. è ottimizzato per gli array
		
		
				System.out.println("Leggo con il foreach");
				for (String nome : nomeStudenti) {
					System.out.println(nome);
				}
				
	//Calcola la somma di tutti i primi 100 numeri	
		
		int somma = 0;
		for(int i = 0; i <=100; i++) {
			somma += i;
		}
		
		System.out.println("LA SOMMA DEI PRIMI 100 NUMERI VALE: " + somma);
		
		
		
		
		
	
		
		
		
		
}
}

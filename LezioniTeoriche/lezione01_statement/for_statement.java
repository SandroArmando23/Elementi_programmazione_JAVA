package lezione01_statement;

public class for_statement {
	public static void main(String[] args) {
		
	for (int i = 0; i < 3; i++) {
		System.out.println(i);
	}
		
		/**
		 * for(int i = 0; i < 3; i++ {}
		 * 
		 * 1 GIRO => i = 0; 0 < 3 [TRUE]; 1
		 * 2 GIRO => i = 1; 1 < 3 [TRUE]; 2
		 * 3 GIRO => i = 2; 2 < 3 []TRUE; 3
		 * 4 GIRO => i = 3;
		 * 
		 */
		
		
		System.out.println("For Inverso");
		 for(int i = 2; i >= 0; i--) {
			 System.out.println(i);
		 }
		
		
		// for con dopiia variabile
		 
		 
		 for(int a = 0, b = 9; b >= 0; b--, a++ ) {
		//	 System.out.println("a: " + a " - b: " + b);
		 }
		 
		 
		 // for con break: quando lo uso all'internio di un ciclo for sto interrompendo il ciclo
		 
		 System.out.println("For con il Break");
		 
		 for(int i = 0; i < 10; i++) {
			 
			 System.out.println(i);
			 if(i == 5) {
				 break;
				 
			// for con il continue: l'uso del continue mi permette di saltare un giro
				 
				 System.out.println("Ciclo con il continue");
				 for(int i1 = 0; i1 < 10; i1++) {
					 if(i1 == 5) {
						 System.out.println("Sto saltando questo numero: " + i1);
						 continue;
					 }
					 
				
				 } 
					 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			 }
		 }
		 
		 
		 
		 
		 
	}
}

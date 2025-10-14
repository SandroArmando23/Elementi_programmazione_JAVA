package giochi;

import java.util.Random;

public class tombola {
//chiedi all'utente quanti numeri vuole estrarre da un set di 90 numeri.
//inserisci questi numeri in un array
	//controlla che non ci siano ripetizioni
	
	public static void gioca() {
		//estrai 20 numeri
		
		Random rand = new Random();
		
		int[] numEstratti = new int[20];
		
	for(int i = 1; i <= 20; i++) {
		System.out.println(rand.nextInt(90) + 1 + " - ");
	}
		
		
	}
	
	
	
}

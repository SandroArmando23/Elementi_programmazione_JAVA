package lezione01_statement;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
//Array: sono un contenitore ordinato di elementi simili tra loro(tutti hanno e devono avero lo stesso tipo). Possono ncontenere tipi pirimitivi ma anche riferimenti ad oggetti. sono indicizzati(0-based), hanno un indice posizionale che parte da 0.
//vengono indicizzati tra parentesi[]
//In Java gli array sono oggetti, infatti vengono registrati nella memoria heap
		
		
		//Definisco un array
String[] colori = new String[5];
	
	
	colori[0] = "Verde";
	colori[1] = "Blu";
	colori[2] = "Giallo";
	colori[3] = "Viola";
	colori[4] = "Rosso";
	
		
String[] frutti = {"mela", "pera", "banana", "ananas", "ciliegia"};
	
		System.out.println(frutti); // se stampo l'array di frutti ottengo l'indirizzo alla memoria, questo perche gli array sono oggetti
		
//un modo per stampare i singoli frutti in un colpo solo sono i cicli for. il ciclo for permette di leggere un array basandosi sull'indice posizionale
		
		
//in questo caso utilizzo un foreach, ottimizzato proprio per gli array
		for (String frutto : frutti) {
			System.out.println(frutto);
		}
		
		
		//Voglio creare un array con la dimensione scelta dallìutente
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione dell'array");
		
		int dimArray = input.nextInt();
		
		int [] mioArray = new int [dimArray];
		
		//adesso vado a riempire l'array con dei numeri inseriti sempre dallo user
		
		int indice = 0;
		do {
			System.out.println("Inserisci un numero intero");
			mioArray[indice] = input.nextInt();
			
			indice++;
		}while(mioArray.length > indice);
		
		//leggo array con un for
		
		for(int num: mioArray) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
	}
}

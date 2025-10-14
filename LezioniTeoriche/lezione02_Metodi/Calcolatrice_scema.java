package lezione02_Metodi;

import java.util.Scanner;

import esercizi_lezione01.CalcoloBMI;

public class Calcolatrice_scema {
//Per ogni operazione(+-*/) crea un metodo che accetta due parametri e ne restituisce uno solo
	//nel metodo main testa i singoli metodi
	//DOPO: nel main utilizza uno scanner per permettere all'utente di inserire prima i 2 numeri e poi l'operazione da eseguire
	
	public static double somma(double a, double b) {
		return a + b;
		
	}
	
	public static double sottrazione(double a, double b) {
		return a - b; 
	}
	
	public static double moltiplicazione(double a, double b) {
		return a * b;
	}
	
	public static double divisione (double a, double b) {
	
		if (b == 0) {
			System.out.println("Divisione per 0 non consentita");
		}
		
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**Calcolatrice_scema calc = new Calcolatrice_scema();
		System.out.println("Inserisci il primo numero: ");
		double numA = scanner.nextDouble();
		
		System.out.println("Inserisci il secondo numero: ");
		double numB = scanner.nextDouble();
		
		System.out.println("Inserisci il tipo di operazione da eseguire: ");
		String operatore = scanner.next();
		if(operatore.contentEquals("+")) {
			System.out.println("Il risultato della somma è: " + (numA + numB));
		}else if (operatore.contentEquals("-")) {
			System.out.println("Il risultato della sottrazione è: " + (numA - numB));
		}else if (operatore.contentEquals("*")) {
			System.out.println("Il risultato della moltiplicazione è: " + (numA * numB));
		}else if (operatore.contentEquals("/")) {
			System.out.println("Il risultato della divisione è: " + (numA / numB));
		}*/
		
		boolean uscita = false;
		while(!uscita) {
			System.out.println("Inserisci i due numeri.");
			
			double n1 = scanner.nextDouble();
			double n2 = scanner.nextDouble();
			
			String lineaPulizia = scanner.nextLine();
			
			String operazione = scanner.nextLine();
			System.out.println("Inserisci l'operazione da eseguire");
			
			switch(operazione) {
			case "+":
				double risultatoSomma = somma(n1, n2);
				System.out.println("Risultato: " + risultatoSomma);
				break;
			case "-":
				double risultatoSott = sottrazione(n1, n2);
				System.out.println("Risultato: " + risultatoSott);	
				break;
			case "*":
				double risultatoProd = moltiplicazione(n1, n2);
				System.out.println("Risultato: " + risultatoProd);
				break;
			case "/":
				if(n2 != 0) {
				double risultatoDiv = divisione(n1, n2);
				System.out.println("Risultato: " + risultatoDiv);
				}else {
					System.out.println("Attenzione, stai dividendo per 0, non consentito");
				}
				break;
			}
			
			System.out.println("Vuoi fare altri calcoli? (S/N)");
			String sino = scanner.nextLine();	
			
//			uscita = (sino.equals("S")) ? false: true;   in questo modo piu veloce ma con quello sotto capisci meglio cosa fa 
			
			if(sino.equals("S")) {
				uscita = false;
			}else if(sino.equals("N")){
				uscita = true;
				System.out.println("Ciao alla prossima");
			}
		}
		
		
		
	}
	
	
}

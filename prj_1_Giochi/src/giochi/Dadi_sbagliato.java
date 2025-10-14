package giochi;

import java.util.Random;
import java.util.Scanner;

public class Dadi_sbagliato {

public static void gioca()	{
	System.out.println("I dadi quante facce vuoi che abbiano?");
	Scanner scan = new Scanner(System.in);
	
	int facce = scan.nextInt();
	int tentativi = 0;
    boolean continua = true;
    
    while (continua) {
        tentativi++;
        System.out.println("Tentativo " + tentativi);
        System.out.println("Sto lanciando i dadi...");
    
	
	//Gioco: vinco quando i numeri di due dadi sono uguali ed esce dal gioco. Se perdo proponi all'utente di lanciare nuovamente i dadi sempre con lo stesso numero di facce. Conta quanti tentativi prima di chiudersi.
	
	
	Random rand = new Random();
	int numero1 = rand.nextInt(facce) + 1; // tira fuori numero random tra 0 e 5 per questo poi aggiungo +1
	int numero2 = rand.nextInt(facce) + 1;
	
	//oppure
	
	//double numero1 =(int) Math.ceil(Math.random() * facce);
	//double numero2 =(int) Math.ceil(Math.random() * facce);
	
	
	System.out.println("Dado 1: " + numero1);
	System.out.println("Dado 2: " + numero2);
	
	if(numero1 == numero2) {
		System.out.println("Hai vinto dopo " + tentativi + "tentativi");
		continua = false;
	}else  {
		System.out.println("Mi spiace, hai perso, vuoi riprovare? (S/N)");
		String linea = scan.next();
		String sino = scan.nextLine();
		if(sino.equals("S")) {
			continua = false;
		}else if(sino.equals("N")){
			continua = true;
			System.out.println("Ciao alla prossima");
		}
		
        }
	}
	
	
	
}
	
	
	
}

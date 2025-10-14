package lezione02_Metodi;

import java.util.Iterator;
import java.util.Scanner;

public class intro {
	
	
//I metodi servono a wrappare i codici sotto un unico nome e riutilizzarlo a comando.Posso scomporre unn problema in sotto problemi piu piccoli.
//Sintassi
// public -> modificatore di accesso
//static -> appartiene solo ed esclusivamente alla classe non all'istanza
// void, int, String, boolean, int[] -> tipo di ritorno
//main -> nome metodo
//(int n) -> Argomenti
//	{...body del metodo}
	
//Creo un metodo personalizzato
	
	public static void salutaUtente() {
		Scanner scan = new Scanner(System.in);
		String nomeUser = "Francesco";
		System.out.println("Ciao " + nomeUser);
	}
	public static void salutaDocente() {
// queste due variabili sono Locali esistono solo all'interno di questo metodo
//All'esterno non sono raggiungibili
		String nomeDoc = "Dario Mennillo";
		String materia = "Java";
		
		System.out.println("Docente: " + nomeDoc + " - materia: " + materia);
	}
	
	public static void salutaTutti() {
		salutaDocente();
		salutaUtente();  //chiama un metodo da un altro metodo
	}
	
	//                               parametro d'ingresso
	public static void salutaPerNome(String nome) {
		if(nome.equals("CAZZO-GIGA")) {
			System.out.println("Ciao " + nome + " sei un duro");
		}else {
		System.out.println("Ciao " + nome + ", come stai?");
		}
	}
	
	public static void salutaRespoCorso(String nomeRespo, String cognomeRespo) {
		System.out.println("Ciao " + nomeRespo + " " + cognomeRespo);
	}
	
   public static void main(String[] args) {
	
   	

   //Richiamo il metodo
    salutaUtente();
    salutaDocente();
    salutaTutti();
   
    salutaPerNome("Francesco Canepa");
    
    String[] studenti = {
    		"CAZZO-GIGA",
    		"Frank",
    		"Francesco",
    		"Ajmal",
    		"Andrea",
    		"Matteo",
    		"Pablo",
    		"Hossein",
    		"Madhi"};
    for (int i = 0; i < studenti.length; i++) {
    	salutaPerNome(studenti[i]);
    	
    
		
	}
   
    
     salutaRespoCorso("Faccia", "Da Cazzo");
    
   }
   
   
   
   
}

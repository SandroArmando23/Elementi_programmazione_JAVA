package view;

import java.util.List;
import java.util.Scanner;

import controller.CorsoController;
import controller.StudentiController;
import model.Corso;
import model.Studente;


public class Main {
	private static final Scanner scan = new Scanner(System.in);
	private static final CorsoController controllerCorsi = new CorsoController();
	private static final StudentiController controllerStudenti = new StudentiController();
	
	public static void main(String[] args) {
		
		int scelta;
		do {
			mostraMenu();
			scelta = scan.nextInt(); 
			switch(scelta) {
			case 1:
				inserisciNuovoCorso();
				break;
			case 2:
				inserisciNuovoStudente();
				break;
			case 3:	
				mostraTuttiCorsi();
				break;
			case 4: 
				mostraTuttiStudenti();
				break;
			case 5:
				System.out.println("Arrivederci");
				break;
			default:
				System.out.println("Scelta non valida, prova di nuovo.");
				break;
			}
		}while (scelta != 0);
	}
	
	private static void mostraMenu() {
		System.out.println("\n==== IMMAGINAZIONE LAVORO====");
		System.out.println("1. Inserisci nuovo corso");
		System.out.println("2. Inserisci nuovo studente");
		System.out.println("3. Mostra tutti i corsi");
		System.out.println("4. Mostra tutti gli studenti");
		System.out.println("5. Esci");	
	}
	
	
	private static void inserisciNuovoCorso() {
		System.out.println("\n=== NUOVO CORSO ===");
		String codice = nuovoTesto("Codice Corso:  ");
		String titolo = nuovoTesto("Titolo: ");
		int numeroStudenti = nuovoNumero("Numero di studenti: ");
		
		Corso corso = new Corso(titolo, codice, numeroStudenti);
		controllerCorsi.aggiungiCorso(corso);
		System.out.println("Nuovo Corso aggiunto con successo");
	}

	private static void inserisciNuovoStudente() {
		System.out.println("\n==== NUOVO STUDENTE ====");
		String codFisc = nuovoTesto("Codice Fiscale:").toUpperCase();
		String nome = nuovoTesto("Nome:");
		String cognome = nuovoTesto("Cognome:");
		
		List<String> codiciCorsi = controllerStudenti.ottieniCodiciCorsiDisponibili();
		System.out.println("Corsi disponibili:");
		for(int i = 0; i <codiciCorsi.size();i++) {
			System.out.println((i + 1) + "." + codiciCorsi.get(i));
		}
		int sceltaCorso = nuovoNumero("Scegli numero del corso:");
		if (sceltaCorso < 0|| sceltaCorso >= codiciCorsi.size()) {
			System.out.println("Scelta non valida");
			return;
		}
		
		Studente studente = new Studente(nome, cognome, codFisc, codiciCorsi.get(sceltaCorso));
		controllerStudenti.aggiungiStudente(studente);
		System.out.println("studente aggiunto con successo");
	}
	
	private static void mostraTuttiCorsi() {
		System.out.println("\n====MOSTRA CORSI====");
		List<Corso> corsi = controllerCorsi.vediTuttiCorsi();
		if(corsi.isEmpty()) {
			System.out.println("Nessun corso presente");
		}else {
			System.out.println("Codice:     Titolo      Numeri Studenti");
		}
	}
	private static void mostraTuttiStudenti() {
		
	}
	
	
	private static String nuovoTesto(String testo) {
		System.out.println(testo);
		return scan.nextLine();
	}
	private static int nuovoNumero(String testo) {
		while (true) {
		String input = nuovoTesto(testo);
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Errore: inserisci un numero valido: ");
			}
		}
	}
	
	
	
	
	
	
	
}

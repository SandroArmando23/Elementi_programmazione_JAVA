package lezione01_statement;

public class Switch_statement {
	public static void main(String[] args) {
		
		//Lo switych mi permette di valutare il valore di una variabile dividendola in base ad una casistica
		
		int giornoDellaSettimana = 1;
		
		switch(giornoDellaSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("MErcoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;	
		case 7:
			System.out.println("Domenica");
			break;	
		default: //Nel default ci sono tutti i casi non valutati, contemplati
			System.out.println("Numero di giorno ERRATO");
			break;
			}
	
		//Con le stringhe posso fare lo stesso
		System.out.println("In base al giornio della settimana riceverai un commento");
		
		String giorno = "Martedì";
		
		switch(giorno) {
		case "Lunedì":
			System.out.println("La settimana è appena cominciata ");
			break;
		case "Martedì":
			System.out.println("Siamo solo al secondo giorno ");
			break;
		case "Mercoledì":
		case "Giovedì":
			System.out.println("Siamo nel bel mezzo della settimana");
			break;
		case "Venerdì":
			System.out.println("Ultimo giorno di lavoro ");
		case "Sabato":
		case "Domenica":
			System.out.println("Weekend !!");
			break;
		default:
			System.out.println("Hai inserito qualcosa di errato");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

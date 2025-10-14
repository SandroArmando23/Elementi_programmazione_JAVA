package lezione02_Metodi;

import java.util.Scanner;

public class EsercizioLucchetto {
	
/**Crea un metodo al quale passi 1 parametro solo. Dentro il metodo istanzi una costante "PASS" con un valore
 * a tua scelta. Se il parametro corrisponde al pass il sistema stampa: "Puoi entrare" altrimenti stampa:"non puoi entrare".
 * Il valore deve essere acquisito attraverso uno scanner.
 */

	public static void controlloPass(String password) {
		final String PASS = "0000";
		if (password.equals(PASS)) {
			System.out.println("Puoi Entrare");
		}else {
			System.out.println("Non puoi entrare");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci password: ");
		String input = scanner.nextLine();
		controlloPass(input);
	}
	
}

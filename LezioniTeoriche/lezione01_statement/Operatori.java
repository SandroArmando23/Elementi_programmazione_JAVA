package lezione01_statement;

public class Operatori {
	public static void main(String[] args) {
		//Operatori Matematici + * - /
		
		//% resto della divisione o modulo 
		int resto1 = 12 % 6;
		System.out.println(resto1);
		
		
		//Operatori di confronto o operatori relazionali --> producono sempre un boolean
		// == (uguale a)
		// != (diverso da)
		// > (maggiore) < (minore) >= (maggiore uguale) <= (minore uguale)
		
		
		int n1 = 5;
		int n2 = 6;
		
		boolean c1 = (n1 == n2);
		System.out.println(c1); //false
		
		boolean c2 = (n1 != n2);
		System.out.println(c2); //true
		
		boolean c3 = (n1 > n2);
		System.out.println(c3); //false
		
		boolean c4 = (n1 < n2);
		System.out.println(c4); //true

		boolean c5 = (n1 >= n2);
		System.out.println(c5); //false
		
		boolean c6 = (n1 <= n2);
		System.out.println(c6);//true
		
		
		//Operatori di assegnamento ( = ) 
		//+= operatore con somma
		//-= operatore con sottrazione
		//*= operatore con moltiplicazione
		// /= operatore con divisione
		
		
		int num1 = 10;
		int num2 = 6;
		
//		num1 = num1 + num2;
		num1 += num2;
		System.out.println("num1 vale: " + num1); //16
		
		num1 -= num2; //num1 = num1 - num2
		System.out.println("num1 vale: " + num1); //10
		
		num1 *= 4;
		System.out.println("num1 vale: " + num1); //40
		
		num1 /= 8; //num1 = num1 / 8
		System.out.println("num1 vale: " + num1); //5
		
		
//		Operatori di incremento (++) e decremento(--) aumentano e diminuiscono il valore della variabile di 1
		int i2 = 99;
		
		i2++; // i2 = i2 + 1
		System.out.println(i2);
		
		i2--;  //i2 = i2 - 1 
		System.out.println(i2);
		
		
//		Operatori logici: permettono di avere due o più condizioni valutate 
//		&& AND logico
//		|| OR logico
//		!  NOT logico
		
	}
}

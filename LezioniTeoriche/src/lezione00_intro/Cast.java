package lezione00_intro;

public class Cast {
	public static void main(String[] args) {
		
		// Casting dal piu piccolo al piu grande
		byte anni = 33;
		short anniSh = (short) anni;
		System.out.println(anniSh);
		int anniInt = (int) anniSh;
		System.out.println(anniInt);
		
		//dal piu grande al piu piccolo
		short numero = 250;
		byte numeroBy = (byte) numero;
		System.out.println(numeroBy);  //perdita di dato  300 - 256 = 44 
									  // secondo esempio con 250 fa -6 
										
		
	}

}

package lezione00_intro;

public class Geometria {
	public static void main(String[] args) {
		
		//Con i seguenti dati calcola area e perimetro delle seguenti figure geometriche. Stampa anche il nome davanti ad ogni figura
		/**
		 * Rettangolo: base=18, altezza = 9.4
		 * Triangolo: base=5.8, altezza = 4.6, lato1 = 6.5, lato2 = 3.2
		 * Successivamente modifica il valore della base e dell'altezza del rettangolo
		 */
		
		double baseRett = 18;
		double altezzaRet = 9.4;
		
		// Modifico i valori di base e altezza del rettangolo
		baseRett = 20;
	    altezzaRet = 11.3;
		
		double periMetro = (baseRett + altezzaRet) * 2;
		System.out.println(periMetro);
		double areaRet = (double) (baseRett * altezzaRet);
		System.out.println(areaRet);
		
		double baseTri = 5.8;
		double altezzaTri = 4.6;
		double lato1 = 6.5;
		double lato2 = 3.2;
		
		double perimetroTri =(baseTri + lato1 + lato2);
		System.out.println(perimetroTri);
		double areaTri =(baseTri * altezzaTri) / 2;
		System.out.println(areaTri);
	}

}

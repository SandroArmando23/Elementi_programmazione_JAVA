package lezione00_intro;

public class EsercizioSpesa {
	// Crea un software per calcolare il totale delle spese che avvengono in famiglia. Istanzia 4 variabili: speseGenerali, speseAuto, speseVacanze, speseCasa. Calcola il totale delle spese, la media della spesa, la media sul trimestre
	
	public static void main(String[] args) {
		int speseGenerali = 1200;
		int speseAuto = 300;
		int speseVacanze = 1000;
		int speseCasa = 1500;
		
		int sommaTot = (int) (speseGenerali + speseAuto + speseVacanze + speseCasa);
		System.out.println(sommaTot);
		
		int media1 = (int) (sommaTot) / 4;
		System.out.println(media1);
		
		int trimesTre = (int) (media1) * 3;
		System.out.println(trimesTre);
		
		
		
	}

}

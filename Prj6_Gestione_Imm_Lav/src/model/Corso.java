package model;

public class Corso {

	private String titolo;
	private String codice;
	private int numPartecipanti;
	
	public Corso(String titolo, String codice, int numPartecipanti) {
		this.titolo = titolo;
		this.codice = codice;
		this.numPartecipanti = numPartecipanti;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getCodice() {
		return codice;
	}

	public int getNumPartecipanti() {
		return numPartecipanti;
	}

	@Override
	public String toString() {
		return codice + "," + titolo + "," + numPartecipanti;
	}
	public static Corso daCSV(String riga) {
		String[] dato = riga.split(",");
		return new Corso(dato[1], dato[0], Integer.parseInt(dato[2]));
	}

	
	
	
	
	
}

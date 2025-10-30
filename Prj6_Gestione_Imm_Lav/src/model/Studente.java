package model;

public class Studente {
	private String nome;
	private String cognome;
	private String codFisc;
	private String corsoIscritto;
	
	public Studente(String nome, String cognome, String codFisc, String corsoIscritto) {
		this.nome = nome;
		this.cognome = cognome;
		this.codFisc = codFisc;
		this.corsoIscritto = corsoIscritto;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCodFisc() {
		return codFisc;
	}

	public String getCorsoIscritto() {
		return corsoIscritto;
	}

	@Override
	public String toString() {
		return nome + "," + cognome + "," + codFisc + "," + corsoIscritto;
	}
	public static Studente daCSV(String riga) {
		String[] dato =riga.split(",");
		return new Studente(dato[1], dato[2], dato[0], dato[3]);
	}
	
	

}

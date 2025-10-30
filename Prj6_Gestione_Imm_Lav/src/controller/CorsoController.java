package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




import model.Corso;

public class CorsoController {

	private static final String PATH_FILE = "CorsiDB.csv";
	
	public void aggiungiCorso(Corso corso) {
		try {
			FileWriter file = new FileWriter(PATH_FILE, true);
			file.write(corso.toString() + "\n");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Errore");
		}
	}
	public List<Corso> vediTuttiCorsi(){
		List<Corso> corsi = new ArrayList<>();
			try {
				File file = new File(PATH_FILE);
				if(!file.exists()) return corsi;
				
				Scanner scan = new Scanner(file);
				while (scan.hasNextLine()) {
					String riga = scan.nextLine();
					if(!riga.trim().isEmpty()) {
						corsi.add(Corso.daCSV(riga));
					}
				}
				scan.close();	
			} catch (IOException e) {
				System.out.println("Errore");
			}
			return corsi;
	}	
}
			

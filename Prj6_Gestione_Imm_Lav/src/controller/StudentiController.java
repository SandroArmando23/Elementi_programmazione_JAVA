package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Corso;
import model.Studente;

public class StudentiController {

	private static final String PATH_FILE = "CorsiDB.csv";
	
	public void aggiungiStudente(Studente studente) {
        try {
            FileWriter file = new FileWriter(PATH_FILE, true);
            file.write(studente.toString() + "\n");
            file.close();
        } catch (Exception e) {
            System.out.println("Errore: non riesco a salvare lo studente.");
        }
    }
		
	public List<Studente> ottieniTuttiStudenti() {
        List<Studente> studenti = new ArrayList<>();
        try {
            File file = new File(PATH_FILE);
            if (!file.exists()) return studenti;

            Scanner lettore = new Scanner(file);
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (!riga.trim().isEmpty()) {
                    studenti.add(Studente.daCSV(riga));
                }
            }
            lettore.close();
        } catch (Exception e) {
            System.out.println("Errore lettura studenti.");
        }
        return studenti;
    }

    public List<String> ottieniCodiciCorsiDisponibili() {
        List<String> codici = new ArrayList<>();
        try {
        	CorsoController ctrl = new CorsoController ();
            List<Corso> corsi = ctrl.vediTuttiCorsi();
            for (Corso c : corsi) {
                codici.add(c.getCodice());
            }
        } catch (Exception e) {
            
        }
        return codici;
    }
		}
	
	
	
	


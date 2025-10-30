# Gestione Immaginazione e Lavoro
Crea un programma per gestire l'inserimento di aule, studenti e corsi
Hai a disposizioone due file DB: CorsiDB.csv e StudentiDB.csv
Prepara una maschera di inserimento(menu a console) dove l'utente puo scegliere se inserire un nuuovo corso oppure un nuovo studente.
Deve poter anche scegliere se mostrare tutti i corsi  oppure tutti gli studenti, scegliere di inserire un nuovo corso o un nuovo studente.

Struttura dei Model:
- Corso (titolo, codice, numPartecipanti)
- Studente(nome,cognome, cod.fisc, corsoIscritto)

Struttura dei controller (ogni ctrl deve scrivere separatamente nel DB di destinazione)
-CorsoController
-StudentiController
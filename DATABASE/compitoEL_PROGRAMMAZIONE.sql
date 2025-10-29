/* 
Per eseguire il compito:
Accedete come root per creare il database e concedere i privilegi all’utente app_el@localhost (punto 1).
Accedete come app_el@localhost per svolgere tutti gli esercizi a partire dal punto 2.

1)
Crea il database: `verifica`
Concedi i privilegi di accesso al database all'utente `app_el@localhost`
*/
-- scrivi SQL di seguito
select user , host from mysql.user;
grant all on app_ep.* to "app_ep"@"localhost";
create database verifica ;
grant all on verifica.* to "app_ep"@"localhost";


/* 
2) 
Accedi come utente `app_el@localhost`
Ricordati di prendere possesso del database `verifica` per creare la tabella indicata di seguito

Crea la tabella `studenti` con i seguenti attributi:
`id`: Tipo intero, chiave primaria, valore auto-incrementato,
`nome`: Stringa, massimo 40 caratteri,
`cognome`: Stringa, massimo 50 caratteri, obbligatorio
`data_nascita`: Data anno mese e giorno,
`genere`: Può assumere solo i valori: 'f', 'm', 'nb',
`email`: Stringa, massimo 100 caratteri, UNIQUE e obbligatorio,
`indirizzo`: Stringa, massimo 100 caratteri,
`citta`: Stringa, massimo 50 caratteri,
`provincia`: Stringa di esattamente 2 caratteri,
`regione`: Stringa, massimo 30 caratteri

*/
-- scrivi SQL di seguito
use verifica;
create table studenti (
id int auto_increment,
first_name varchar(40),
last_name varchar(50) not null,
data_nascita date,
genere enum('m','f','nb'),
email varchar(100) unique,
indirizzo varchar(100),
citta varchar(50),
provincia char(2),
regione varchar(30),
primary key(id)
);

show tables;
desc studenti;




/* 
3)
Modifica la tabella `studenti`, aggiungi un attributo `attivo` di tipo intero;
considera che verranno inseriti i seguenti valori: 0 per gli studenti non più attivi e 1 per gli studenti attivi:
Solo valori positivi, obbligatorio, valore di default 1
*/
-- scrivi SQL di seguito
alter table studenti
add column attivo int unsigned default(1);





/* 
4)
Inserisci i record seguenti nella tabella `studenti`
Mauro, Alvise, 23/09/2004, m, mavise@icloud.com, Corso Mortara 23, Moncalieri, TO, Piemonte, 1
Giulia, Vento, 08/02/2006, f, gvento@gmail.com, Via Avellino 4, Chivasso, TO, Piemonte, 1
Franca, Valeri, 12/12/2000, f, francav@gmail.com, Via delle Primule 89, Rho, MI, Lombardia, 0
*/
-- scrivi SQL di seguito
insert into studenti (first_name, last_name, data_nascita, genere, email, indirizzo, citta, provincia, regione, attivo)
values 
('Mauro', 'Alvise', '2004-09-23', 'm', 'mavise@icloud.com', 'Corso Mortara 23', 'Moncalieri', 'TO', 'Piemonte', 1),
('Giulia', 'Vento', '2006-02-08', 'f', 'gvento@gmail.com', 'Via Avellino 4', 'Chivasso', 'TO', 'Piemonte', 1),
('Franca', 'Valeri', '2000-12-12', 'f', 'francav@gmail.com', 'Via delle Primule 89', 'Rho', 'MI', 'Lombardia', 0);
/* 
5)
Modifica (aggiorna) il record relativo a "Gliulia Vento". Aggiorna l'indirizzo. Questi i nuovi dati:
giulia.vento@comune.it, Corso Francia 19, Collegno
Ricordati di usare l'id per intercettare in modo preciso il record da mdificare
*/
-- scrivi SQL di seguito
select * from studenti;
update studenti 
set email = 'giulia.vento@comune.it', indirizzo = ' Corso Francia 19', citta = 'Collegno'
where id = 2;
/*
6)
Elimina dalla tabella `studenti` gli studenti il cui stato attivo è uguale a 0;
*/
-- scrivi SQL di seguito
delete from studenti where attivo = 0;
/* 
Per le query seguenti far riferimento al database `corsi` creato durante le lezioni
Ricordati di prendere possesso del database `corsi`
7)
Selezionate `nome`, `cognome`, `email` e `data_nascita` degli studenti nati prima della data 1990-01-01 (esclusa)
e ordinate per `data_nascita` in senso discendente (dalla data più recente a quella più remota)
*/
-- scrivi SQL di seguito
use corsi;
select nome, cognome, email, data_nascita
from studenti
where data_nascita < '1990-01-01'
order by data_nascita desc;
/*
8)
Calcola il prezzo medio che gli studenti hanno pagato per l'iscrizione ai corsi.
Arrotonda a 2 cifre decimali il prezzo medio da calcolare, la colonna restituita sarà `Prezzo medio iscrizioni` (usate gli alias).
*/
-- scrivi SQL di seguito
select round(avg(prezzo), 2) AS `prezzo medio iscrizioni`
from iscrizioni;
/*
9)
Selezionate i corsi e il numero degli studenti iscritti (dovete effettuare un conteggio).
Ordina per le quantità degli iscritti in modo discendente.
Le colonne del result set saranno:
`Corso`, `Iscritti`
Usate gli alias, le funzioni di aggregazione e il GROUP BY.
Ricordatevi che dovete considerare anche i corsi che NON hanno iscritti
*/
-- scrivi SQL di seguito
select * from iscrizioni;
select
titolo `Corso`,
count(studente_id) `Iscritti`
from corsi c
left join iscrizioni i on c.id = i.corso_id
group by c.id
order by `Iscritti` desc;
 
/*
10)
Selezionate `nome`, `cognome`, `email` degli studenti iscritti al corso di java e ordinateli per `cognome` e `nome`
*/
-- scrivi SQL di seguito
select nome, cognome, email
from studenti
join iscrizioni
on studenti.id = studente_id
join corsi
on corsi.id = corso_id
where titolo = "Java"
order by cognome, nome;
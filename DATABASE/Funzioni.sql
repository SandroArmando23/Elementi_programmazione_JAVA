-- funzioni
-- funzioni di aggregazione
-- avg(), media
-- count(), conteggio
select * from corsi;
select avg(prezzo) `prezzo medio` from corsi; -- backtick per inserire alias prezzo medio

select count(*) from studenti; -- con star riguarda tutti i record
select count(cognome) from studenti;
select * from corsi;
select count(*) from corsi;
select count(docente_id) from corsi; -- qui le righe della colonna dove si trova null non vengono contate
select count(cognome) from studenti;

select * from studenti order by cognome;
select count(distinct cognome) from studenti; -- qui i cognomi ripetuti vengono contati solo una volta
select count(*) from studenti where genere = 'f';

-- Max() e Min()
select max(prezzo) from corsi;
select min(prezzo) from corsi;

-- Somma sum()
select sum(prezzo) from iscrizioni;

-- funzioni matematiche
-- round() arrotondamento
select round(prezzo) from corsi;
select round(avg(prezzo),2) from iscrizioni; -- round accetta due argomenti. il secono argomento sono le cifre decimali che vogliamo visualizzare 
-- floor(), ceiling()
-- intero + alto, intero piu basso
select 
floor (round(avg(prezzo),2))`intero basso`,
ceiling (round(avg(prezzo),2))`intero alto`, 
round(avg(prezzo),2) `arrotondamento matematico`
from iscrizioni;
-- funzioni sulle stringhe
-- concat()
select concat(nome,' ', cognome) from studenti; -- separa nome e cognome con uno spazio
select concat(nome,' ', cognome, ' ',email) from studenti;
select concat_ws(' ',nome,cognome,email) from studenti; -- ws accetta come primo prametro il separatore

-- replace()
-- accetta 3 argomenti: la colonna su cui vado a sost, il valore da trovare, il val da sostituire  
select * from studenti;
select email, replace(email,'@example.com','@gmail.com') from studenti;
select * from studenti where indirizzo like 'corso%';
select indirizzo, replace(indirizzo,'corso','viale') from studenti; -- replace() è case sensitive infatti qui non modifica ler righe dove corso è scritto Corso

-- funzioni data e ora
select now();-- data e ora
select curdate();-- solo data
select curtime(); -- solo ora
select cognome, nome, data_nascita, year(data_nascita) from studenti;-- year estrae solo l'anno
select cognome, nome, data_nascita, day(data_nascita) from studenti; -- giorno 
select cognome, nome, data_nascita, monthname(data_nascita) from studenti; -- mese
select cognome, nome, data_nascita, dayname(data_nascita) from studenti;

select dayname('1992-03-07');
select dayname(curdate()); -- che giorno è oggi
-- date_format()
select data_nascita, date_format(data_nascita,'%d-%m-%Y') from studenti; -- cambia visualizzazione del formato data nascita 
select data_nascita, date_format(data_nascita,'%D-%M-%y') from studenti; -- esegui e vedi cosa cambia 
-- timestampdiff() puo calcolare l'eta a partire dalla data di nascita memorizzata in tabella
select
 cognome,
 nome,
 data_nascita,
timestampdiff(year,data_nascita,curdate()) `età`
from studenti
order by `età`;

select 
	genere, 
	floor(avg(timestampdiff(year,data_nascita,curdate()))) `età media`
from studenti
where genere = 'f';

-- rand()
select rand(); -- numero casuale tra 0 e 1 compreso



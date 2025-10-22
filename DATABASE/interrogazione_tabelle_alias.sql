-- interrogazione di piu tabelle, vecchia sintassi
select * from corsi;
select * from docenti;

select titolo, nome, cognome, prezzo
from corsi, docenti
where docente_id = docenti.id
and prezzo >= 150.00;
-- and titolo = 'java';

select nome, cognome, titolo
from corsi, studenti, iscrizioni
where corsi.id = corso_id
and studenti.id = studente_id
order by titolo, cognome, nome;


select studenti.nome, studenti.cognome, titolo, docenti.nome, docenti.cognome
from corsi, studenti, iscrizioni, docenti
where corsi.id = corso_id
and studenti.id = studente_id
and docenti.id = docente_id
order by titolo, studenti.cognome, studenti.nome;

-- ALIAS
select
s.nome AS `Nome Studente`,
s.cognome `Cognome Studente`,
titolo `Corso`,
d.nome `Nome Docente`, 
d.cognome`Cognome Docente`
from corsi AS c, studenti s, iscrizioni i, docenti d -- do un nome temporaneo alle tabelle
where c.id = corso_id
and s.id = studente_id
and d.id = docente_id
order by titolo, s.cognome, s.nome;
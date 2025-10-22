-- scenario 1
-- valuto il corso in piu fasi
-- mi serve una tabella valutazione

create table valutazioni(
id int auto_increment primary key,
iscrizione_id int,
fase_prova enum('fase 1', 'fase 2','fase 3'),
punteggio decimal(5,2) check(punteggio <= 100),
data_valutazione date
);

-- scenario 2
-- valuto corso una sola volta
-- aggiungere colonna punteggio alla tabella iscrizioni
alter table iscrizioni 
add punteggio decimal(6,2) check(punteggio <= 100)
after corso_id,
add data_val date after punteggio;
desc iscrizioni;
select * from iscrizioni;

-- inseriamo valori fake nelle nuove colonne
select round((60 + rand() * 40),1); -- cosi ho solo valori fra 60 e 100
use corsi;
update iscrizioni set punteggio = round((60 + rand() * 40),1);

select * from iscrizioni;



-- elenco studenti corso punteggio
select nome, cognome, titolo, punteggio
from studenti
join iscrizioni
on studenti.id = studente_id
join corsi on corsi.id = corso_id
order by titolo;

-- punteggio medio dei corsi
select titolo, round(avg(punteggio),2)
from corsi
join iscrizioni
on corsi.id = iscrizioni.corso_id
group by titolo
order by titolo;

-- punteggio medio studenti
select nome, cognome, round(avg(punteggio),2) `punteggio medio`,
count(corso_id) `quanti`,
max(punteggio),
min(punteggio)
from studenti
join iscrizioni
on studenti.id = iscrizioni.studente_id
group by cognome, nome
order by `quanti` desc;

-- aggiungiamo una colonna riportante i corsi frequentati
select nome, cognome, round(avg(punteggio),2) `punteggio medio`,
count(corso_id) `quanti`,
group_concat(' ',titolo) `corsi`,  -- insieme alle funz di aggreg. è in grado di elencare gli elementi che costituiscono il group
group_concat(' ',punteggio) `punteggi singoli`,
max(punteggio),
min(punteggio)
from studenti
join iscrizioni
on studenti.id = iscrizioni.studente_id
join corsi
on corsi.id = iscrizioni.corso_id
where provincia = 'to'
group by cognome, nome
having `quanti` > 1  
order by `quanti` desc
limit 3;

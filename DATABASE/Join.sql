-- interrogare piu cartelle, sintassi JOIN
-- EQUI JOIN
-- INNER JOIN
select titolo, nome,cognome
from docenti -- tabella di sinistra
inner join corsi  -- inner è opzionale, corsi in questo caso è tabella di destra 
on docenti.id = docente_id;


-- outer join 
-- LEFT, anche gli esclusi della tabella di sinistra
select titolo, nome,cognome
from docenti -- tabella di sinistra
left join corsi  -- inner è opzionale, corsi in questo caso è tabella di destra 
on docenti.id = docente_id order by cognome;
-- RIGHT, anche gli esclusi della tabella di destra
select titolo, nome,cognome
from docenti -- tabella di sinistra
right join corsi  -- inner è opzionale, corsi in questo caso è tabella di destra 
on docenti.id = docente_id order by titolo;
-- solo gli esclusi left
select nome,cognome
from docenti 
left join corsi  
on docenti.id = docente_id 
where corsi.id is null
order by cognome;
-- solo esclusi right
select titolo
from docenti 
right join corsi 
on docenti.id = docente_id 
where docenti.id is null
order by titolo;
use ep_2025;
-- FULL OUTER JOIN
use corsi;
select titolo, nome,cognome
from docenti
left join corsi  
on docenti.id = docente_id 
union
select titolo, nome,cognome
from docenti 
right join corsi 
on docenti.id = docente_id
order by titolo;
-- solo gli esclusi
select titolo
from docenti 
left join corsi  
on docenti.id = docente_id 
where corsi.id is null
union
select titolo
from docenti 
right join corsi 
on docenti.id = docente_id 
where docenti.id is null
order by titolo;
-- CROSS JOIN
select articolo, colore
from products
cross join colori; -- combina le righe di una tabella con le righe di un altra
use ep_2025;

create table articolo(id int auto_increment primary key,
descrizione varchar(255)
);

create table colori(
id int auto_increment primary key,
colore varchar (20)
);
insert into articolo(descrizione)
values ('Camicia'),('Pantaloni'),('Giacca');
insert into colori(colore)
values ('Giallo'),('Rosso'),('Verde'), ('Blu');

select descrizione, colore
from articolo
cross join colori;

-- UNION
select state, capital_id, population
from africa
union
select state, capital_id, population -- el_app? forse pezzo di lezione mancante lui prende dati da esercizio dml svolto 
from america
union
select state, capital_id, population
from asia;


select first_name, last_name 
from clienti
union all  -- con all non elimina le ripetizioni
select first_name, last_name 
from studenti
order by last_name;
select * from customers;


-- JOIN con 3 tabelle
use corsi;
select nome, cognome, titolo
from corsi c 
join iscrizioni i on c.id = i.corso_id -- questa e la riga sopra insieme formano tabella di sinistra
right join studenti s on s.id = i.studente_id; -- aggiungo right e ottengo anche gli studenti non iscritti

select nome, cognome, titolo
from corsi c
left join iscrizioni i on c.id = i.corso_id
left join studenti s on s.id = i.studente_id; -- elenco di studenti iscritti ed elenco corsi senza iscritti ma va messo left su entrambe
-- volendo bastava inverire tabella di sx e di dx
select nome, cognome, titolo
from iscrizioni i
join corsi c on c.id = i.corso_id
right join studenti s on s.id = i.studente_id;

select * from corsi;
-- USO del JOIN in UPDATE
select titolo
from corsi c
left join iscrizioni i on c.id = i.corso_id
where i.corso_id is null; 

update corsi c  -- aggiungere sconto 10% su corsi senza iscritti
left join iscrizioni i on c.id = i.corso_id
set c.prezzo = c.prezzo * .9 -- ambiguità prezzo quindi specifico c.prezzo
where i.corso_id is null;
select * from corsi;

-- Self Join
use ep_2025;

create table impiegati(
id int auto_increment primary key,
nome varchar(30),
cognome varchar(50),
ruolo varchar(20),
id_respo int, -- per ogni impiegato identifico id del suo responsabile
stipendio decimal(6,2)
);

INSERT INTO `impiegati`
VALUES (1,'Mario','Rossi','tecnico',NULL,2500.00),
(2,'Elena','Totti','amministrativo',NULL,2600.00),
(3,'Paola','Capra','venditore',NULL,2300.00),
(4,'Marco','Bianchi','amministrativo',2,1600.00),
(5,'Paolo','Verdi','amministrativo',2,1600.00),
(6,'Enrico','Marrone','venditore',3,1300.00),
(7,'Nicola','Testa','venditore',3,1300.00),
(8,'Franco','Barba','tecnico',1,1500.00),
(9,'Mauro','Barba','venditore',3,1300.00);

select * from impiegati;
select i.nome, i.cognome, i.ruolo, r.cognome
from impiegati i
left join impiegati r
on i.id_respo = r.id;

-- NON EQUI JOIN possono avere altri operatori di confronto diversi dall'=
create table studentig like corsi.studenti;
insert into studentig select * from corsi.studenti;
select * from studentig;

create table generazioni(
id int auto_increment primary key,
generazione varchar(20),
data_inizio date,
data_fine date
);
insert into generazioni(generazione,data_inizio,data_fine)
values('Boomers','1946-01-01','1964-12-31'),
('X','1965-01-01','1980-12-31'),
('Millenials','1981-01-01','1996-12-31'),
('Z','1997-01-01','2012-12-31');
select * from generazioni;
delete from generazioni where id >= 5;
-- non equi
select nome, cognome, data_nascita, generazione
from studentig
join generazioni
on data_nascita between data_inizio and data_fine
order by data_nascita;
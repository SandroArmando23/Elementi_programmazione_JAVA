-- subquery
select avg(prezzo) from corsi; -- 187.00
select titolo, prezzo from corsi 
where prezzo >= 187.00
order by titolo;

-- subquery indipendente
select titolo, prezzo from corsi 
where prezzo >= (select avg(prezzo) from corsi )
order by titolo;

select max(prezzo) from corsi; -- 250.00

select titolo, prezzo from corsi 
where prezzo = (select max(prezzo) from corsi); -- tutti i corsi con prezzo max


select nome, cognome, data_isc
from studenti s
join iscrizioni i
on s.id = studente_id
where data_isc = (select max(data_isc) from iscrizioni);

-- subquery che restituisce piu righe 

select titolo, count(corso_id) quanti
from corsi c
join iscrizioni i
on c.id = i.corso_id
group by c.id
having quanti >= ALL (select count(studente_id)
from iscrizioni
group by corso_id);

select count(studente_id)
from iscrizioni
group by corso_id;

-- es. con join 
select distinct nome, cognome, email
from docenti d
join corsi c
on d.id = c.docente_id;

-- fatta invece con subquery
select nome, cognome, email
from docenti
where id in (select docente_id from corsi);

select nome, cognome, email
from docenti
where id not in (select docente_id from corsi); -- non va perche in unas delle tabelle c'è un null

select nome, cognome, email
from docenti d
left join corsi c
on d.id = c.docente_id
where c.id is null;   -- otteniamo docenti che non hanno corsi

-- subquery correlata, EXISTS
select nome, cognome, email
from docenti d         -- estrae docenti che hanno corsi
where exists (select 1 from corsi c where c.docente_id = d.id);
-- la subquery non va da sola per questo si dice correlata
-- exsists piu efficace di in perche valuta l'esistenza della riga

select nome, cognome, email
from docenti d      
where not exists (select 1 from corsi c where c.docente_id = d.id);
-- docenti senza corsi


select cognome, nome, email, timestampdiff(year, data_nascita, curdate()) eta
from studenti;

-- estrae studenti piu giovani
select * from (
	select cognome, nome, email, timestampdiff(year, data_nascita, curdate()) eta
	from studenti
) as tbl -- assegno nome a tabella derivata
where tbl.eta < 30;

select * from (
	select cognome, nome, email, provincia, timestampdiff(year, data_nascita, curdate()) eta
	from studenti where timestampdiff(year, data_nascita, curdate()) <= 30
) as tbl -- assegno nome a tabella derivata
where tbl.provincia = 'to';

-- ROW() restituisce piu colonne
create table amici(
id int auto_increment primary key,
nome varchar(30),
cognome varchar(50)
);

insert into amici(nome, cognome)
select nome, cognome
from studenti
where id < 10;

select * from amici;

select * from amici 
where row(nome, cognome) = (select nome, cognome from studenti where id = 8);
-- VIEW
-- è una tabella logica e non fisica

create view studenti_contatto as
select id, nome, cognome, email 
from studenti;

show tables;
select table_name, table_type
from information_schema.tables
where table_schema = 'corsi';

rename table studenti_contatto to vw_studenti_contatto;

select nome, cognome, email 
from vw_studenti_contatto
where id = 42;

select nome, cognome, email 
from (select id, nome, cognome, email 
from studenti
) as tbl
where id = 42;


create view iscritti as 
select 
	nome, 
    cognome,
    email,
    titolo as `corso`,
    i.prezzo as `prezzo pagato`,
    data_isc as `data iscrizione`
from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on c.id = i.corso_id;

rename table iscritti to vw_iscritti;
show tables;

select * from vw_iscritti;

select corso, count(*)
from vw_iscritti
where corso = 'Java';

select nome, cognome, email
from vw_iscritti
where corso = 'Java'
order by cognome, nome;

select corso, count(*) quanti
from vw_iscritti
group by corso
order by quanti desc;


create view vw_info_totali as

select concat( s.nome, s.cognome) `Studente`, 
s.email `contatto studente`, 
titolo`corso`, 
concat(d.nome,' ', d.cognome) `Docente`
from studenti s
join iscrizioni i
on s.id = studente_id
join corsi c on c.id = corso_id
join docenti d on d.id = docente_id;


show tables;

select * from vw_info_totali where corso = 'Java';


drop view vw_info_totali;

alter view vw_iscritti as
select 
	nome, 
    cognome,
    email,
    genere,
    indirizzo,
    citta,
    provincia,
    regione,
    titolo as `corso`,
    i.prezzo as `prezzo pagato`,
    data_isc as `data iscrizione`
from studenti s
join iscrizioni i
on s.id = i.studente_id
join corsi c
on c.id = i.corso_id;

select nome, 
    cognome,
    email,
    genere,
    indirizzo,
    citta,
    provincia,
    regione,
    `corso`,
    `prezzo pagato`,
    `data iscrizione`
from vw_iscritti
where provincia = 'to';
-- where genere = 'f'
-- group by genere;

rename table studenti to students;
alter table students rename column genere to gender;

show create view vw_studenti_contatto;

alter view vw_iscritti as
select 
	nome, 
    cognome,
    email,
    gender `genere`,
    indirizzo,
    citta,
    provincia,
    regione,
    titolo as `corso`,
    i.prezzo as `prezzo pagato`,
    data_isc as `data iscrizione`
from students `studenti`
join iscrizioni i
on studenti.id = i.studente_id
join corsi c
on c.id = i.corso_id;


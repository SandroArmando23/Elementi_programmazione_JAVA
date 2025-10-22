-- raggruppamenti
select * from studenti;
-- group by
select genere, count(*)
from studenti
group by genere;
-- distinct
select distinct cognome from studenti order by cognome; -- cognomi senza ripetizioni
select distinct cognome, nome from studenti order by cognome; -- un record viene eliminato a causa dell'omonimia
select distinct cognome
from studenti 
where cognome like 'v%'
order by cognome;
select cognome
from studenti group by cognome;


select cognome, nome, count(*) `quanti corsi tiene`
from docenti d
join corsi c
on d.id = docente_id
group by d.id
order by `quanti corsi tiene` desc;

select 
	genere, 
	floor(avg(timestampdiff(year,data_nascita,curdate()))) `età media`
from studenti
group by genere;
-- es media dei prezzi pagati per i corsi frequentati e prezzo min/max
select 
	cognome,
    nome,
    sum(prezzo) `totale speso`,
    round(avg(prezzo),2) `spesa media`,
    max(prezzo) `prezzo massimo`,
    min(prezzo) `prezzo minimo`,
    count(*) `quanti corsi`
    from studenti s
    join iscrizioni i
    on s.id = i.studente_id
    where cognome like 'v%'
    group by s.id
    having `quanti corsi` > 1         -- va sempre dopo group by e aggiunge condizione
    order by `quanti corsi` desc
    limit 3;   -- mostra solo i primi 3 risultati
    
    select provincia, cognome, count(*) `quanti`
    from studenti
    group by provincia, cognome
    order by provincia,`quanti` desc;
    
    select provincia, genere, count(*) `quanti`
    from studenti
    where provincia != 'to' -- effettua filtraggio pre raggruppamento
    group by provincia, genere
    having `quanti` > 1 -- filtraggio post raggruppamento
    order by provincia, `quanti` desc;
    
    select 
    provincia, 
    genere, 
    floor(avg(timestampdiff(year,data_nascita,curdate()))) `età media`
	from studenti
	group by provincia, genere
    order by provincia, genere;
    
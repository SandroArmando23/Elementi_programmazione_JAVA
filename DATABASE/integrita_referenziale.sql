-- integrità referenziale
use corsi;
show create table corsi;
select * from corsi;
select * from docenti;
-- aggiungiamo la FK a corsi  fk= foreign key
-- RESTRICT, blocco le operazioni
alter table corsi
add 
constraint fk_corsi_docenti -- diamo nome parlante per capire meglio altrimenti ne imposta uno mysql
foreign key(docente_id) references docenti(id)
on delete restrict on update cascade; -- se cancello chiave della tabella padre blocca l'operazione, se aggiorno, cascata

delete from docenti where id = 1;  -- mi restituisce errore per via della restrict impostata prima 
insert into corsi(titolo, prezzo,docente_id)
values ('Prompt AI', 300.00, 100);  -- mi blocca perche non c'è corrispondenza perche l'id 100 nella tabella non esiste
show create table corsi;
alter table corsi drop constraint fk_corsi_docenti; -- eliminiamo la fk per modificarla

-- CASCADE elimino a cascata

alter table corsi
add 
constraint fk_corsi_docenti 
foreign key(docente_id) references docenti(id)
on delete cascade on update cascade;
select * from corsi;
delete from docenti where id = 1;

-- SET NULL, imposto a null la chiave esterna
alter table corsi
add 
constraint fk_corsi_docenti
foreign key(docente_id) references docenti(id)
on delete SET NULL on update cascade;

delete from docenti where id = 5;
select * from docenti;
select * from corsi;

drop table corsi, docenti, studenti, iscrizioni;
select * from docenti;  -- da qui in poi abbiamo reinserito i dati modificati con l'aggiunta dei constraint

select * from corsi;
delete from docenti where id = 7; -- mette null

select * from iscrizioni;
delete from corsi where id = 1; -- mi blocca

delete from studenti where id = 1; -- cancella lo studente ma lascia null per non perdere altri dati per esempio quanto ha pagato in passato

SELECT TABLE_NAME, COLUMN_NAME, CONSTRAINT_NAME, REFERENCED_TABLE_NAME, REFERENCED_COLUMN_NAME
FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_SCHEMA = 'corsi'
/* AND TABLE_NAME = 'nome_tabella' */
AND referenced_column_name IS NOT NULL;

-- volendo si può disattivare temporaneamente le constraints
/*
set foreign check = 0; spento
set foreign check = 1; reintegra i check
*/



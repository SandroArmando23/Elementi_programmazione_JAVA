-- Istruzioni DML
-- Create
desc studenti;
INSERT INTO studenti(first_name, last_name,age, email, phone, codice_fiscale, data_nascita, address)
VALUES('francesco','canepa',33,'francesco.canepa@gmail.com','3546276843','CNPFNC99D00D969I','1992-03-07','via ciao ciao 2');
-- select
SELECT * FROM studenti;  -- select star per visualizzare
  INSERT INTO studenti(first_name, last_name,age, email, phone, codice_fiscale, data_nascita, address) -- inserimento dati
VALUES
('mario','rossi',36,'mario.rossi@gmail.com','3446276843','MRRRSS99D00D969I','1990-03-07','via co ciao 2'),
('paola','verdi',38,'paola.verdi@gmail.com','3546276849','pllvrd99D00D969I','1987-05-09','via zio x 29'),
('paola','rossi',39,'paola.rossi@gmail.com','3546276878','pllrss99D00D969I','1987-05-10','via ziogg 29');
insert into studenti(last_name,email)values('verdi','verdi@gmail.com'); -- inserimento piu dati insieme
insert into studenti(last_name)values('oliva'); --

-- update
update studenti set age = 22 where id = 4;
update studenti
set first_name = 'marco', age = 43, data_nascita = '1995-01-01' where id = 5;

update studenti
set age = 31; -- cambio eta di tutti
use ep_2025;  -- per recuperare database dopo riavvio programma

update studenti set age = 20 where last_name = 'rossi'; -- cambio eta per tutti i cognomi rossi
-- delete
delete from studenti where id = 4;  -- cancella specifico id
delete from studenti where age = 20; -- cancella quelli con eta = 20

delete from studenti;  -- cancella l'intera tabella ma gli id ripartono dal primo disponibile che non e stato ancora usato
-- DDL
truncate studenti;      -- non manipola il dato ma cancella la definixione della tabella e lo ricrea resettando gli id    
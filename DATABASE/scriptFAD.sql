show tables;
use ep_2025;
create table students (
id int auto_increment,
first_name varchar(30),
last_name varchar(50) not null,
age tinyint unsigned,
code_f char(16),
birth_date date,
primary key(id)
);
desc students;						# da premere ogni volta per visualizzare risultato modifiche
show create table students;
drop table students;
show create table students;
show tables;

alter table students                 #modifca seguendo le istruzioni riportate sotto
add address varchar(100);			#aggiunta di un campo indicando nome e tipo

alter table students
modify first_name varchar(50);      #modifica del nome e tipo di un campo

alter table students
rename column code_f to codice_fiscale; # rinomina

alter table students
change birth_date data_nascita datetime; # cambio tipo di dato e nome campo

alter table students
add email varchar(100) unique after age, #aggiunge campo email dopo il campo age e il dato inserito non puo essere ripetuto due volte
add phone varchar(20)after email; #seconda aggiunta in contemporanea divisa dalla prima con una virgola e depo campo email

alter table students
rename studenti;       #rinomina 
show tables;
rename table studenti to students; #alternativa


alter table corsi
add constraint fk_corsi_docenti
foreign key(docente_id) references docenti(id)
on delete restrict on update cascade;

alter table iscrizioni
-- add constraint fk_iscrizioni_corsi
-- foreign key(corso_id) references corsi(id)
-- on delete restrict on update cascade,
add constraint fk_iscrizioni_studenti
foreign key(studente_id) references studenti(id)
on delete restrict on update cascade;

alter table iscrizioni drop constraint fk_iscrizioni_studenti;
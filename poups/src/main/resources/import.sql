insert into Flag (name) values ('Visa');
insert into Flag (name) values ('Mastercard');
insert into Flag (name) values ('Elo');

insert into Card (name, flag_id, active) values ('visa',1,true);
insert into Card (name, flag_id, active) values ('master',2,true);
insert into Card (name, flag_id, active) values ('master mozi',2,false);
insert into Card (name, flag_id, active) values ('elo',3,true);
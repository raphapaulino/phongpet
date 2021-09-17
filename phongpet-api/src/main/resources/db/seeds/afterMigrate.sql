
set foreign_key_checks = 0;

delete from animals;

set foreign_key_checks = 1;


alter table animals auto_increment = 1;

insert into animals (name, photo, born_date) values ('Mil House', 'mil-house-photo.jpg', '2019-09-16');
insert into animals (name, photo, born_date) values ('Mia', 'mia-photo.jpg', '2021-02-15');
insert into animals (name, photo, born_date) values ('Maria', 'maria-photo.jpg', '2009-06-05');
create database AlbumFotos; 
use AlbumFotos;

create table album (
idalbum int,
nombre varchar (45),
cantmax int,
fechacreacion date,
constraint id_pk primary key (idalbum)
);

create table foto(
idfoto  int NOT NULL AUTO_INCREMENT,
idalbum int,
descripcion varchar (45),
nombrearchivo varchar (45),
tamaño int,
constraint id_foto primary key (idfoto),
constraint idalbun_fk foreign key (idalbum) references album(idalbum) 
);

insert into album values (1,' cumple abuela', 100, str_to_date('01/02/2010','%d/%m/%Y') );
insert into album values (2,' cumple ma', 120, str_to_date('20/06/2010','%d/%m/%Y' ));
insert into album values (3,' cumple pa', 50, str_to_date('01/04/2010','%d/%m/%Y'));
insert into album values (4, 'fiesta egresado', 300, str_to_date('02/12/2010','%d/%m/%Y'));

insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (1,'cumple abuela tete','tete',1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (1,null, 'niños', 800);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (1,null, 'hermanos', 1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (1,null, 'tios', 1280);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (1,null, 'todos juntos', 800);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (2,null,'niños',800);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (2,null,'todos juntos',1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (2,null,'hermanos',1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (2,null,'tios',1280);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (2,null,'padrinos',1280);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (3,null,'bisabuelos',640);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (3,null,'hijos', 1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (3,null,'amigos',640);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (3,null,'todos juntos',800);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (3,null,'asado',2160);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (4,null,'baile',1920);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (4,null,'comida',640);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (4,null,'entrada',1024);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (4,null,'chupi',800);
insert into foto (idalbum, descripcion, nombrearchivo, tamaño) values (4,null,'compañero',1680);
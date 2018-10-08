create database AlbunFotos; 
use AlbunFotos;

create table album (
idalbum int,
nombre varchar (45),
cantmax int,
fechacreacion date,
constraint id_pk primary key (idalbum)
);

create table foto(
idfoto int,
idalbum int,
descripcion varchar (45),
nombrearchivo varchar (45),
tamaño int,
constraint id_foto primary key (idfoto),
constraint idalbun_fk foreign key (idalbum) references album(idalbum) 
);
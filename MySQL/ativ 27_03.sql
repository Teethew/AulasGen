create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
    id bigint(2) auto_increment,
    tipo varchar(20) not null,
    multiplicadorDePreço int,
    primary key(id)
);

create table tb_produto(
    id bigInt(5) auto_increment,
    nome varchar(20) not null,
    tipoMedic bigint(2),
    preço varchar(20),
    composição varchar(20),
    quantidade bigint(6),
    primary key(id),
    foreign key(tipoMedic) references tb_categoria(id)
);

insert into tb_categoria (tipo,multiplicadorDePreço) values ("Manipulado",1.5);
insert into tb_categoria (tipo,multiplicadorDePreço) values ("Alopático",1.2);
insert into tb_categoria (tipo,multiplicadorDePreço) values ("Genérico",1);

insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Dipirona",2,"1.2", "Novalgina", 500);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Roacutan",1,"1.5","Isotretinoína",20);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Tylenol",3,"1","Paracetamol",500);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Dorflex",3,"1","Dipirona",300);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Neosaldina",2,"1.2","Dipirona",300);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Xarelto",1,"1.5","Rivaroxabana",20);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Selozok",2,"1.2","Metoprolol",23);
insert into tb_produto (nome, tipoMedic, preço, composição, quantidade) values ("Torsilax",1,"1.5","Cafeina",30);
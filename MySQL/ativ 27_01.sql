create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id_classe bigint(2) auto_increment,
    Classe varchar(20) not null,
    Arma varchar(20),
    NivelMinimo bigint(3),
    primary key(id_classe)
);

create table tb_personagem(
	id_char bigInt(5) auto_increment,
    Nome varchar(20),
    ATK bigInt(6),
    DEF bigInt(6),
    HP bigInt(6),
    id_classe bigInt(2),
    primary key(id_char),
    foreign key(id_classe) references tb_classe(id_classe)
);


insert into tb_classe (Classe,Arma,NivelMinimo) values ("Caçador","Arco",0);
insert into tb_classe (Classe,Arma,NivelMinimo) values ("Mago","Cajado",0);
insert into tb_classe (Classe,Arma,NivelMinimo) values ("Clérigo","Cetro",0);
insert into tb_classe (Classe,Arma,NivelMinimo) values ("Ladino","Adagas",0);
insert into tb_classe (Classe,Arma,NivelMinimo) values ("Guerreiro","Espada",0);

select * from tb_classe;


insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Artix",100,100,1000,5);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Helena",5000,3200,2200,4);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Lire",4000,3750,2600,1);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Arme",8800,6120,3800,2);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Holy",100,100,1000,3);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Lass",480,290,1300,4);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Lupus",21050,14500,9360,1);
insert into tb_personagem (Nome,ATK,DEF,HP,id_classe) values ("Elesis",38700,35150,20120,5);


select * from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe; 
    
-- Faça um select que retorne os funcionários com o poder de ataque maior do que 2000.
select * from tb_personagem where ATK > 2000;

-- Faça um select trazendo  os funcionários com poder de defesa entre 1000 e 2000.
select * from tb_personagem where DEF > 1000 and DEF < 2000;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
select * from tb_personagem where Nome like 'C%';

-- Faça um um select com Inner join entre  tabela classe e personagem.
select * from tb_personagem
	inner join tb_classe on tb_classe.id_classe = tb_personagem.id_classe;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
select * from tb_personagem 
	right join tb_classe on tb_classe.id_classe = tb_personagem.id_classe 
		where tb_classe.Classe like 'G%';
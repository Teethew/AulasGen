-- selecionando a database
use db_diversos;

-- criando tabela
create table tb_petshop(  
    id bigInt(5),     
    peso decimal(5,2),     
    nome varchar(40),     
    idade decimal(2,0),     
    especie varchar(20),
    dono varchar(40),
    primary key(id) 
);

-- esqueci de novo de colocar auto_increment rs
ALTER TABLE tb_petshop MODIFY COLUMN id bigInt auto_increment;

-- populando a tabela
insert into tb_petshop (peso,nome,idade,especie,dono) values (6,"Ana Carla", 6,"Macaco","Joel")
insert into tb_petshop (peso,nome,idade,especie,dono) values (2,"Joel", 9,"Tartaruga","Mariana");
insert into tb_petshop (peso,nome,idade,especie,dono) values (4,"Gabriel", 5,"Cachorro","Leila");
insert into tb_petshop (peso,nome,idade,especie,dono) values (4,"Meavy", 4,"Gato","Bárbara");
insert into tb_petshop (peso,nome,idade,especie,dono) values (5,"Tom", 3,"Gato","Bárbara");
insert into tb_petshop (peso,nome,idade,especie,dono) values (7,"Matheus", 8,"Cachorro","João");
insert into tb_petshop (peso,nome,idade,especie,dono) values (0.15,"Mariana", 1,"Aranha","Giovanna");
insert into tb_petshop (peso,nome,idade,especie,dono) values (5,"Tania", 11,"Cachorro","Bárbara");
insert into tb_petshop (peso,nome,idade,especie,dono) values (8,"Josias", 13,"Cachorro","João");
insert into tb_petshop (peso,nome,idade,especie,dono) values (4,"Bruno", 6,"Gato","Mariana");
insert into tb_petshop (peso,nome,idade,especie,dono) values (2,"Giovanna", 2,"Tartaruga","Manuel");
insert into tb_petshop (peso,nome,idade,especie,dono) values (4,"Daniela", 2,"Cobra","José");
insert into tb_petshop (peso,nome,idade,especie,dono) values (0.2,"Breno", 3,"Calopsita","Bruno");
insert into tb_petshop (peso,nome,idade,especie,dono) values (0.05,"João Pedro", 1,"Peixe","Xavier");
insert into tb_petshop (peso,nome,idade,especie,dono) values (0.2,"Maria Eduarda", 2,"Hamster","Joana");

-- selects
SELECT * from tb_petshop;

select * from tb_petshop where peso >= 10;
select * from tb_petshop where peso < 10;
select * from tb_petshop where idade >= 10 and idade <= 30; -- nao consegui pensar em mais nada pra colocar 

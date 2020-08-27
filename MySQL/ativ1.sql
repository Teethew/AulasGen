-- criando db_diversos
CREATE database db_diversos;

-- criando tabela tb_alunos
create table tb_alunos(  
    id bigInt(5),     
    nome varchar(40),     
    matricula boolean,     
    nota decimal(4,2),     
    serie decimal(2,0),     
    primary key(id) 
);

-- insert falha pois nao defini id como auto_increment
insert into tb_alunos (nome,matricula,nota,serie) values ("Ana Carla", true,6,5);

-- modificando o id para auto_increment
ALTER TABLE tb_alunos MODIFY COLUMN id bigInt auto_increment;

-- mostrando os dados da tabela
select * from tb_alunos;

-- populando a tabela com os valores
insert into tb_alunos (nome,matricula,nota,serie) values ("Ana Carla", true,6,5)
insert into tb_alunos (nome,matricula,nota,serie) values ("Joel", false,6.65,4);
insert into tb_alunos (nome,matricula,nota,serie) values ("Gabriel", true,5.44,8);
insert into tb_alunos (nome,matricula,nota,serie) values ("Lucas", true,7.2,7);
insert into tb_alunos (nome,matricula,nota,serie) values ("José", true,8,6);
insert into tb_alunos (nome,matricula,nota,serie) values ("Matheus", false,0,6);
insert into tb_alunos (nome,matricula,nota,serie) values ("Mariana", true,6,5);
insert into tb_alunos (nome,matricula,nota,serie) values ("Bárbara", true,7.8,2);
insert into tb_alunos (nome,matricula,nota,serie) values ("Josias", false,7,3);
insert into tb_alunos (nome,matricula,nota,serie) values ("Bruno", true,6.5,4);
insert into tb_alunos (nome,matricula,nota,serie) values ("Giovanna", true,5.5,7);
insert into tb_alunos (nome,matricula,nota,serie) values ("Daniela", true,9,8);
insert into tb_alunos (nome,matricula,nota,serie) values ("Breno", false,8,7);
insert into tb_alunos (nome,matricula,nota,serie) values ("João Pedro", true,10,6);
insert into tb_alunos (nome,matricula,nota,serie) values ("Maria Eduarda", true,4.5,5);

-- renomeando serie para idade pra dar certo no exercicio
ALTER TABLE tb_alunos rename COLUMN serie to idade;

-- usando os selects pedidos
select * from tb_alunos where idade >= 18;
select * from tb_alunos where idade < 18;
select * from tb_alunos where idade >= 20 and idade <= 25;


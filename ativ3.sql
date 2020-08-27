-- selecionando a database
use db_diversos;

-- criando tabela
create table tb_varejo(  
    id bigInt(5) auto_increment,  --agora lembrei   
    preço decimal(6,2),     
    categoria varchar(30),     
    nome varchar(40) not null,     
    peso bigInt(4),
    marca varchar(20),
    altura decimal(4,2),
    validade date
    primary key(id) 
);

-- peso como bigint nao estava dando muito certo
ALTER TABLE tb_varejo MODIFY COLUMN peso decimal(6,2);

-- alterando para quantidade
ALTER TABLE tb_varejo DROP COLUMN validade;

ALTER TABLE tb_varejo ADD COLUMN quantidade bigInt(6) not null;

-- populando a tabela
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (10.00,"Casa","Vassoura",1.5,"San Remo",1.5, 56);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (4.00,"Alimentícios","Garrafa de Água",1.5,"Bonafont",0.5, 20); 
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (21.5,"Higine","Fralda",5, "Pampers",0.4, 23);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (150,"Papelaria e Informática","Teclado Gamer",0.8, "Redragon",0.5, 12);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (10.39,"Casa","Lâmpada LED 50W",0.08, "Phillips", 0.12, 78);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (1200,"Instrumentos e Aúdio","Violão",4.7, "Fender",0.96, 1);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (15,"Casa","Piso Porcelanato",1.4, "Icasa",0.5, 10000);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (1100,"Papelaria e Informática","Roteador ´´N´´ Multi-núcleo 500Gbps ", 1.6, "TP-Link",0.25, 20);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (8.49,"Papelaria e Informática","Bloco de Sulfite A4", 5, "Chamex", 0.13, 69);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (20,"Casa","Toalha de Corpo", 0.40, "Karsten", 0.20, 45);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (6.19,"Higiene","Protetor Solar", 0.15, "Sundown", 0.2, 301);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (80,"Moda","Óculos Escuros", 0.04,"Detroit", 0.15, 20);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (2999.99,"Eletrodomésticos","TV 60´´ OLED",15.9, "Samsung",1.2, 20);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (200.00,"Eletrodomésticos","Antena Digital HD",0.31, "RCA", 0.1, 51);
insert into tb_varejo (preço,categoria,nome,peso,marca,altura,quantidade) values (89.99,"Papelaria e Informática","Fone de ouvido auricular",0.04, "Samsung", 0.15, 40);

-- selects
SELECT * from tb_varejo;

SELECT * FROM tb_varejo WHERE nome LIKE 'a%';

SELECT * FROM tb_varejo WHERE categoria="Papelaria e Informática";

SELECT * FROM tb_varejo WHERE categoria="Instrumentos e Aúdio" and 
preço >=1000 and preço <= 1500;

SELECT * FROM tb_varejo WHERE categoria="Papelaria e Informática" and
nome LIKE 'B%4';
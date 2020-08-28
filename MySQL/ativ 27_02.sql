create database db_pizzaria_legal;

use db_pizzaria_legal;

/*Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as informações dos produtos desta empresa. 

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga  exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.

Faça um select  utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre  tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).*/

create table tb_categoria (
	id bigint(2) auto_increment,
    tipo varchar(20) not null,
    multiplicadorDePreço int,
    primary key(id)
);

create table tb_pizza(
	id bigInt(5) auto_increment,
    Nome varchar(20) not null,
    sabor varchar(20),
    massa varchar(20),
    tipoPizza bigint(2),
    primary key(id),
    foreign key(tipoPizza) references tb_categoria(id)
);


insert into tb_categoria (tipo,multiplicadorDePreço) values ("Doce",1.5);
insert into tb_categoria (tipo,multiplicadorDePreço) values ("Vegana",1.2);
insert into tb_categoria (tipo,multiplicadorDePreço) values ("Normal",1);

select * from tb_categoria;


insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Portuguesa","Salgada","Padrão",3)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Chocolate","Doce","Suave",1)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Brócolis","Salgada","Padrão",2)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Milho","Salgada","Padrão",2)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Calabresa","Salgada","Padrão",3)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Mussarela","Salgada","Padrão",3)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Açaí","Doce","Suave",1)
insert into tb_pizza (Nome,sabor,massa,tipoPizza) values ("Marguerita","Salgada","Padrão",3)

   
-- Faça um select que retorne os funcionários com o poder de ataque maior do que 2000.
select * from tb_categoria where multiplicadorDePreço > 1.3;

-- Faça um select trazendo  os funcionários com poder de defesa entre 1000 e 2000.
select * from tb_categoria where multiplicadorDePreço > 1.1 and multiplicadorDePreço < 1.6;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
select * from tb_pizza where Nome like 'C%';

-- Faça um um select com Inner join entre  tabela classe e personagem.
select * from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.id;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
select * from tb_pizza 
	right join tb_categoria on tb_categoria.id = tb_pizza.id 
		where tb_categoria.tipo like 'C%';
create database db_pizzaria_legal;

use db_pizzaria_legal;

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
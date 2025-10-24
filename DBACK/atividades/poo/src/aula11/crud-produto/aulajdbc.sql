create database aulajdbc;
use aulajdbc;

CREATE TABLE produtos(
	id int not null auto_increment,
	nome varchar(100) not null,
	preco decimal(10,2) not null,
	estoque int not null,
	primary key(id)
);

INSERT INTO produtos (nome, preco, estoque) VALUES ('Smartphone A', 1500.00, 25);

INSERT INTO produtos (nome, preco, estoque) VALUES ('Cabo USB', 25.50, 100);
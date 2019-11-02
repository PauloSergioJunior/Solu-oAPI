DROP TABLE IF EXISTS rebelde;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS localizacao;

CREATE TABLE rebelde(
idReb INT AUTO_INCREMENT ,
nome varchar(250),
idade int(3),
genero varchar(100),
primary key(idReb)
);

CREATE TABLE item(
idItem INT AUTO_INCREMENT ,
nome varchar(250),
valor int(4),
primary key(idItem)
);

CREATE TABLE localizacao(
idLoc INT AUTO_INCREMENT ,
nome varchar(250),
latitude varchar(250),
longitude varchar(250),
primary key(idLoc)
);

insert into REBELDE(NOME, IDADE, GENERO) values( 'Eduardo',10,'MASCULINO');
insert into REBELDE(NOME, IDADE, GENERO) values( 'PAULO',16,'MASCULINO');
insert into REBELDE(NOME, IDADE, GENERO) values( 'Eduarda',21,'FEMININO');
insert into REBELDE(NOME, IDADE, GENERO) values( 'Rodrigo',14,'MASCULINO');
insert into LOCALIZACAO(NOME,LATITUDE,LONGITUDE) values( 'Base Santa Rita','21321T','325823G');
insert into LOCALIZACAO(NOME,LATITUDE,LONGITUDE) values( 'Base Santa','2132T','35823G');
insert into LOCALIZACAO(NOME,LATITUDE,LONGITUDE) values( 'Base  Rita','1321T','32523G');
insert into LOCALIZACAO(NOME,LATITUDE,LONGITUDE) values( 'Base S R','2121T','32582G');
insert into ITEM(NOME,VALOR) values( 'ARMA',4);
insert into ITEM(NOME,VALOR) values( 'MUNICAO',3);
insert into ITEM(NOME,VALOR) values( 'AGUA',2);
insert into ITEM(NOME,VALOR) values( 'COMIDA',1);

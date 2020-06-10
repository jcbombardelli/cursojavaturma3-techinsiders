CREATE TABLE cidades (
    id int not null,
    nome varchar(255),
    estado varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE pessoas (
	id int not null,
    nome varchar(255),
    cidade int,
    PRIMARY KEY (id),
    FOREIGN KEY (cidade) REFERENCES cidades(id)
);

INSERT INTO cidades (id, nome, estado)
VALUES (1, 'Santos', 'São Paulo'); 

select * from cidades; 

INSERT INTO cidades -- (id, nome, estado) é comentario
VALUES (2, 'São Paulo', 'São Paulo');

select * from cidades; 

INSERT INTO pessoas
VALUES (1, 'JC', 1);

select * from pessoas;

INSERT INTO pessoas
VALUES (2, 'Luciana', 2);

select * from pessoas;

INSERT INTO pessoas
VALUES (3, 'Paulo', 2);

select * from pessoas;

SELECT pes.id, pes.nome as "nome da pessoa", cid.nome as "nome da cidade", cid.estado 
from pessoas pes
inner join cidades cid on cid.id = pes.id;


select count(*) as 'numero total de pessoas' from pessoas;


select * from cidades 
WHERE cidades.estado = 'São Paulo';

select * from cidades
where cidades.nome LIKE '%an%';

select * from cidades 
WHERE cidades.id > 1;

CREATE TABLE logs (
    id int not null,
    mensagem varchar(255),
    criado_em date,
    PRIMARY KEY (id)
);


INSERT INTO logs 
VALUES (1, 'Login criado com sucesso', '2020-06-09');

select * from logs;

select DATE_FORMAT(logs.criado_em, '%d/%m/%Y') as 'Data Criacao', logs.criado_em from logs;


	
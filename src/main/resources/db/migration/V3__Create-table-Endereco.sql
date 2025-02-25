create table Endereco(
    id bigint not null auto_increment,
    rua varchar(50) not null,
    numero integer not null,
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf varchar(2) not null,
    cep varchar(8) not null,
    logradouro varchar(50) not null,

    primary key(id)
);
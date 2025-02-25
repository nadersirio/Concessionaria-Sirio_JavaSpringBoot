create table Cliente(

    id bigint not null auto_increment,
    nome varchar(50) not null,
    email varchar(50) not null unique,
    cpf varchar(11) not null unique,
    rg varchar(10) not null unique,
    telefone varchar(11) not null,
    tipoHab varchar(2) not null unique,
    endereco integer,
    complemento varchar(100) not null,

    primary key(id)
    foreign key(endereco) references Endereco(id)
);
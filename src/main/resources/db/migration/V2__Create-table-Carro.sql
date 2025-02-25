create Table Carro(
    id bigint not null auto_increment,
    modelo varchar(50) not null,
    marca varchar(50) not null,
    ano integer not null,
    tabelaFipe double not null,

    primary key(id),
    foreign key(marca) references Marca(id)
)
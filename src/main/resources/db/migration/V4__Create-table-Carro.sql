create Table Carro(
    id bigint not null auto_increment,
    modelo varchar(50),
    marca BIGINT,
    ano integer,
    tabelaFipe double,

    primary key(id),
    CONSTRAINT fk_marca FOREIGN KEY (marca) REFERENCES marca(id)
)
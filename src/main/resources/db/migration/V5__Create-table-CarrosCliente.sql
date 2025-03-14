create table CarrosCliente(
    id bigint not null auto_increment,
    carro bigint not null,
    cliente bigint not null,
    cor varchar(50) not null,
    placa varchar(7) not null unique,
    ultimaRevisao1 date not null,
    ultimaRevisao2 date not null,
    ultimaRevisao3 date not null,
    
    primary key(id),
    CONSTRAINT fk_cliente FOREIGN KEY (cliente) REFERENCES cliente(id),
    CONSTRAINT fk_carro FOREIGN KEY (carro) REFERENCES carro(id)
);
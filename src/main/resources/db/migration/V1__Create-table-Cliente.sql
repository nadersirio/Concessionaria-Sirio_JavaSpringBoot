CREATE TABLE Cliente (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    rg VARCHAR(10) NOT NULL UNIQUE,
    telefone VARCHAR(15) NOT NULL,
    tipoHab VARCHAR(2) NOT NULL,
    endereco INT,
    complemento VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (endereco) REFERENCES Endereco(id)
);

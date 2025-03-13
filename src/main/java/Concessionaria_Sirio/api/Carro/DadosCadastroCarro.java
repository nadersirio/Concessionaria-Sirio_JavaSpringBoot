package Concessionaria_Sirio.api.Carro;

import java.sql.Date;

public record DadosCadastroCarro(String marca, String modelo, String ano, Double TabelaFIPE, String placa, Date revisoes) {
}
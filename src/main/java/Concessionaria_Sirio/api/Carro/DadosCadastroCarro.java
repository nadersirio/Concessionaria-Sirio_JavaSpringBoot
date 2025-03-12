package Concessionaria_Sirio.api.Carro;

import java.sql.Date;
import Concessionaria_Sirio.api.Marca.DadosMarca;

public record DadosCadastroCarro(DadosMarca marca, String modelo, String ano, Double TabelaFIPE, String placa, Date revisoes) {
}
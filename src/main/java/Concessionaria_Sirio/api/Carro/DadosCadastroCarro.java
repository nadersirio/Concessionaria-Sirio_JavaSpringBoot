package Concessionaria_Sirio.api.Carro;


import java.math.BigDecimal;

import Concessionaria_Sirio.api.Marca.DadosMarca;

public record DadosCadastroCarro(DadosMarca marca, String modelo, String ano, BigDecimal TabelaFIPE, String placa, DataRevisoes revisoes) {
}
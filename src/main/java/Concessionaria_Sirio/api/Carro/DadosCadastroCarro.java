package Concessionaria_Sirio.api.Carro;


import java.math.BigDecimal;

public record DadosCadastroCarro(String marca, String modelo, String ano, BigDecimal TabelaFIPE, String placa, DataRevisoes revisoes) {
}
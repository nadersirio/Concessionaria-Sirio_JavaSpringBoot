package Concessionaria_Sirio.api.Cliente;

import Concessionaria_Sirio.api.Endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String email, TipoCarteira TipoCarteira, DadosEndereco endereco) {

}

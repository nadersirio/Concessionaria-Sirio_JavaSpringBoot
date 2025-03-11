package Concessionaria_Sirio.api.Cliente;

import Concessionaria_Sirio.api.Endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String email, String cpf,
String rg, String telefone, TipoHab tipoHab, DadosEndereco endereco, String complemento) {

}

package Concessionaria_Sirio.api.Cliente;

import Concessionaria_Sirio.api.Endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(

  @NotBlank
  String nome,

  @NotBlank
  @Email
  String email,

  @NotBlank
  @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
  String cpf,

  @NotNull
  @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}-\\d{1}")
  String rg,

  @NotNull
  String telefone,
  
  @NotBlank
  TipoHab tipoHab,
  
  @NotNull
  @Valid
  DadosEndereco endereco,
   
  String complemento) {

}

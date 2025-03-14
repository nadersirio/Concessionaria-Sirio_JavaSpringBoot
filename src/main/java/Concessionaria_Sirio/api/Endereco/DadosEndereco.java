package Concessionaria_Sirio.api.Endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
  
  @NotBlank
  String logradouro,
  
  @NotBlank
  String bairro,

  @NotBlank
  @Pattern(regexp = "\\d{5}-\\d{3}")
  String cep,

  @NotBlank
  String cidade,

  @NotBlank
  String uf,

  String numero,
  
  @NotBlank
  String rua) {
}

package Concessionaria_Sirio.api.Carro;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCarro(
  
  @NotBlank
  String marca,
  
  @NotBlank
  String modelo,
  
  @NotBlank
  @Pattern(regexp = "[0-9]{4}")
  String ano, 

  @NotNull
  Double TabelaFIPE,
  
  @NotBlank
  @Pattern(regexp = "[A-Z]{3}-[0-9]{4}")
  String placa, 

  @NotNull
  Date revisoes) {
}
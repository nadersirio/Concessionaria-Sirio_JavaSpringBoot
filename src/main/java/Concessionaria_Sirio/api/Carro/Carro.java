package Concessionaria_Sirio.api.Carro;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Carro")
@Entity(name = "Carro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Carro {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String modelo;
  private String marca;
  private String ano;
  private BigDecimal tabelaFipe;

  public Carro(DadosCadastroCarro dados) {
    this.modelo = dados.modelo();
    this.marca = dados.marca();
    this.ano = dados.ano();
    this.tabelaFipe = dados.TabelaFIPE();
  }
}

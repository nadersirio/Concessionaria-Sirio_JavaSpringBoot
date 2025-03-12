package Concessionaria_Sirio.api.Carro;

import java.sql.Date;
import Concessionaria_Sirio.api.Marca.Marca;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "carro")
@Entity(name = "Carro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Carro {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String modelo;
  private String ano;
  private Double tabelaFipe;
  private String placa;
  private Date revisoes;

  @ManyToOne
  @JoinColumn(name = "marca", referencedColumnName = "id")
  private Marca marca;

  public Carro(DadosCadastroCarro dados) {
    this.modelo = dados.modelo();
    this.ano = dados.ano();
    this.tabelaFipe = dados.TabelaFIPE();
    this.placa = dados.placa();
    this.revisoes = dados.revisoes();
  }

  public void setMarca(Marca marcasalva) {
    this.marca = marcasalva;
  }
}

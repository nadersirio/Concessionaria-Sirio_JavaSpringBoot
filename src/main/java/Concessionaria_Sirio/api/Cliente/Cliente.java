package Concessionaria_Sirio.api.Cliente;

import Concessionaria_Sirio.api.Endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @Enumerated(EnumType.STRING)
    private TipoCarteira TipoCarteira;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCadastroCliente dados){
      this.nome = dados.nome();
      this.email = dados.email();
      this.TipoCarteira = dados.TipoCarteira();
      this.endereco = new Endereco(dados.endereco());   
    }
}

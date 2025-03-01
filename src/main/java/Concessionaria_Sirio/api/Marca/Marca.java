package Concessionaria_Sirio.api.Marca;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Marca {

    private String nome;


    public Marca(DadosMarca dados) {
        this.nome = dados.nome();
    }
}

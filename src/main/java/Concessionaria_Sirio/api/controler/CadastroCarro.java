package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Carro.Carro;
import Concessionaria_Sirio.api.Carro.CarroRepository;
import Concessionaria_Sirio.api.Carro.DadosCadastroCarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CadastroCarro")
public class CadastroCarro {

    @Autowired 
    private CarroRepository repository;

    @PostMapping
    public void Cadastro(@RequestBody DadosCadastroCarro dados) {
        repository.save(new Carro(dados));
    }
}

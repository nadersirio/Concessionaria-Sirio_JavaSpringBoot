package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Carro.Carro;
import Concessionaria_Sirio.api.Carro.CarroRepository;
import Concessionaria_Sirio.api.Carro.DadosCadastroCarro;
import Concessionaria_Sirio.api.Marca.DadosMarca;
import Concessionaria_Sirio.api.Marca.Marca;
import Concessionaria_Sirio.api.Marca.MarcaRepository;
import jakarta.transaction.Transactional;

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

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping
    @Transactional
    public void Cadastro(@RequestBody DadosCadastroCarro dados) {

        DadosMarca dadosMarca = dados.marca();
        Marca marcasalva = marcaRepository.save(new Marca(dadosMarca));

        Carro carro = new Carro(dados);
        carro.setMarca(marcasalva);
        repository.save(carro);
    }
}

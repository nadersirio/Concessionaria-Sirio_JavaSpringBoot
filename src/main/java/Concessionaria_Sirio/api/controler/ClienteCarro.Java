package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Carro.Carro;
import Concessionaria_Sirio.api.Cliente.Cliente;
import Concessionaria_Sirio.api.CarroCliente.ClienteCarro;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ClienteCarro")
public class ClienteCarro {

    @Autowired
    private ClienteCarroRepository repository;

    @PostMapping
    @Transactional
    public void Cadastro(@RequestBody @Valid DadosCadastroClienteCarro dados) {

        ClienteCarro clienteCarro = new ClienteCarro(cliente, carro);
        repository.save(clienteCarro);
    }
}
package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Cliente.Cliente;
import Concessionaria_Sirio.api.Cliente.ClienteRepository;
import Concessionaria_Sirio.api.Cliente.DadosCadastroCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CadastroCliente")
public class CadastroCliente {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }  
}

package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Cliente.Cliente;
import Concessionaria_Sirio.api.Cliente.ClienteRepository;
import Concessionaria_Sirio.api.Cliente.DadosCadastroCliente;
import Concessionaria_Sirio.api.Endereco.DadosEndereco;
import Concessionaria_Sirio.api.Endereco.Endereco;
import Concessionaria_Sirio.api.Endereco.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;

@RestController
@RequestMapping("/CadastroCliente")
public class CadastroCliente {

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private EnderecoRepository repositoryEndereco;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody DadosCadastroCliente dados) {
        
        DadosEndereco dadosEndereco = dados.endereco();
        Endereco endereco = new Endereco(dadosEndereco);

        Endereco enderecoSalvo = repositoryEndereco.save(endereco);

        Cliente cliente = new Cliente(dados);
        cliente.setEndereco(enderecoSalvo);
        repositoryCliente.save(cliente);
    
    }  
}

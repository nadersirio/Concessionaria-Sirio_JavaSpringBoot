package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Cliente.Cliente;
import lombok.Lombok;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/CadastroCliente")
public class CadastroCliente {

    @PostMapping
    public void Cadastrar(@RequestBody Cliente DadosCadastroCliente) {
        System.out.println(DadosCadastroCliente);
    }
}

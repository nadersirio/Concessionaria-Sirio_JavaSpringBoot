package Concessionaria_Sirio.api.controler;

import Concessionaria_Sirio.api.Carro.Carro;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CadastroCarro")
public class CadastroCarro {

    @PostMapping
    public void Cadastro(@RequestBody Carro DadosCarro) {
        System.out.println(DadosCarro);
    }
}

package br.com.lex.AdministracaoCarteira.controller;

import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/")
    public String IncioMenu(){

        return "Aplicação Iniciada!";

    }

}

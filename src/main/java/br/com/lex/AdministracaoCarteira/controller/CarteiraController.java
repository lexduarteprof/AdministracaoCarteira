package br.com.lex.AdministracaoCarteira.controller;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;
import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import br.com.lex.AdministracaoCarteira.service.impl.CarteiraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/carteira")
public class CarteiraController {

    @Autowired
    CarteiraServiceImpl carteiraService;

    @PostMapping("")
    public CarteiraDeAtivos incluir(@RequestBody CarteiraDeAtivos carteiraDeAtivos){
        return carteiraService.incluir(carteiraDeAtivos);
    }

    @GetMapping("/{id}")
    public CarteiraDeAtivos findById(@PathVariable Long id){

        return carteiraService.findByidCarteiraDeAtivos(id);

    }
    @PostMapping("/resgistrarOperacao")
    public MovimentoDaCarteira resgistrarOperacao(
            @Valid @RequestBody MovimentoDaCarteira movimentoDaCarteira) throws Exception {
        return carteiraService.registrarMovimento(movimentoDaCarteira);
    }


}

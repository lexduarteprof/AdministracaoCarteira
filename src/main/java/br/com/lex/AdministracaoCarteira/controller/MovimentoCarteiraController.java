package br.com.lex.AdministracaoCarteira.controller;


import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import br.com.lex.AdministracaoCarteira.service.impl.MovimentoCarteiraImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimento")
public class MovimentoCarteiraController {

    @Autowired
    MovimentoCarteiraImpl movimentoCarteiraservice;

    @PostMapping("/incluir")
    public MovimentoDaCarteira incluir(@RequestBody MovimentoDaCarteira movimentoDaCarteira){

        return movimentoCarteiraservice.incluir(movimentoDaCarteira);

    }

    @GetMapping("/{id}")
    public MovimentoDaCarteira getById(@PathVariable Long id){

        return movimentoCarteiraservice.findbymovimentoId(id);

    }
    @GetMapping("")
    public List<MovimentoDaCarteira> getAll(){

        return movimentoCarteiraservice.findAll();

    }



}

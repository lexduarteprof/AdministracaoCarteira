package br.com.lex.AdministracaoCarteira.controller;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;
import br.com.lex.AdministracaoCarteira.service.impl.AtivoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ativo")
public class AtivoController {

    @Autowired
    private AtivoServiceImpl service;

    @GetMapping("/{id}")
    public AtivoFinanceiro getAtivoFinanceirobyId(@PathVariable Long id){

        return service.getbyID(id);

    }

    @GetMapping("")
    public List<AtivoFinanceiro> findAll(){

        return service.findAll();

    }

    @PostMapping("")
    public AtivoFinanceiro incluir(@Valid @RequestBody AtivoFinanceiro ativoFinanceiro){

        return service.incluir(ativoFinanceiro);

    }



}

package br.com.lex.AdministracaoCarteira.controller;

import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.entity.InvestimentosSugeridos;
import br.com.lex.AdministracaoCarteira.service.impl.InvestimentosSugeridosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/investimentossugeridos")
public class InvestimentosSugeridosController {

    @Autowired
    InvestimentosSugeridosImpl investimentossugeridosservice;

    @PostMapping("/incluirInvestimento")
    public InvestimentosSugeridos incluirInvestimento(
            @Valid @RequestBody InvestimentosSugeridos investimentosSugeridos) throws Exception {

        return investimentossugeridosservice.incluir(investimentosSugeridos);

    }

    @GetMapping("/{id}")
    public InvestimentosSugeridos getInvestimetoSugeridoById(@PathVariable Long id) {

        return investimentossugeridosservice.findByidInvestimentosSugeridos(id);

    }
    @GetMapping("/clienteVinculado/{id}")
    public Cliente getClienteVinculadobySugestaoID(@PathVariable Long id)
    {
        InvestimentosSugeridos investimentosSugeridos = new InvestimentosSugeridos();

        investimentosSugeridos.setIdSugestaoInvestimento(id);

        return investimentossugeridosservice.GetClienteVinculado(investimentosSugeridos);

    }


}

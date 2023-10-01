package br.com.lex.AdministracaoCarteira.controller;

import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import br.com.lex.AdministracaoCarteira.service.impl.CarteiraServiceImpl;
import br.com.lex.AdministracaoCarteira.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id){

        return clienteService.findByidCliente(id);

    }
    @PostMapping("/incluirCliente")
    public Cliente incluirCliente(
            @Valid @RequestBody Cliente cliente) throws Exception {
        return clienteService.incluir(cliente);
    }
    @GetMapping("/")
    public List<Cliente> getAll(){

        return clienteService.findAll();

    }


}

package br.com.lex.AdministracaoCarteira.service;


import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;

import java.util.List;

public interface IClienteService {

    Cliente findByidCliente (long id);

    public Cliente incluir(Cliente cliente);

    public List<Cliente> findAll();

}

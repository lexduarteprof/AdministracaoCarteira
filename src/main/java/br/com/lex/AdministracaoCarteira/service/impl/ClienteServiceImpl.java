package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.repository.ClienteRepository;
import br.com.lex.AdministracaoCarteira.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public Cliente findByidCliente(long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente incluir(Cliente cliente) {

        return clienteRepository.save(cliente);

    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
}

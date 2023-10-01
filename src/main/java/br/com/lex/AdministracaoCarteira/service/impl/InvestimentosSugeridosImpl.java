package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.entity.InvestimentosSugeridos;
import br.com.lex.AdministracaoCarteira.repository.InvestimentosSugeridosRepository;
import br.com.lex.AdministracaoCarteira.service.IInvestimentosSugeridosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentosSugeridosImpl implements IInvestimentosSugeridosService {

    @Autowired
    InvestimentosSugeridosRepository investimentosSugeridosRepository;

    @Override
    public InvestimentosSugeridos findByidInvestimentosSugeridos(Long id) {
        return investimentosSugeridosRepository.findById(id).orElse(null);
    }

    @Override
    public InvestimentosSugeridos incluir(InvestimentosSugeridos investimentoSugerido) {
        return investimentosSugeridosRepository.save(investimentoSugerido);
    }

    @Override
    public List<InvestimentosSugeridos> findAll() {
        return investimentosSugeridosRepository.findAll();
    }

    public Cliente GetClienteVinculado(InvestimentosSugeridos investimentoSugerido){

        Cliente clientevinculado =
                findByidInvestimentosSugeridos(investimentoSugerido.getIdSugestaoInvestimento())
                        .getCliente();

        return clientevinculado;

    }




}

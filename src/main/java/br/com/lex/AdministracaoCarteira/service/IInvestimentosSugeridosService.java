package br.com.lex.AdministracaoCarteira.service;

import br.com.lex.AdministracaoCarteira.entity.Cliente;
import br.com.lex.AdministracaoCarteira.entity.InvestimentosSugeridos;

import java.util.List;

public interface IInvestimentosSugeridosService {

    InvestimentosSugeridos findByidInvestimentosSugeridos (Long id);

    public InvestimentosSugeridos incluir(InvestimentosSugeridos investimentoSugerido);

    public List<InvestimentosSugeridos> findAll();
}

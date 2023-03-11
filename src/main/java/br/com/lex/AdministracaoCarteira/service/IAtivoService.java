package br.com.lex.AdministracaoCarteira.service;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;

import java.util.List;

public interface IAtivoService {
    AtivoFinanceiro getbyID(Long id);

    AtivoFinanceiro incluir(AtivoFinanceiro ativoFinanceiro);

    List<AtivoFinanceiro> findAll();
}

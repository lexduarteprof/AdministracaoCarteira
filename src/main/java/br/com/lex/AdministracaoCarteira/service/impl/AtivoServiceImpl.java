package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;
import br.com.lex.AdministracaoCarteira.repository.AtivoRepository;
import br.com.lex.AdministracaoCarteira.service.IAtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtivoServiceImpl implements IAtivoService {

    @Autowired
    private AtivoRepository ativoRepository;

    @Override
    public AtivoFinanceiro getbyID(Long id) {

        return ativoRepository.findById(id).get();

    }

    @Override
    public AtivoFinanceiro incluir(AtivoFinanceiro ativoFinanceiro) {

        return ativoRepository.save(ativoFinanceiro);

    }

    @Override
    public List<AtivoFinanceiro> findAll() {

        return ativoRepository.findAll();

    }

    ;

}

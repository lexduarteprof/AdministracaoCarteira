package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import br.com.lex.AdministracaoCarteira.repository.AtivoRepository;
import br.com.lex.AdministracaoCarteira.repository.CarteiraRepository;
import br.com.lex.AdministracaoCarteira.repository.MovimentoCarteiraRepository;
import br.com.lex.AdministracaoCarteira.service.IMovimentoCarteira;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentoCarteiraImpl implements IMovimentoCarteira {

    @Autowired
    MovimentoCarteiraRepository movimentoCarteiraRepository;
    @Autowired
    AtivoRepository ativoRepository;
    @Autowired
    CarteiraRepository carteiraRepository;


    @Override
    public MovimentoDaCarteira incluir(MovimentoDaCarteira movimentoDaCarteira) {


        return movimentoCarteiraRepository.save(movimentoDaCarteira);


    }

    @Override
    public MovimentoDaCarteira findbymovimentoId(Long Id) {

        return movimentoCarteiraRepository.findById(Id).get();

    }

    @Override
    public List<MovimentoDaCarteira> findAll() {
        return movimentoCarteiraRepository.findAll();
    }
}

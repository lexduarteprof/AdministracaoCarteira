package br.com.lex.AdministracaoCarteira.service.impl;

import br.com.lex.AdministracaoCarteira.entity.AtivoFinanceiro;
import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import br.com.lex.AdministracaoCarteira.repository.AtivoRepository;
import br.com.lex.AdministracaoCarteira.repository.CarteiraRepository;
import br.com.lex.AdministracaoCarteira.service.ICarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteiraServiceImpl implements ICarteiraService {

    @Autowired
    private CarteiraRepository carteiraRepository;
    @Override
    public CarteiraDeAtivos findByidCarteiraDeAtivos(long id) {

            return carteiraRepository.findById(id).orElse(null);

    }

    public CarteiraDeAtivos incluir(CarteiraDeAtivos carteiraDeAtivos) {

        return carteiraRepository.save(carteiraDeAtivos);

    }
}

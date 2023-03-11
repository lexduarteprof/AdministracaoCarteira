package br.com.lex.AdministracaoCarteira.service;

import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;

public interface ICarteiraService {

    CarteiraDeAtivos findByidCarteiraDeAtivos (long id);

    public CarteiraDeAtivos incluir(CarteiraDeAtivos carteiraDeAtivos);


}

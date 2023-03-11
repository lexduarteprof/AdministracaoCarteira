package br.com.lex.AdministracaoCarteira.service;

import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;

import java.util.List;

public interface IMovimentoCarteira {

    public MovimentoDaCarteira incluir(MovimentoDaCarteira movimentoDaCarteira);

    public MovimentoDaCarteira findbymovimentoId(Long Id);

    public List<MovimentoDaCarteira> findAll();

}

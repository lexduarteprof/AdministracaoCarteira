package br.com.lex.AdministracaoCarteira.repository;

import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import br.com.lex.AdministracaoCarteira.entity.InvestimentosSugeridos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentosSugeridosRepository extends
        JpaRepository<InvestimentosSugeridos, Long> {
}

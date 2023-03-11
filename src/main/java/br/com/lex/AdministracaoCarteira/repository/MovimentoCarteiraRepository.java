package br.com.lex.AdministracaoCarteira.repository;

import br.com.lex.AdministracaoCarteira.entity.MovimentoDaCarteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentoCarteiraRepository extends JpaRepository<MovimentoDaCarteira, Long> {
}

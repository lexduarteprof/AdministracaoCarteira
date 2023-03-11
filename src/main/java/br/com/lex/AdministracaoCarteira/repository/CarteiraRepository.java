package br.com.lex.AdministracaoCarteira.repository;

import br.com.lex.AdministracaoCarteira.entity.CarteiraDeAtivos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<CarteiraDeAtivos, Long> {

}

package br.com.lex.AdministracaoCarteira.repository;

import br.com.lex.AdministracaoCarteira.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

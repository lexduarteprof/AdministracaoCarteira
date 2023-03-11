package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tAtivoFinanceiro",
uniqueConstraints = {@UniqueConstraint(columnNames = {"nome", "dataVencimento"})})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class AtivoFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idAtivoFinanceiro;
    @Column(length = 50)
    protected String nome;
    @Column(length = 200)
    protected String descricao;
    protected LocalDate dataVencimento;

    public void comprar(LocalDate dataDeCompra, long quantidadeComprada, double taxaDeCompra){

    }
    public void vender(LocalDate dataDeVenda, long quantidadeVendida, double taxaDeVenda){

    }


}

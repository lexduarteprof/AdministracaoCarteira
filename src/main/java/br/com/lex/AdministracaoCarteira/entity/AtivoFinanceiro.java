package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotBlank(message = "Preencha o campo corretamente")
    @Size(min = 3, max=50, message="'${validadeValue}' precisa estar entre {min} e {max} caracteres.")
    @Column(length = 50)
    protected String nome;
    @NotBlank(message = "Preencha o campo corretamente")
    @Column(length = 200)
    protected String descricao;

    @NotNull(message = "Preencha o campo corretamente")
    protected LocalDate dataVencimento;

    public void comprar(LocalDate dataDeCompra, long quantidadeComprada, double taxaDeCompra){

    }
    public void vender(LocalDate dataDeVenda, long quantidadeVendida, double taxaDeVenda){

    }




}

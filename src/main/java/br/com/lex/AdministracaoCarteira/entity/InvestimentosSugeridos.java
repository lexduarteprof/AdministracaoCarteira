package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tInvestimentosSugeridos")

public class InvestimentosSugeridos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdSugestaoInvestimento;
    @Column(columnDefinition = "varchar(320)")
    private String InvetimentoSugerido;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonBackReference
    private Cliente cliente;

    public long getIdSugestaoInvestimento() {
        return IdSugestaoInvestimento;
    }

    public void setIdSugestaoInvestimento(long idSugestaoInvestimento) {
        IdSugestaoInvestimento = idSugestaoInvestimento;
    }

    public String getInvetimentoSugerido() {
        return InvetimentoSugerido;
    }

    public void setInvetimentoSugerido(String invetimentoSugerido) {
        InvetimentoSugerido = invetimentoSugerido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

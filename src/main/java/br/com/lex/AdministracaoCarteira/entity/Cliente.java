package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tCliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    private String nome;
    private String profissao;
    private int idade;
    private double rendaMensal;
    private double patrimonio;
    private String estadoCivil;
    private double valorAInvestir;
    private String objetivoInvestimento;

    private float horizonteInvestimentoEmAnos;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.REMOVE)
    //Essa anotação @JsonManagedReference define que a lista será carregada
    // na chamada do objeto,
    // porém não sera carregado o objeto referência vinculado
    // deve ser feita a referencia contrária no objeto vinculado
    @JsonManagedReference
    private List<InvestimentosSugeridos> investimentosSugeridos;
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getValorAInvestir() {
        return valorAInvestir;
    }

    public void setValorAInvestir(double valorAInvestir) {
        this.valorAInvestir = valorAInvestir;
    }

    public String getObjetivoInvestimento() {
        return objetivoInvestimento;
    }

    public void setObjetivoInvestimento(String objetivoInvestimento) {
        this.objetivoInvestimento = objetivoInvestimento;
    }

    public List<InvestimentosSugeridos> getInvestimentosSugeridos() {
        return investimentosSugeridos;
    }

    public void setInvestimentosSugeridos(List<InvestimentosSugeridos> investimentosSugeridos) {
        this.investimentosSugeridos = investimentosSugeridos;
    }

    public float getHorizonteInvestimentoEmAnos() {
        return horizonteInvestimentoEmAnos;
    }

    public void setHorizonteInvestimentoEmAnos(float horizonteInvestimentoEmAnos) {
        this.horizonteInvestimentoEmAnos = horizonteInvestimentoEmAnos;
    }
}

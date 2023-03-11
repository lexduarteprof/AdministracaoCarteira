package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tMovimentoDaCarteira")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MovimentoDaCarteira {

    public enum OPERACAO {
        VENDA,
        COMPRA
    };
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movimentoId;
    private double precoUnitario;
    private long quantidade;
    private LocalDate dataDoMovimento;

    @ManyToOne
    @JoinColumn(name = "idAtivoFinanceiro")
    private AtivoFinanceiro ativoFinanceiro;
    @ManyToOne
    @JoinColumn(name = "idCarteiraDeAtivos")
    private CarteiraDeAtivos carteiraDeAtivos;
    private double taxa;
    private double VNA;
    private double valorDoMovimento;
    private OPERACAO operacao;

    @Override
    public String toString() {
        return "MovimentoDaCarteira{" +
                "movimentoId=" + movimentoId +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                ", dataDoMovimento=" + dataDoMovimento +
                ", ativoFinanceiro=" + ativoFinanceiro +
                ", carteiraDeAtivos=" + carteiraDeAtivos +
                ", taxa=" + taxa +
                ", VNA=" + VNA +
                ", valorDoMovimento=" + valorDoMovimento +
                ", operacao=" + operacao +
                '}';
    }
}

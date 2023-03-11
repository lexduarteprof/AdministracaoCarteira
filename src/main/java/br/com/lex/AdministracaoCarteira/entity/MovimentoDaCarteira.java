package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tMovimentoDaCarteira")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MovimentoDaCarteira {
    public void atualizarPUPelaTaxa() {
        switch (this.ativoFinanceiro.getNome()){

            case "LTN":

                TituloPublicoLTN tituloPublicoLTN = (TituloPublicoLTN) ativoFinanceiro;
                this.precoUnitario = tituloPublicoLTN.calcularPreco(
                        this.taxa,this.dataDoMovimento);
                break;

            case "LFT":
                TituloPublicoLFT tituloPublicoLFT = (TituloPublicoLFT) ativoFinanceiro;
                this.precoUnitario = tituloPublicoLFT.calcularPreco(
                        this.taxa,this.dataDoMovimento);
                break;

        }
    }

    public enum OPERACAO {
        VENDA,
        COMPRA
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movimentoId;
    private double precoUnitario;
    @NotNull(message="A quantidade não pode ser nula!")
    private long quantidade;
    @NotNull(message="A data não pode ser nula!")
    private LocalDate dataDoMovimento;

    @ManyToOne
    @JoinColumn(name = "idAtivoFinanceiro")
    private AtivoFinanceiro ativoFinanceiro;
    @ManyToOne
    @JoinColumn(name = "idCarteiraDeAtivos")
    private CarteiraDeAtivos carteiraDeAtivos;
    @NotNull(message="A taxa da operação deve ser informada!")
    private double taxa;
    private double VNA;
    private double valorDoMovimento;
    @NotNull(message="A operação deve ser COMPRA ou VENDA!")
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

    public void setQuantidade(long quantidade) {
        if(quantidade <= 0){
            throw new RuntimeException("A quantidade deve ser maior que 0!");
        }
        this.quantidade = quantidade;
    }

}

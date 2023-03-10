package br.com.lex.AdministracaoCarteira.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimentoDaCarteira {

    public enum OPERACAO {
        VENDA,
        COMPRA
    };

    private long movimentoId;
    private double precoUnitario;
    private long quantidade;
    private LocalDate dataDoMovimento;
    private AtivoFinanceiro ativoFinanceiro;
    private CarteiraDeAtivos carteiraDeAtivos;
    private double taxa;
    private double VNA;
    private double valorDoMovimento;
    private OPERACAO operacao;





}

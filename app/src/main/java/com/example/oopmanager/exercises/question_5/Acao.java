package com.example.oopmanager.exercises.question_5;

import java.util.Date;

public abstract class Acao extends Investimento {
    private double percentualRetorno;

    public Acao(double valorInvestido, String descricao, Date dataAplicacao, double percentualRetorno) {
        super(valorInvestido, descricao, dataAplicacao);
        this.percentualRetorno = percentualRetorno;
    }

    @Override
    public double calcularRetorno() {
        return getValorInvestido() * (percentualRetorno/100);
    }
}

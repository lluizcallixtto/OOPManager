package com.example.oopmanager.exercises.question_5;

import java.util.Date;

public abstract class FundoImobiliario extends Investimento{
    private double rendimentoMensal;

    public FundoImobiliario(double valorInvestido, String descricao, Date dataAplicacao, double rendimentoMensal) {
        super(valorInvestido, descricao, dataAplicacao);
        this.rendimentoMensal = rendimentoMensal;
    }

    @Override
    public double calcularRetorno() {
        return rendimentoMensal;
    }

}

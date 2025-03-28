package com.example.oopmanager.exercises.question_5;

import java.util.Date;

public abstract class Investimento implements IInvestimentos{
    private double valorInvestido;
    private String descricao;
    protected Date dataAplicacao;

    public Investimento(double valorInvestido, String descricao, Date dataAplicacao) {
        this.valorInvestido = valorInvestido;
        this.descricao = descricao;
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public double getValorInvestido() {
        return valorInvestido;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public abstract double calculadoraRetorno();

    public abstract Date data();
}

package com.example.oopmanager.exercises.question_4;

import java.util.Date;

public class Despesa implements ITransacao {
    private double valor;
    private String descricao;
    private Date data;

    public Despesa(double valor, String descricao, Date data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public Date getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "Despesa";
    }

    @Override
    public String obterDetalhes() {
        return "Receita Valor: " + valor + "Descrição: " + descricao + "Data: " + data;
    }
}

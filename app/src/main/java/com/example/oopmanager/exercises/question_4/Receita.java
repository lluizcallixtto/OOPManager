package com.example.oopmanager.exercises.question_4;

import java.util.Date;

public class Receita implements ITransacao{
    private double valor;
    private String descricao;
    private Date data;

    public Receita(double valor, String descricao, Date data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public Date getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "Receita";
    }

    @Override
    public String obterDetalhes() {
        return "Receita Valor: " + valor + "Descrição: " + descricao + "Data: " + data;
    }
}

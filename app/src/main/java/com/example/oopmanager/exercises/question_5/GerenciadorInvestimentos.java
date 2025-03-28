package com.example.oopmanager.exercises.question_5;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorInvestimentos {
    private List<IInvestimentos> investimentos;

    public GerenciadorInvestimentos(List<IInvestimentos> investimentos) {
        this.investimentos = new ArrayList<>();
    }

    public void adicionarTransacoes(IInvestimentos investimento) {
        investimentos.add(investimento);
    }

    public double calcularRetornoTotal() {
        double retornoTotal = 0;
        for (IInvestimentos investimento : investimentos) {
            retornoTotal += investimento.calcularRetorno();
        }
        return retornoTotal;
    }

    public List<IInvestimentos> getInvestimentos() {
        return investimentos;
    }
}

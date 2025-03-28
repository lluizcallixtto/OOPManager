package com.example.oopmanager.exercises.question_4;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinanceiro {
    private List<ITransacao> transacaos;

    public GerenciadorFinanceiro(List<ITransacao> transacaos) {
        this.transacaos = new ArrayList<>();
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (ITransacao transacao : transacaos) {
            if (transacao.getTipo().equals("Receita")) {
                saldo += transacao.getValor();
            } else {
                saldo -= transacao.getValor();
            }
        }
        return saldo;
    }

    public List<ITransacao> getTransacaos() {
        return transacaos;
    }
}

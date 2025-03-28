package com.example.oopmanager.exercises.question_1;

public class Carro extends Veiculos {
    private int qtdePortas;

    public Carro(String marca, String modelo, int ano, int qtdePortas) {
        super(marca, modelo, ano);
        this.qtdePortas = qtdePortas;
    }

    @Override
    public String obterDetalhes(){
        return "Carro: " + getMarca() + " " + getModelo() + " (" + getAno() + ") com " + qtdePortas + " portas.";
    }

}

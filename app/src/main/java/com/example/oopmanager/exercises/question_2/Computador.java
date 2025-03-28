package com.example.oopmanager.exercises.question_2;

public class Computador extends Dispositivos{
    private String processador;

    public Computador(String marca, int modelo, String armazenamento, String processador) {
        super(marca, modelo, armazenamento);
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    @Override
    public String obterDetalhes() {
        return "Computador: " + getMarca() + " " + getModelo() +
                " (" + getArmazenamento() + "GB, " + processador + ")";
    }
}

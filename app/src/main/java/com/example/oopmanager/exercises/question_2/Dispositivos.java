package com.example.oopmanager.exercises.question_2;

public abstract class Dispositivos {
    private String marca;
    private int modelo;
    private int armazenamento;

    public Dispositivos(String marca, int modelo, String armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = Integer.parseInt(armazenamento);
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public abstract String obterDetalhes();
}

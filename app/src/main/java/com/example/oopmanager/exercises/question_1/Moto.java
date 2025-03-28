package com.example.oopmanager.exercises.question_1;

public class Moto extends Veiculos {
    private boolean motoTipo;

    public Moto(String marca, String modelo, int ano, boolean motoTipo) {
        super(marca, modelo, ano);
        this.motoTipo = motoTipo;
    }

    public boolean isMotoTipo() {
        return motoTipo;
    }

    @Override
    public String obterDetalhes() {
        String tipoMoto = motoTipo ? "Elétrica" : "Combustão";
        return "Moto: " + getMarca() + "Modelo: " + getModelo() + " ( " + getAno() + " ) " + "Tipo da Moto: " + tipoMoto;
    }
}

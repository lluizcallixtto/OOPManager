package com.example.oopmanager.exercises.question_2;

public class Smartphone extends Dispositivos{
    private boolean suporteRede5G;

    public Smartphone(String marca, int modelo, String armazenamento, boolean suporteRede5G) {
        super(marca, modelo, armazenamento);
        this.suporteRede5G = suporteRede5G;
    }

    public boolean isSuporteRede5G() {
        return suporteRede5G;
    }

    @Override
    public String obterDetalhes() {
        String conectividade = suporteRede5G? "Com suporte a 5G" : "Sem suporte a 5G";
        return "Smartphone: " + getMarca() + " " + getModelo() +
                " (" + getArmazenamento() + "GB, " + conectividade + ")";
    }
}

package com.example.oopmanager.exercises.question_3;

public class ContatoProfissional implements IContato{
    private String nome;
    private String telefone;
    private String email;
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String email, String empresa) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String obterDetalhes() {
        return "Contato Profissional: " + nome + " (Empresa: " + empresa + "), Tel: " + telefone + ", Email: " + email;
    }


}

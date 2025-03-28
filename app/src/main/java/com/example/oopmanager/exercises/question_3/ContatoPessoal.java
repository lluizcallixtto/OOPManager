package com.example.oopmanager.exercises.question_3;

public class ContatoPessoal implements IContato{
    private String nome;
    private String telefone;
    private String email;
    private String apelido;

    public ContatoPessoal(String nome, String telefone, String email, String apelido) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.apelido = apelido;
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

    public String getApelido() {
        return apelido;
    }

    @Override
    public String obterDetalhes() {
        return "Contato Pessoal: " + nome + " (" + apelido + "), Tel: " + telefone + ", Email: " + email;
    }
}

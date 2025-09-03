package org.example.desafio2.model;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String apresentar() {
        return "Sou " + nome + ", " + obterProfissao() + ".";
    }

    protected String obterProfissao() {
        return "uma pessoa";
    }
}
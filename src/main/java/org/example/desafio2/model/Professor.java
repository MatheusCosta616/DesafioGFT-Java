package org.example.desafio2.model;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou " + nome + ", professor de " + disciplina + ".");
    }
}
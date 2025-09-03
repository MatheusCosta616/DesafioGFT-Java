package org.example.desafio1.model;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("O preço deve ser positivo.");
        }
    }

    public void exibirDados() {
        System.out.printf("Produto: %s, Preço: R$%.2f\n", nome, preco);
    }
}

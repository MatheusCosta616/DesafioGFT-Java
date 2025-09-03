package org.example.desafio1;

import org.example.desafio1.model.Produto;

public class Main {
    public static void main(String[] args) {
        // Criando o produto "Caderno" com preço inicial de 15 reais
        Produto produto = new Produto("Caderno", 15.00);
        // Alterando o preço do produto para 20 reais
        produto.alterarPreco(20.00);
        // Exibindo os dados do produto
        produto.exibirDados();
    }
}
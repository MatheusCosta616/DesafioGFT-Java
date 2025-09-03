package org.example.desafio2;

import org.example.desafio2.model.Pessoa;
import org.example.desafio2.model.Professor;

public class Main {
    public static void main(String[] args) {
       //Instanciando um objeto da classe Professor
        Pessoa pessoa = new Professor("Sofia", "Matemática");

        // Chamando o método apresentar e exibindo o resultado
        pessoa.apresentar();
    }
}
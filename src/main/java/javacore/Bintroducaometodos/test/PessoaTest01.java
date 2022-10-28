package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {//código altamente coeso -> poucas coisas feitas pelo msm código
    //quanto uma classe conhece da outra
    //colocar o this se tiver outra variável com o msm nome passada como argumento
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());//a variável de referência só pode acessar
        //de fora do objeto td q é público,sejam atributos ou métodos
    }
}

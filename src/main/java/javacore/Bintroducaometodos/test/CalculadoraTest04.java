package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println();
        System.out.println();
        System.out.println();
        //Dentro das classes qdo passo variáveis do tipo primitivo,
        //A variável original do tipo primitivo nunca vai ser alterada
        //N importa oq aconteça dentro do método a original nunca será alterada
        //Pq vc tá passando a cópia daqueles valores, então o Java pega o bit
        //copia o bit e passa para a nova variável de referência q está sendo criada
        //dentro do método, q é a variável original cadastrada
    }
}
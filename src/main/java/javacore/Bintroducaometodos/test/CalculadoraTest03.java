package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);//o retorno de um método
        // é como se vc tivesse inicializando uma variável com aquele atributo
        //o retorno é do tipo especificado na construção do método
        //ou se não for, é necessário fazer cast
        System.out.println(result);
    }
}

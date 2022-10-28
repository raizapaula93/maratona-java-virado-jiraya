package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);//chamada de array na passagem de parametro
        calculadora.somaVarArgs(1,2,3,4,5,6,7);//chamada de array na passagem de VarArgs como parametro
        //Os ... tem que vir depois do tipo, e precisa ser o utlimo metodos
    }
}

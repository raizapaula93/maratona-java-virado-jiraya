package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario1;

public class Funcionario01 {
    public static void main(String[] args) {

        Funcionario1 funcionario = new Funcionario1();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
        }
    }





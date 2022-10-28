package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario1;

public class Funcionario01 {
    public static void main(String[] args) {

        Funcionario1 funcionario = new Funcionario1();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();

        System.out.println(funcionario.getMedia());
        }
    }





package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Duster";
        c1.modelo = "SUV";
        c1.ano = 2016;

        c2.nome = "Jac";
        c2.modelo = "J3";
        c2.ano = 2012;

        System.out.println("Carros");
        System.out.println("-------");
        System.out.println(c1.toString());
        System.out.println("-------");
        System.out.println(c2.toString());

    }
}

package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade=29;
        estudante.nome="Wandinha";
        estudante.sexo='F';



        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);//imprime o objeto

    }
}

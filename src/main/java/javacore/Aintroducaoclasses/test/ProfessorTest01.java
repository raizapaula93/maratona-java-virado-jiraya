package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {//De preferência, um propósito por classe
        Professor professor = new Professor();
        professor.nome = "Professor Linguiça";
        professor.idade=42;
        professor.sexo='M';

        System.out.println("Nome: "+ professor.nome +" idade: "+ professor.idade +" sexo: "+professor.sexo);

    }
}

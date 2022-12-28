package javacore.Gassociacao.execicio.teste;

import javacore.Gassociacao.execicio.dominio.Aluno;
import javacore.Gassociacao.execicio.dominio.LocalDoCurso;
import javacore.Gassociacao.execicio.dominio.Professor;
import javacore.Gassociacao.execicio.dominio.Seminario;

public class ExercicioAssociacao01 {
    public static void main(String[] args) {
        LocalDoCurso local = new LocalDoCurso("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}

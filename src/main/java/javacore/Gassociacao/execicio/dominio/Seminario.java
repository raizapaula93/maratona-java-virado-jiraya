package javacore.Gassociacao.execicio.dominio;

public class Seminario {

    private String titulo;

    private Aluno[] alunos;

    private LocalDoCurso localDoCurso;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, LocalDoCurso localDoCurso) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.localDoCurso = localDoCurso;
    }


    public LocalDoCurso getLocalDoCurso() {
        return localDoCurso;
    }

    public void setLocalDoCurso(LocalDoCurso localDoCurso) {
        this.localDoCurso = localDoCurso;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}

package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();//a referência original cntinua aqui
        Estudante estudante02 = new Estudante();//dá pra fazer infinitas referências ao msm objeto
        //a variável de referência é o controle remoto,(instância da linha 8 e 9)
        //mas quem executa é sempre o objeto
        //variável de referência manda um sinal e o objeto executa
        //this é sobre os atributos do p´roprio objeto q estao sendo executados a partir do controle remoto

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';



    }
}

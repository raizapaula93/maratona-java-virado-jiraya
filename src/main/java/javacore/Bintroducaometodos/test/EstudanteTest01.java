package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();//a referência original cntinua aqui
        Estudante estudante02 = new Estudante();//dá pra fazer infinitas referências ao msm objeto
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);//Estudante, vc vai fazer referência
        // para o msm objeto q estudante01 faz refrência

        impressoraEstudante.imprime(estudante02);//Estudante, vc vai fazer referência
        // para o msm objeto q estudante02 faz refrência

        //Qdo vc passa objetos como argumento na vdd vc passa
        //a Referência (onde aquele objeto está guardado)

        System.out.println("########################");

        impressoraEstudante.imprime(estudante01); //como n perdeu os objs em memória, e a função alterou o estado do obj
        //a alteraçã de estado do obj permanece qdo se faz uma nova referência ao msm obj
        //dica: ao invés de alterar os dados q vc está passando no obj se precisar fazer algum tipo de alteração
        //vc cria uma copia do obj, retorna com estado alterado
        impressoraEstudante.imprime(estudante02);
    }
}

package javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("________________________");
        System.out.println(this.nome);//a variável de referência vai mandar o sinal para o obj executar
        System.out.println(this.idade);//e o obj vai executar os atributos q estao referenciados dele com o this
        System.out.println(this.sexo);
    }
}

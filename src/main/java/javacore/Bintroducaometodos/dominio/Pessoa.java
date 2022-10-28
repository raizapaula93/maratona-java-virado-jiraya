package javacore.Bintroducaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);//variável idempotente, sem necessidade de colocar get
        System.out.println(this.idade);//variável idempotente, sem necessidade de colocar get
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade<0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

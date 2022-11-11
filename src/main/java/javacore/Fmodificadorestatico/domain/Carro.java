package javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
    //Modificador de acesso estático vai fazer o atributo pertencer à classe,
    //não sendo necessário variável de referência para acesso do atributo
    //quando for alterado este atributo, isto afeta todos os objetos derivados dessa classe
    //se voce aletra uma instância, na verdade vc altera pra todos
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
     }
}

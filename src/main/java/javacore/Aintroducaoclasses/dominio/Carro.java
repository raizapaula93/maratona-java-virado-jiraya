package javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    @Override
    public String toString() {
        return "Carro{" +
                "Nome:'" + nome + '\'' +
                ", Modelo:'" + modelo + '\'' +
                ", Ano:" + ano +
                '}';
    }
}

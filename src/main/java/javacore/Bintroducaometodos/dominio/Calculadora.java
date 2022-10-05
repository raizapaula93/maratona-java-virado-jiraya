package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){//esta linha é um contrato
        System.out.println(num1*num2);//execução do contrato
    }
}

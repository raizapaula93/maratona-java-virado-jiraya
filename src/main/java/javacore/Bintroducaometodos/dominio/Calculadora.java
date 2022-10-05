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

    public double divideDoisNumeros(int num1, int num2){
        if(num2 ==0){
            return 0;//funciona como um break neste caso
        }

        return num1/num2;//o retorno de um método é como se vc tivesse iniciando uma variável com aquele atributo
    }
}

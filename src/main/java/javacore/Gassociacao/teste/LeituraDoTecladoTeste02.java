package javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tarot SIm Ou NÃO");
        System.out.println("Digite sua pegunta que eu responderei SIM Ou NÃO");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == 'A'||pergunta.charAt(0) == 'E'||pergunta.charAt(0) == 'I'||pergunta.charAt(0) == 'O'
                ||pergunta.charAt(0) == 'U'||pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }

    }
}

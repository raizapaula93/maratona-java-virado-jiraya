package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Raiza");
        nomes.add("DevDojo academy");

        for(String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("De Paula");
        System.out.println("--------------------");
        for(int i = 0; i <nomes.size();i++) {
            System.out.println(nomes.get(i));
        }

    }
}

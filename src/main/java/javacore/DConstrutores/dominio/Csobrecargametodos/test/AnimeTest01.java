package javacore.DConstrutores.dominio.Csobrecargametodos.test;

import javacore.DConstrutores.dominio.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12,"Ação");
        anime.imprime();
        //Sobrecarga de métodos -> método com mesmo nome, mas nº de params e/ou tipo de params diferentes
    }
}

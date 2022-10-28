package javacore.DConstrutores.test;


import javacore.DConstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV",12,"Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
        //Sobrecarga de métodos -> método com mesmo nome,
        //mas nº de params e/ou tipo de params diferentes
    }
}

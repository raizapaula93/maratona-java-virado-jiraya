package javacore.Csobrecargametodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;

    private String genero;


    public void init(String nome,String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //Sobrecarga de métodos -> método com mesmo nome, mas nº de params e/ou tipo de params diferentes
    public void init(String nome, String tipo, int episodios, String ação){
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}

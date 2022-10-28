package javacore.DConstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    private String estudio;

    //Mesmo quando não fazemos um construtor explícito, o java faz um construtor pra vc
    //Porque para dar origem à uma classe, é necessário um construtor

    public Anime(String nome,String tipo, int episodios,String genero){//a vantagem do construtor é q ele te força a seguir algumas regras
        this();//ao chamar outro construtor, ele obrigatoriamente precisa estar na 1ª linha
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    //Sobrecarga de métodos -> método com mesmo nome, mas nº de params e/ou tipo de params diferentes
    public Anime(String nome,String tipo, int episodios,String genero, String estudio){
        this(nome,tipo,episodios,genero);//n da pra utilizar essa sintaxe fora de construtores
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    /*
            public Anime () {   Construtor padrão, que o Java cria automaticamente no momento da compilação, caso eu não adicione um construtor

            }
      */
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); //Chamando o construtor padrão abaixo, dentro de um outro construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, estudio); //Chamando o construtor acima, dentro deste construtor. Sobrecarga de construtorees
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumento");
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) { //Aqui é demonstrado uma sobrecarga de métodos, que é o mesmo método, com o mesmo nome
        this.init(nome, tipo, episodios);                                                      // Mas com assinatura diferente e quantidade de parâmetros ou tipo de parâmetros diferentes
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }
}

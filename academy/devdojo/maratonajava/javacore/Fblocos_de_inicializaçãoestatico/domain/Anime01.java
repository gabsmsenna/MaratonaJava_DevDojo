package academy.devdojo.maratonajava.javacore.Fblocos_de_inicializaçãoestatico.domain;

public class Anime01 {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 = Alocando espaço em memória para o objeto
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o quer
    // 3 - Bloco de inicialização é executado
    // 4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i +1;
        }
    }

    public Anime01(String nome) { this.nome = nome;}

    public Anime01() {
        for (int episodio:
             Anime01.episodios) { // Quando se trabalha com atributos estáticos, não se usa this."nome do atributo/variável", se usa o nome da classe
            System.out.print(episodio +" ");
        }
        System.out.println();
    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}

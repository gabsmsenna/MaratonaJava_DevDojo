package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //Uma variavel final é NECESSÁRIA de atribuir um valor a ela
    //Constantes no Java devem ser escritas da seguinte forma acima, em UPPER CASE

    public final Comprador COMPRADOR = new Comprador();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

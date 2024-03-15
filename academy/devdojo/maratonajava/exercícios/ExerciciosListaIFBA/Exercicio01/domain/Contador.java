package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio01.domain;

public class Contador {
    private int valor;
    private int valorAIncrementar;

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public Contador(int valor, int valorAIncrementar) {
        this.valor = valor;
        this.valorAIncrementar = valorAIncrementar;
    }

    public void zerar() {
        valor = 0;
    }


    public void incrementar() {
        double valorIncrementado = valor + valorAIncrementar;
    }


    public int obterValor() {
        return valor;
    }


}

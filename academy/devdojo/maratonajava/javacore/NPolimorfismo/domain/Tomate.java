package academy.devdojo.maratonajava.javacore.NPolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.10;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaPorcentagemImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}

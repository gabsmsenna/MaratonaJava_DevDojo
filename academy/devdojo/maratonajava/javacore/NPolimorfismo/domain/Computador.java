package academy.devdojo.maratonajava.javacore.NPolimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaPorcentagemImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }




}

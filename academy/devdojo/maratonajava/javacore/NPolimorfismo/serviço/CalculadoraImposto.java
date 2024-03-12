package academy.devdojo.maratonajava.javacore.NPolimorfismo.serviço;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.domain.Tomate;

public class CalculadoraImposto { //ESTA FOI UMA CLASSE DE SERVIÇO, PARA OBTER A REGRA DE NEGOCIO

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador: ");
        double valorImposto = computador.calculaPorcentagemImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + valorImposto);

    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate: ");
        double valorImposto = tomate.calculaPorcentagemImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + valorImposto);

    }

}

package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10", 11000);
        Tomate tomate = new Tomate("Italiano", 10);
        Televisao televisao = new Televisao("Samsung QLED", 3000);

        CalculadoraImposto.calcularImposto(computador); //se o metodo é estático, não é necessário criar o objeto para implementa-lo
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}

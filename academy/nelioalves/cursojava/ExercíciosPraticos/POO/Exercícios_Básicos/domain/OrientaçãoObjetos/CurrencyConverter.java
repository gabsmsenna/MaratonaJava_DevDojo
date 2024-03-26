package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.OrientaçãoObjetos;

public abstract class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double calculaValorPagoEmDolar(double quantidadeDolars, double valorDolar) {
        return quantidadeDolars * valorDolar * (1.0 + IOF);
    }
}

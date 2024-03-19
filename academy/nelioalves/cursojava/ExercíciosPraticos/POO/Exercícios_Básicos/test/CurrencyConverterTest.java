package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.test;

import academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverterTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dolar?");
        double valorDolar = sc.nextDouble();
        System.out.println("Quantos dolars você deseja comprar?");
        double quantidadeDolars = sc.nextDouble();
        double resultado = CurrencyConverter.calculaValorPagoEmDolar(valorDolar, quantidadeDolars);
        System.out.println("Quantidade a ser paga em reais: " + resultado);

    }
}

package academy.nelioalves.cursojava.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double maiorValor;
        int posicaoMaior;


        System.out.println("Quantos números você vai digitar?");
        int cont = scanner.nextInt();
        double[] numbersVector = new double[cont];

        for (int i = 0; i < cont; i++) {
            System.out.println("Digite um número: ");
            numbersVector[i] = scanner.nextDouble();
        }

        maiorValor = numbersVector[0];
        posicaoMaior = 0;

        for (int i = 1; i < cont ; i++) {
            if (numbersVector[i] > maiorValor) {
                maiorValor = numbersVector[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição no vetor do maior valor: " + posicaoMaior);

        scanner.close();
    }
}

package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int cont = scanner.nextInt();

        int[] vectorA = new int[cont];
        int[] vectorB = new int[cont];
        int[] vectorC = new int[cont];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Digite os valores de A: ");
            vectorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Digite os valores de B:");
            vectorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < cont; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        for (int i = 0; i < vectorC.length; i++) {
            System.out.println("VETOR RESULTANTE");
            System.out.println(vectorC[i]);
        }

        scanner.close();
    }
}

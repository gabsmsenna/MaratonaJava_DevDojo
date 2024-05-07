package academy.nelioalves.cursojava.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int cont = scanner.nextInt();

        int[] numerosVector = new int[cont];

        for (int i = 0; i < cont; i++) {
            System.out.println("Digite um número: ");
            numerosVector[i] = scanner.nextInt();
        }
        int[] numerosPares = new int[cont];
        int quantidadePares = 0;

        System.out.println("---NUMEROS PARES--");
        for (int i = 0; i < cont; i++) {
            if (numerosVector[i] % 2 == 0) {
                numerosPares[i] = numerosVector[i];
                System.out.printf("%d  ", numerosPares[i]);
                quantidadePares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + quantidadePares);
        scanner.close();
    }
}

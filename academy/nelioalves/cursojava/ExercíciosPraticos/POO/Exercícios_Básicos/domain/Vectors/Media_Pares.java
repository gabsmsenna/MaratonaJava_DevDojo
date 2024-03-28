package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos terá o vetor?");
        int cont = scanner.nextInt();

        int[] vectorPrincipal = new int[cont];
        int somaPares = 0;
        int quantidadePares = 0;
        double mediaPares;

        for (int i = 0; i < vectorPrincipal.length; i++) {
            System.out.println("Digite um número:");
            vectorPrincipal[i] = scanner.nextInt();
        }


        for (int i = 0; i < vectorPrincipal.length; i++) {
            if (vectorPrincipal[i] % 2 == 0) {
                somaPares += vectorPrincipal[i];
                quantidadePares++;
            }
        }
        if (somaPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = somaPares / quantidadePares;
            System.out.println("MEDIA DOS PARES: " + mediaPares);
        }





        scanner.close();
    }
}

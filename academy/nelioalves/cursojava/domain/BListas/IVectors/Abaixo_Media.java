package academy.nelioalves.cursojava.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int cont = scanner.nextInt();

        double[] vector = new double[cont];
        double somaVetor = 0;
        double mediaVetor = 0;
        double[] elementosAbaixoMedia = new double[cont];

        for (int i = 0; i < cont; i++) {
            System.out.println("Digite um número:");
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < cont; i++) {
            somaVetor += vector[i];
        }

        mediaVetor = somaVetor / cont;

        for (int i = 0; i < elementosAbaixoMedia.length; i++) {
            if (vector[i] < mediaVetor) {
                elementosAbaixoMedia[i] = vector[i];
            }
        }

        System.out.printf("MEDIA DO VETOR: %.2f%n", mediaVetor);

        for (int i = 0; i < elementosAbaixoMedia.length; i++) {
            System.out.println("ELEMENTOS ABAIXO DA MÉDIA");
            System.out.println(elementosAbaixoMedia[i]);
        }


        scanner.close();
    }
}

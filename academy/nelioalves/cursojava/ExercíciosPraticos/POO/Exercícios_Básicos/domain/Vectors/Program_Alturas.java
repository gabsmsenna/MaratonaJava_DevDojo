package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Program_Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int quantiaNumeros = scanner.nextInt();

        String[] nome = new String[quantiaNumeros];
        int[] idades = new int[quantiaNumeros];
        double[] alturas = new double[quantiaNumeros];

        for (int i = 0; i < quantiaNumeros; i++) {
            int contador = i + 1;
            System.out.println("Dados da " + contador + " pessoa:");
            System.out.println("Nome: ");
            nome[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.println("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double somaAlturas = 0;

        for (int i = 0; i < quantiaNumeros; i++) {
            somaAlturas += alturas[i];
        }
        double mediaAlturas = somaAlturas / quantiaNumeros;

        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        double porcentagemIdadesMenor16 = 0;

        int idadesMenor16 = 0;
        for (int i = 0; i < quantiaNumeros; i++) {
            if (idades[i] < 16) {
                idadesMenor16 += 1;
                porcentagemIdadesMenor16 = (double) (idadesMenor16 * 100) / quantiaNumeros;
            }
        }


        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemIdadesMenor16);

        for (int i = 0; i < quantiaNumeros; i++) {
            if (idades[i] < 16) {
                System.out.println(nome[i]);
            }
        }






        



        scanner.close();
    }
}

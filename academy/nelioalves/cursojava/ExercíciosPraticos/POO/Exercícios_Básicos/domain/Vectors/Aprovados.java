package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados");
        int cont = scanner.nextInt();

        String[] nomes = new String[cont];
        double[] primeiraNota = new double[cont];
        double[] segundaNota = new double[cont];
        double[] somaNotas = new double[cont];
        double[] mediaNotas = new double[cont];


        for (int i = 0; i < cont; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " +(i+1)+"° aluno:");
            scanner.nextLine();
            nomes[i] = scanner.nextLine();
            primeiraNota[i] = scanner.nextDouble();
            segundaNota[i] = scanner.nextDouble();
        }

        for (int i = 0; i < cont; i++) {
            somaNotas[i] = primeiraNota[i] + segundaNota[i];
            mediaNotas[i] = somaNotas[i] / 2;
        }

        for (int i = 0; i < cont; i++) {
            if (mediaNotas[i] >= 6){
                System.out.println("Aluno aprovado: " + nomes[i]);
            }
        }

        scanner.close();
    }
}

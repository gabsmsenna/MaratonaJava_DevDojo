package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Mais_Velho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int cont = scanner.nextInt();

        String[] nomes = new String[cont];
        int[] idades = new int[cont];
        int maiorIdade = 0;
        String nomeMaisVelha = "";


        for (int i = 0; i < cont; i++) {
            System.out.println("Dados da " + (i+1) + "pessoa");
            System.out.println("Nome: ");
            nomes[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
        }

        for (int i = 0; i < cont; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                nomeMaisVelha = nomes[i];
            }
           
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelha);


        scanner.close();
    }
}

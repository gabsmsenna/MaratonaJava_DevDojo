package academy.nelioalves.cursojava.domain.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Program_Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you insert?");
        int numbers = scanner.nextInt();
        int[] numbersVector = new int[numbers];
        
        for (int i = 0; i < numbers; i++) {
            System.out.println("Digite um numero");
            numbersVector[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbersVector.length; i++) {
            if (numbersVector[i ] < 0) {
                System.out.println(numbersVector[i] + " É NEGATIVO");
            }
        }

        scanner.close();
    }
}

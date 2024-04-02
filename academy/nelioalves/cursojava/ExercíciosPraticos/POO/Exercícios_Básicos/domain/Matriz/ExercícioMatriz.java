package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Matriz;

import java.util.Scanner;

public class ExercícioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and columns the matrix will have?");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Type the numbers for the matrix");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMain diagonal: ");
        for (int i = 0; i < matrix.length ; i++) {
            System.out.print(matrix[i][i] + " " );
        }
        System.out.println();

        int countNegative = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    countNegative++;
                }
            }
        }
        System.out.println("Amount of negative numbers: " + countNegative);
        sc.close();
    }
}

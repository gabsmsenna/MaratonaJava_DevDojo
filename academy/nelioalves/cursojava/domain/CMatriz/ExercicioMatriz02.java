package academy.nelioalves.cursojava.domain.Matriz;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Type 2 integer numbers, to build the matrix: ");
        System.out.println("Numbers of rows");
        int firstNumber = sc.nextInt();
        System.out.println("Numbers of columns");
        int secondNumber = sc.nextInt();
        int[][] matrix = new int[firstNumber][secondNumber];

        System.out.println("Filling the matrix with random numbers");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomNumber = random.nextInt(50);
                matrix[i][j] = randomNumber;
            }
        }

        // novo comm
        // ent para testes

        System.out.println("\n See the representation of your matrix below");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Type a number, which is in the matrix");
        int number = sc.nextInt();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == number) {
                    System.out.println("[Row " + i + " Column " + j + "] is the position of " + number);

                    //Searching for a number ahead
                    if (i > 0) {
                        System.out.println("Number ahead of " + number + ": " + matrix[i - 1][j]);
                    } else {
                        System.out.println("Does not exist a number ahead of this number.");
                    }

                    // Searching for a number below
                    if (i > 0) {
                        System.out.println("Number below of " + number + ": " + matrix[i + 1][j]);
                    }

                    // Searching for a number on left
                    if (j > 0) {
                        System.out.println("Number on right of " + number + ": " + matrix[i][j + 1]);
                    }

                    if (j > 0) {
                        System.out.println("Number on left of " + number + ": " + matrix[i][j -1]);
                    }
                }



            }
        }
        
        sc.close();
    }
}

package academy.nelioalves.cursojava.test;

import academy.nelioalves.cursojava.domain.Vectors.ProdutoProgram;

import java.util.Locale;
import java.util.Scanner;

public class ProdutosProgramTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the quantity of the products");
        int n = scanner.nextInt();

        ProdutoProgram[] vector = new ProdutoProgram[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Type the price of the products");
            double price = scanner.nextInt();
            System.out.println("Type the name of the products");
            String name = scanner.next();
            vector[i] = new ProdutoProgram(name, price);
        }

        double sumProducts = 0.0;
        for (int i = 0; i < n; i++) {
            sumProducts += vector[i].getPrice();
        }

        double averagePrice = sumProducts / n;

        System.out.printf("Average products price: %.2f%n", averagePrice);

        scanner.close();
    }
}

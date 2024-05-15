package academy.nelioalves.cursojava.domain.NGenerics.program;

import academy.nelioalves.cursojava.domain.NGenerics.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.println("How many values?");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            int value = sc.nextInt();
            printService.addValue(value);
        }

        printService.print();
        Integer x = printService.first();
        System.out.println("First: " + x );
        sc.close();
    }
}

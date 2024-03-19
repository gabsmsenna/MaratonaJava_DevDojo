package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.test;

import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--TESTE BANCO--");
        System.out.println("Enter account number: ");
        int numConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        String nomeTitular = sc.nextLine();
        System.out.println("Is there na initial deposit? (Y/N)");
        boolean existeDepositoInicial = sc.nextBoolean();


    }
}

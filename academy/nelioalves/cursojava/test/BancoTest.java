package academy.nelioalves.cursojava.test;

import academy.nelioalves.cursojava.domain.OrientaçãoObjetos.Conta;

import java.util.Scanner;

public class BancoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("--TESTE BANCO--");
        System.out.println("Enter account number: ");
        int numConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        String nomeTitular = sc.next();
        System.out.println("Is there a initial deposit? (y/n)");
        char isDeposit = sc.next().charAt(0);

        if (isDeposit == 'y') {
            System.out.println("Digite o valor de seu depósito inicial");
            double saldoInicial = sc.nextDouble();
            conta = new Conta(numConta, nomeTitular, saldoInicial);
        } else {
            conta = new Conta(numConta, nomeTitular);
        }

        System.out.println("----Dados da conta----");
        System.out.println(conta);

        System.out.println("Quanto deseja deposita?");
        double valorDeposito = sc.nextDouble();
        conta.deposita(valorDeposito);
        System.out.println("---- CONTA ATUALIZADA ----");
        System.out.println(conta);

        System.out.println("Quanto deseja sacar?");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("---- CONTA ATUALIZADA ----");
        System.out.println(conta);



        sc.close();

    }
}

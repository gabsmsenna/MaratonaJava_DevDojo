package academy.devdojo.maratonajava.javacore.Gassosiação.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome =input.nextLine();
        System.out.println("------------------------");
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("------------------------");
        System.out.println("Digite M OU F para seu sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }


}

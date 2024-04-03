package academy.nelioalves.cursojava.test;

import academy.nelioalves.cursojava.domain.OrientaçãoObjetos.Retangulo;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retângulo");
        retangulo.width = sc.nextDouble();

        System.out.println("Digite a base do retângulo");
        retangulo.height = sc.nextDouble();

        System.out.println("Imprimindo a área do retângulo: " + retangulo.calculoArea());
        System.out.println("Imprimindo o perímetro deste retângulo: " + retangulo.calculoPerimetro());
        System.out.println("Imprimindo a diagonal deste retângulo: " + retangulo.calculoDiagonal());


    }


}

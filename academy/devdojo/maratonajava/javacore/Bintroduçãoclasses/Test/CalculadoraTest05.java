package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        System.out.println("************************");
        calculadora.somaVarArgs(2,4,6,8,10);
    }
}

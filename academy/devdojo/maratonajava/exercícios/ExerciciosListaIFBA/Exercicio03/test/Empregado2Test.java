package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.test;

import academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.domain.Empregado2;

public class Empregado2Test {
    public static void main(String[] args) {
        Empregado2 empregado2 = new Empregado2("Gabriel", "Senna", 8000);
        Empregado2 empregado21 = new Empregado2("Daniel", "Massa", 3000);

        // Exibindo o salário anual de cada empregado
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " +
                empregado2.salarioAnual());
        System.out.println("Salário anual de " + empregado21.getNome() + " " + empregado21.getSobrenome() + ": " +
                empregado21.salarioAnual());

        // Aumentando o salário de cada empregado em 10%
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 0.1);
        empregado21.setSalarioMensal(empregado21.getSalarioMensal() * 0.1);

        // Exibindo o salário anual após o aumento
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " +
                empregado2.salarioAnual());
        System.out.println("Salário anual de " + empregado21.getNome() + " " + empregado21.getSobrenome() + ": " +
                empregado21.salarioAnual());
    }
}

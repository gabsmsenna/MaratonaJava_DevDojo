package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.test;

import academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.OrientaçãoObjetos.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Nome do funcionário ");
        funcionario.employeeName = sc.next();
        System.out.println("Salário bruto");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Taxa de imposto");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Quanto de bônus será aumentado o salário?");
        double porcentagem = sc.nextDouble();
        funcionario.increaseSalary(porcentagem);

        System.out.println(funcionario);







    }
}

package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.OrientaçãoObjetos;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.serviço.CalculadoraImposto;

public class Employee {
    public String employeeName;
    public double grossSalary;
    public double tax;

    public double calculaSalarioImposto() {
        return (grossSalary - tax);
    }

    public void increaseSalary(double porcentagem) {
        grossSalary = grossSalary + grossSalary * porcentagem / 100;
    }

    @Override
    public String toString() {
        return employeeName + ", $ " + calculaSalarioImposto();
    }
}

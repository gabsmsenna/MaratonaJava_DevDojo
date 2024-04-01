package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Listas.test;

import academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Listas.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionários serão registrados?");
        int quantiaFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantiaFuncionarios; i++) {
            System.out.println("Employee #"+(i+1));
            System.out.println("ID: ");
            Integer id = scanner.nextInt();

            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.println("Salary: ");
            Double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalaryIncrease = scanner.nextInt();




        scanner.close();
    }
}

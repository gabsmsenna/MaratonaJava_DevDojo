package academy.nelioalves.cursojava.domain.Listas.test;

import academy.nelioalves.cursojava.domain.Listas.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int quantiaFuncionarios = scanner.nextInt();
        System.out.println();

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
            System.out.println();
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalaryIncrease = scanner.nextInt();
        System.out.println();

        Integer pos = positionId(list, idSalaryIncrease);

        if (pos == null) {
            System.out.println("This ID were not found on the cache of the application");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = scanner.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp: list) {
            System.out.println(emp);
        }


        scanner.close();
    }
    // MÉTODO PARA PROCURA E VERIFICAÇÃO SE O ID EXISTE NA LISTA
    static Integer positionId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

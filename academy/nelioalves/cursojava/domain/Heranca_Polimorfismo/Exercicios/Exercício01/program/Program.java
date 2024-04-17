package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício01.program;

import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício01.entities.Employee;
import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício01.entities.OutsourcedEmployee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int numberOfEmployees = sc.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsorced (y/n) ?");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (response == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENT: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        sc.close();
    }
}

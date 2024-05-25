package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.TStream.application.Ex002.application;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.TStream.application.Ex002.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados (nome, email e salário)
        de funcionários a partir de um arquivo em formato .csv.

        Em seguida mostrar, em ordem alfabética, o email dos funcionários
        cujo salário seja superior a a um dado valor fornecido pelo usuário.

        Mostrar também a soma dos salários dos funcionários cujo
        nome começa com a letra `M`.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> listEmployees = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                listEmployees.add(new Employee (fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emailSalaryBelow = listEmployees.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + salary);
            emailSalaryBelow.forEach(System.out::println);

            double sumOfSalaryThatNameStartWithM = listEmployees.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .mapToDouble(e -> e.getSalary())
                    .sum();

            System.out.printf("Sum of salaries that name starts with 'M': %.2f", sumOfSalaryThatNameStartWithM);

        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}

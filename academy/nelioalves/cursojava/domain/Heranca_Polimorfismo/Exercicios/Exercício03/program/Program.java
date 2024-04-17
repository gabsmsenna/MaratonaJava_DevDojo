package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.program;

import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.entities.JuristicPerson;
import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.entities.NaturalPerson;
import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = scan.nextInt();

        for (int i = 0; i < taxPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:") ;
            System.out.print("Individual or company (i/c)? ");
            char iOrCompany = scan.next().charAt(0);
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Anual income: ");
            double anualIncome = scan.nextDouble();

            if (iOrCompany == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                people.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            }

            if (iOrCompany == 'c') {
                System.out.println("Number of employees: ");
                int numOfEmployees = scan.nextInt();
                people.add(new JuristicPerson(name, anualIncome, numOfEmployees));
            }
        }

        System.out.println("TAXES PAID:");
        for (Person person : people) {
            System.out.println(person.getName() + " - $ " + person.taxesPaid());
        }

        scan.close();
    }
}

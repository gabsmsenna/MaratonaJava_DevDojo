package academy.nelioalves.cursojava.domain.Enumeração.Application;

import academy.nelioalves.cursojava.domain.Enumeração.Entitie.Enum.WorkerLevel;
import academy.nelioalves.cursojava.domain.Enumeração.Entities.Department;
import academy.nelioalves.cursojava.domain.Enumeração.Entities.Worker;

import java.util.Locale;
import java.util.Scanner;

public class Program_Worker {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter department's name:");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name:");
        String workerName = scan.nextLine();
        System.out.println("Level:");
        String workerLevel = scan.nextLine();
        System.out.println("Base salary:");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        scan.close();
    }
}

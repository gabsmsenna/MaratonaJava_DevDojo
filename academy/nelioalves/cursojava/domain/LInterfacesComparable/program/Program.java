package academy.nelioalves.cursojava.domain.LInterfacesComparable.program;

import academy.nelioalves.cursojava.domain.LInterfacesComparable.domain.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "/home/gabriel/Documents/My Stuff/Estudos_Java/arquivos/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] employee = employeeCsv.split(",");
                list.add(new Employee(employee[0], Double.parseDouble(employee[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list); //Uma forma de ordenar uma operação!
            for (Employee s : list) {
                System.out.println(s.getName() + ", " + s.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

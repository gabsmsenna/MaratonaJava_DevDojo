package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicio.program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicio.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set <LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String userName = fields[0];
                LocalDateTime moment = LocalDateTime.parse(fields[1], formatter);
                set.add(new LogEntry(userName, moment));

                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Ex002.program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Ex002.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<Candidate, Integer> map = new HashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] split = line.split(",");
                String nameCandidate = split[0];
                int amountOfVotes = Integer.parseInt(split[1]);


                Candidate candidate = new Candidate(nameCandidate);

                if (map.containsKey(candidate)) {
                    amountOfVotes += map.get(candidate);
                }
                map.put(candidate, amountOfVotes);
                line = br.readLine();
            }

            System.out.println("Candidates and their amount of votes");

            for (Candidate candidate : map.keySet()) {
                System.out.println(candidate + ": " + map.get(candidate));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

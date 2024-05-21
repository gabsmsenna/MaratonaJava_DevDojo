package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicios.ex2.program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicios.ex2.entities.*;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.PSet.Exercicios.ex2.entities.Math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Math> mathSet = new HashSet<>();
        Set<Portuguese> portugueseSet = new HashSet<>();
        Set<History> historySet = new HashSet<>();

        System.out.println("How many students for course Math?");
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int[] numberID = new int[]{sc.nextInt()};
            Course math = new Math(numberID);
            mathSet.add((Math) math);
        }

        System.out.println("How many students for course History?");
        int amount2 = sc.nextInt();
        for (int i = 0; i < amount2; i++) {
            int[] number = new int[]{sc.nextInt()};
            Course history = new History(number);
            historySet.add((History) history);

        }

        System.out.println("How many students for course Portuguese?");
        int amount3 = sc.nextInt();
        for (int i = 0; i < amount3; i++) {
            int[] number = new int[]{sc.nextInt()};
            Course portuguese = new Portuguese(number);
            portugueseSet.add((Portuguese) portuguese);
        }

        Set<Course> total = new HashSet<>(mathSet);
        total.addAll(portugueseSet);
        total.addAll(historySet);

        System.out.println("Total students: " + total.size());


        sc.close();
    }
}

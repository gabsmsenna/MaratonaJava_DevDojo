package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.TStream.application.Ex001.application;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.TStream.application.Ex001.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] split = line.split(",");
                list.add(new Product(split[0], Double.parseDouble(split[1])));
                line = br.readLine();
            }

            double average = list.stream()
                    .map(p -> p.getPrice()) //chamei o map pois a lista é de produtos, e eu quero apenas o preço
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", average));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> productsBelowAverage = list.stream()
                    .filter(p -> p.getPrice() < average)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            productsBelowAverage.forEach(System.out::println);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}

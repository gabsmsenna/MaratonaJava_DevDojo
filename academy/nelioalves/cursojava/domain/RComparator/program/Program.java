package academy.nelioalves.cursojava.domain.RComparator.program;

import academy.nelioalves.cursojava.domain.RComparator.entities.MyComparator;
import academy.nelioalves.cursojava.domain.RComparator.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product>  list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());


        // UTLIZANDOA EXPRESSÃO LAMBDA ACIMA, CONSEGUI ENXUTAR O CÓDIGO ABAIXO BASTANTE, SENDO ALGO
        // MENOS VERBOSO

//        Comparator<Product> comp = new Comparator<Product>() { //Implementação de uma classe anônima
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        list.sort(comp);
        // list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())) TAMBÉM É POSSÍVEL FAZER DESTA FORMA

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

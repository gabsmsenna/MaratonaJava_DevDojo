package academy.nelioalves.cursojava.domain.SFuncional.Function;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;
import academy.nelioalves.cursojava.domain.SFuncional.Function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        /*
        Fazer um programa que, a partir de uma lista de produtos,
        gere uma nova lista contendo os nomes dos produtos em caixa alta
         */

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //aplicando a cada elemento da lista, uma instância da classe UpperCaseName e retornando-a para uma lista

        names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        Function<Product, String> func = p -> p.getName().toUpperCase();

        names = list.stream().map(func).collect(Collectors.toList());

        names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
       


        names.forEach(System.out::println);

    }
}

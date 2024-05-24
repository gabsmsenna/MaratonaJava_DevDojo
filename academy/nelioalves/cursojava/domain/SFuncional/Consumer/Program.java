package academy.nelioalves.cursojava.domain.SFuncional.Consumer;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;
import academy.nelioalves.cursojava.domain.SFuncional.Consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        /*
        Fazer um progrma que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%
         */

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        list.forEach(new PriceUpdate());

        list.forEach(Product :: staticPriceUpdate);

        list.forEach(Product :: nonStaticPriceUpdate);

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

       list.forEach(System.out::println);

    }
}

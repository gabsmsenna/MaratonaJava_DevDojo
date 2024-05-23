package academy.nelioalves.cursojava.domain.SFuncional;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;
import academy.nelioalves.cursojava.domain.SFuncional.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        list.removeIf(new ProductPredicate()); // Chamada do método pela instanciação da classe

        list.removeIf(Product :: staticProductPredicate); //Method reference, estou fazendo uma chamada
        // direta para o método, através da classe, sem instanciação de um objeto para chamá-lo

        list.removeIf(Product :: nonStaticProductPredicate); //Method reference com método não static

        Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        list.removeIf(pred); // Chamada do método por expressão lambda declarada

        list.removeIf(p -> p.getPrice() >= 100.00); //Expressão lambda inline



        for (Product p : list) {
            System.out.println(p);
        }
    }
}

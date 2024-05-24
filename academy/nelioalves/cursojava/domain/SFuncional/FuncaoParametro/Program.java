package academy.nelioalves.cursojava.domain.SFuncional.FuncaoParametro;

import academy.nelioalves.cursojava.domain.RComparator.entities.Product;
import academy.nelioalves.cursojava.domain.SFuncional.FuncaoParametro.Services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum2 = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        double sum3 = ps.filteredSum(list, p -> p.getPrice() < 100);

        System.out.println("Sum: " + String.format("%.2f", sum));
        System.out.println("Sum of the products that start with 'M': " + String.format("%.2f", sum2));
        System.out.println("Products that are lower than 100': " + String.format("%.2f", sum3));


    }
}

package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício02.program;

import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício02.entities.ImportedProduct;
import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício02.entities.Product;
import academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício02.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scan.nextInt();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println();
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeOfProduct = scan.next().charAt(0);
            System.out.print("Name: ");
            String productName = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            Product product = null;
            if (typeOfProduct == 'c') {
                products.add(new Product(productName, price));
            } else if (typeOfProduct == 'i') {
                System.out.print("Custom fee: ");
                double customFee = scan.nextDouble();
                products.add(new ImportedProduct(productName, price, customFee));

            } else if (typeOfProduct == 'u') {
                System.out.print("Manufacture Date (DD/MM/YYYY): " );
                LocalDate manufactureDate = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern(("dd/MM/yyyy")));
                products.add(new UsedProduct(productName,price,manufactureDate));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        scan.close();
    }
}

package academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Application;

import academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Entities.Client;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Entities.Order;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Entities.OrderItem;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Entities.Product;
import academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Enum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program_Order {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("-------");
        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        String status = scan.next();
        System.out.print("How many items to this order?");
        int items = scan.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);


        OrderItem orderItem = null;
        for (int i = 0; i < items; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Product quantity: ");
            int productQuantity = scan.nextInt();

            orderItem = new OrderItem(
                    productQuantity, productPrice, new Product(productName, productPrice)
            );
            order.addItem(orderItem);
        }

        System.out.println();

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + sdf.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println(client);

        System.out.println("---------------------");

        System.out.println("ORDER ITEMS:");

        for (OrderItem item : order.getItems()) {
            System.out.println(item);
        }

        System.out.println("Total price: " + order.total());


        scan.close();
    }
}

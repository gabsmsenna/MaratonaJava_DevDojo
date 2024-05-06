package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.KInterfaces.program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.KInterfaces.model.entities.CarRental;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.KInterfaces.model.entities.Vehicle;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.KInterfaces.model.services.BrazilTaxService;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.KInterfaces.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class InterfacesExercico01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Devolução (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental car = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(car);

        System.out.println("---FATURA---");
        System.out.println("Pagamento básico: $" + String.format("%.2f", car.getInvoice().getBasicPayment())) ;
        System.out.println("Imposto: $" + String.format("%.2f", car.getInvoice().getTax()));
        System.out.println("Pagamento total: $" + String.format("%.2f", car.getInvoice().getTotalPayment()));

        sc.close();
    }
}

package academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.program;

import academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.entities.Contract;
import academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.entities.Installment;
import academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.services.ContractService;
import academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("-- Entre com os dados do contrato --");
        System.out.print("Número: ");
        int numeroContrato = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int numberInstallment = sc.nextInt();

        Contract contract = new Contract(contractValue, numeroContrato,date);

        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, numberInstallment);



        System.out.println(" -- PARCELAS -- ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

    }
}

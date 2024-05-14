package academy.nelioalves.cursojava.domain.MDefaultMethods.program;

import academy.nelioalves.cursojava.domain.MDefaultMethods.service.BrazilianInterestService;
import academy.nelioalves.cursojava.domain.MDefaultMethods.service.InterestService;
import academy.nelioalves.cursojava.domain.MDefaultMethods.service.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService bs = new USAInterestService(1.0);
        double payment = bs.payment(amount, months);

        System.out.println("Payment after " + months + " months");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}

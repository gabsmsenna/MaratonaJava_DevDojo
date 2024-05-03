package academy.nelioalves.cursojava.domain.Excessões.Application;

import academy.nelioalves.cursojava.domain.Excessões.Model.Entities.Account_ExercicioFixação;
import academy.nelioalves.cursojava.domain.Excessões.Model.Exceptions.DomainException_ExercicioFixação;

import java.util.Scanner;

public class Program_ExercicioFixação {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Holder: ");
        String holder = scan.next();
        System.out.print("Initial balance: ");
        double initialBalance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scan.nextDouble();

        Account_ExercicioFixação account = new Account_ExercicioFixação(initialBalance, holder, number, withdrawLimit);

        System.out.print("Enter amount for withraw: ");
        double amountWithdraw = scan.nextDouble();
        account.withdraw(amountWithdraw);
    }
    catch (DomainException_ExercicioFixação e) {
        System.out.println(e.getMessage());
    }



    scan.close();
    }
}

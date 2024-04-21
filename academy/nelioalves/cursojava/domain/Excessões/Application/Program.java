package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.Excessões.Application;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.Excessões.Model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkinDate = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkoutDate = sdf.parse(sc.next());

        if (!checkoutDate.after(checkinDate)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(number, checkinDate, checkoutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: "); System.out.println("Check-in date (dd/MM/yyyy): ");
            checkinDate = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkoutDate = sdf.parse(sc.next());


               String error = reservation.updateDates(checkinDate, checkoutDate);
               if (error != null) {
                   System.out.println(error);
            }
               else {
                   System.out.println("Reservation updated: " + reservation);
               }
        }


        sc.close();
    }
}

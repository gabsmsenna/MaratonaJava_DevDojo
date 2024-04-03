package academy.nelioalves.cursojava.test;

import academy.nelioalves.cursojava.domain.OrientaçãoObjetos.Rent_Domain;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rent_Domain[] vect = new Rent_Domain[10];

        System.out.println("Quantos quartos serão alugados?");
        int quantiaQuartos = scanner.nextInt();

        for (int i = 1; i < quantiaQuartos; i++) {
            System.out.println();
            System.out.println("Rent #" + +i+ ": ");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.next();
            System.out.println("Quarto: ");
            int numeroQuarto = scanner.nextInt();
            vect[numeroQuarto] = new Rent_Domain(name, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        
        scanner.close();
    }
}

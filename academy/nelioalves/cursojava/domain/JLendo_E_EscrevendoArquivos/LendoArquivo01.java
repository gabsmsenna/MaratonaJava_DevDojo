package academy.nelioalves.cursojava.domain.JLendo_E_EscrevendoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo01 {
    public static void main(String[] args) {
        Scanner scanner = null;
        File file = new File("/home/gabriel/Documents/My Stuff/Estudos_Java/testeleitura.txt");

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

package academy.nelioalves.cursojava.domain.JLendo_E_EscrevendoArquivos;

import java.io.File;
import java.util.Scanner;

public class FilePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());
        System.out.println("getName: " + path.getPath());

        sc.close();
    }
}

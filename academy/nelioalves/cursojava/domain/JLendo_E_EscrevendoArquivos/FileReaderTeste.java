package academy.nelioalves.cursojava.domain.JLendo_E_EscrevendoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste {
    public static void main(String[] args) {
        String path = "/home/gabriel/Documents/My Stuff/Estudos_Java/testeleitura.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package academy.nelioalves.cursojava.Lendo_E_EscrevendoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning" , "Good afternoon", "Good night"};
        String path = "/home/gabriel/Documents/My Stuff/Estudos_Java/testeescrita.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}

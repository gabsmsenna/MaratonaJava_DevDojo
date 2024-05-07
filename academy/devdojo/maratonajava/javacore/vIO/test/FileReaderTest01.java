package academy.devdojo.maratonajava.javacore.vIO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/gabriel/Documents/My Stuff/Estudos_Java/Projeto_JAVA/arquivos/filewriter.txt");
         try (FileReader fr = new FileReader(file)) {
//             char[] in = new char[30];
//             fr.read(in);
//             for (char c : in) {
//                 System.out.print(c);
//             }
             int i;
             while ((i=fr.read()) != -1) {
                 System.out.print((char) i);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}

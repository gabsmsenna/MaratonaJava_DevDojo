package academy.devdojo.maratonajava.javacore.vIO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/gabriel/Documents/My Stuff/Estudos_Java/Projeto_JAVA/arquivos/filewriter.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("Teste de escrita com file writer");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package academy.devdojo.maratonajava.javacore.vIO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/gabriel/Documents/My Stuff/Estudos_Java/Projeto_JAVA/arquivos/bufferedwriter.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Teste de escrita com file writer");
            bw.newLine();
            bw.write("Teste de quebra de linha");
            bw.flush(); //SEMPRE DAR UM FLUSH ANTES DE FECHAR, LEMBRAR TAMBÉM DE FECHAR O RECURSO DO SISTEMA OPERACIONAL
            // IGUAL É FEITO COM O SCANNER, MAS INSERINDO O RECURSO COM O TRY WITH RESOURCES, ELE SERÁ FECHADO AUTOMATICAMENTE
            // DEPOIS DE FINALIZAR O MÉTODO TRY
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

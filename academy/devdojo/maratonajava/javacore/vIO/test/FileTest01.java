package academy.devdojo.maratonajava.javacore.vIO.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/gabriel/Documents/My Stuff/Estudos_Java/Projeto_JAVA/arquivos/file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
//            boolean exists = file.exists();
//            if (exists == true) {
//                System.out.println("Deleted "+file.delete());
//        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

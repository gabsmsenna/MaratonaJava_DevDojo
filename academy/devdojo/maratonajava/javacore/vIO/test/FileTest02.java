package academy.devdojo.maratonajava.javacore.vIO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);

        File fileFileDirectory = new File(fileDirectory, "file.txt");
        boolean isFileCreated = fileFileDirectory.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDirectory,"archive_renamed.txt");
        boolean isRenamed = fileFileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);

    }
}

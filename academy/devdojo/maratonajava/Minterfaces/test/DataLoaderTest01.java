package academy.devdojo.maratonajava.Minterfaces.test;

import academy.devdojo.maratonajava.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.maratonajava.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}

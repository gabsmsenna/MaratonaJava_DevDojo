package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load(); //todos os metodos em uma INTERFACE sao public e abstratct

    default void checkPermission() { //A partir do java 8 se tornou possivel inserir métodos concretos em interfaces
        System.out.println("Fazendo checagem de permissões");
    }


}

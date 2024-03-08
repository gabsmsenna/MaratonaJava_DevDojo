package academy.devdojo.maratonajava.Minterfaces.domain;

import academy.devdojo.maratonajava.Minterfaces.domain.DataLoader;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
}

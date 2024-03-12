package academy.devdojo.maratonajava.javacore.NPolimorfismo.serviço;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}

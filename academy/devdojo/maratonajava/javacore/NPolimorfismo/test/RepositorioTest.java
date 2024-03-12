package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.serviço.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        //Programando orientado a interfaces
        Repositorio repositorio= new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}

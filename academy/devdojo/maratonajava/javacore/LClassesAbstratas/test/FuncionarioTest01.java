package academy.devdojo.maratonajava.javacore.LClassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain.DEV;
import academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Luffy", 5000);
        System.out.println(gerente);

        DEV dev = new DEV("Sanji", 12000);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();
    }
}

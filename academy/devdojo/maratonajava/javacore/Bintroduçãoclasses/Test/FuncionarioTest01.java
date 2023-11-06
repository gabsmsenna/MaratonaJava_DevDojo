package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1500,1220,1352}; //Arrays sempre funcionam com atributos do tipo reference.

        funcionario.imprimeDados();
        funcionario.imprimeSalario();
        funcionario.imprimeMedia();
    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("999999-99");

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 4");
        endereco1.setCep("7777777777");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setCpf("9999999999");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Zoro"); //Herdado
        funcionario.setEndereco(endereco1); //Herdado
        funcionario.setCpf("8888888888"); //Herdado
        funcionario.setSalario(10.000); //Exclusivo da classe funcionario
        System.out.println("--------------------");
        funcionario.imprime();
    }
}

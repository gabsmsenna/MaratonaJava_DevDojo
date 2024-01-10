package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Yuji";
        pessoa.setNome("Yuji");
        pessoa.setIdade(15);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}

package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante Luffy = new Estudante();
        Luffy.nome = "Luffy";
        Luffy.idade = 19;
        Luffy.sexo = 'M';
        System.out.println(Luffy.nome);
        System.out.println(Luffy.idade);
        System.out.println(Luffy.sexo);
    }
}

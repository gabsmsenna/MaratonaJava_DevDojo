package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.domain.Estudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Zoro";
        estudante2.idade = 23;
        estudante2.sexo = 'M';

        estudante.imprime();
        estudante2.imprime();
    }
}

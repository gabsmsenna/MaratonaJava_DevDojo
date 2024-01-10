package academy.devdojo.maratonajava.javacore.Gassosiação.test;

import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor objProfessor = new Professor("Antonio");
        Professor objProfessor2 = new Professor("Carlos");
        Professor[] arrayDeProfessores = {objProfessor, objProfessor2};

        Escola objEscola = new Escola("Poli", arrayDeProfessores); //Realizei uma sobrecarga de construtor, escrevendo um novo construtor. Classe Escola, linha 11 a 14
        objEscola.imprime();

        //Exemplo de um código de associação unidirecional com relacionamento "MUITOS PARA UM"

    }
}

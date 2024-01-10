package academy.devdojo.maratonajava.exercícios;

import academy.devdojo.maratonajava.exercícios.domain.Aluno;
import academy.devdojo.maratonajava.exercícios.domain.Local;
import academy.devdojo.maratonajava.exercícios.domain.Professor;
import academy.devdojo.maratonajava.exercícios.domain.Seminario;

public class ExercicioAssociacaoTest01 {
    public static void main(String[] args) {
        Local objLocal = new Local ("Belo Horizonte");
        Aluno objAluno01 = new Aluno("Luffy", 19);
        Professor objProfessor01 = new Professor("Rayleigh", "Haki");
        Aluno[] alunosSeminario = {objAluno01}; //Criando um objeto array para ser instanciado no construtor abaixo
        Seminario objSeminario01 = new Seminario("Rei dos piratas", alunosSeminario, objLocal);
        Seminario[] seminariosDisponiveis = {objSeminario01};
        objProfessor01.setSeminarios(seminariosDisponiveis);

        objProfessor01.imprime();
    }
}

package academy.nelioalves.cursojava.test;

import academy.nelioalves.cursojava.domain.OrientaçãoObjetos.Aluno;

import java.util.Scanner;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.nomeAluno = sc.next();
        System.out.println("Digite as notas dos trimestres: ");
        aluno.notaPrimeiroTrimestre = sc.nextDouble();
        aluno.notaSegundoTrimestre = sc.nextDouble();
        aluno.notaTerceiroTrimestre = sc.nextDouble();

        if (aluno.finalGrade() >= 60.0) {
            System.out.println("FINAL GRADE: " + aluno.finalGrade());
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE: " + aluno.finalGrade());
            System.out.println("FAILED");
            System.out.println(aluno.calculoPontosFaltantes());
        }

        sc.close();
    }
}

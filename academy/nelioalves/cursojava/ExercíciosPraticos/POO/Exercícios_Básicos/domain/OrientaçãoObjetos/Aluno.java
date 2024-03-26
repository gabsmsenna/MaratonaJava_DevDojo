package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.OrientaçãoObjetos;

public class Aluno {
    public String nomeAluno;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double finalGrade() {
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public double calculoPontosFaltantes() {
        if (finalGrade() <= 60.0) {
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }



}

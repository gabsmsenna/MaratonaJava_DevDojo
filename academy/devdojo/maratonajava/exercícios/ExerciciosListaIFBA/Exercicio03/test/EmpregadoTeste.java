package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.test;

import academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.domain.Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Gabriel", "Senna", 8000);
        Empregado empregado2 = new Empregado("Daniel", "Simão", 3000);

        System.out.println("---Relatório de salário anual do funcionário---");
        empregado1.relatorioSalarioAnual();
        empregado2.relatorioSalarioAnual();

        System.out.println("----------------------------------------------------");
        System.out.println("Todos os funcionários receberam agora um bônus de 10%");

        empregado1.relatorioSalarioBonus();
        empregado2.relatorioSalarioBonus();

        System.out.println("----------------------------------------------------");
        System.out.println("Relatório de salário anual pós bônus");

        empregado1.relatorioSalarioAnualBonus();
        empregado2.relatorioSalarioAnualBonus();

    }
}

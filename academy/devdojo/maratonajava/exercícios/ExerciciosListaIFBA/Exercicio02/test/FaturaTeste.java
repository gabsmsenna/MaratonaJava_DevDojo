package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio02.test;

import academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio02.domain.Fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("0245", "Celular", 50, 4000);

        fatura.relatorioFatura();
    }
}

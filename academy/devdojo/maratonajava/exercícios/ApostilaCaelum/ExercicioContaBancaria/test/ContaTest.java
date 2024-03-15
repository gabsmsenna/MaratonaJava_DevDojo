package academy.devdojo.maratonajava.exercícios.ApostilaCaelum.ExercicioContaBancaria.test;

import academy.devdojo.maratonajava.exercícios.ApostilaCaelum.ExercicioContaBancaria.domain.Conta;
import academy.devdojo.maratonajava.exercícios.ApostilaCaelum.ExercicioContaBancaria.domain.Data;

public class ContaTest {
    public static void main(String[] args) {
        Conta c1 = new Conta("Gabriel", 01, "NU", 1000, new Data(31, 2,2010));

        System.out.println(c1.recuperaDadosParaImpressao());



    }
}

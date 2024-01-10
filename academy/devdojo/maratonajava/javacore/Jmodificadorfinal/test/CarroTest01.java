package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE); //Atributo estático é acessado apenas pela CLASSE
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Luffy");
        System.out.println(carro.COMPRADOR);
        //Pesquisar mais sobre singleton pattern
    }
}

package academy.devdojo.maratonajava.javacore.Gassosiação.test;

import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Vini Jr");

        //Jogador[] jogadoresArray = new Jogador[3];
        //Jogador[] jogadoresArray = new Jogador[]{jogador1}, {jogador2}, {jogador3};
        //Jogado[] jogadoresArray = {jogador1, jogador2, jogador3}
        // Todas as diferentes formas de se inicializar um array

        Jogador[] jogadoresArray = {jogador1, jogador2, jogador3}; //Array com os objetos

        for (Jogador jogadorIdentificaçãoForEach:
             jogadoresArray) {
            jogadorIdentificaçãoForEach.imprime();
        }
    }
}

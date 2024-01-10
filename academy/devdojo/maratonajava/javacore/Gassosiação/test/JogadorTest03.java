package academy.devdojo.maratonajava.javacore.Gassosiação.test;

import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador objJogador = new Jogador("Cafu");
        Time objTime = new Time("Brasil");
        Jogador[] arrayJogadores = {objJogador};

        objJogador.setTime(objTime);
        objTime.setJogadores(arrayJogadores);

        System.out.println("---Jogador---");
        objJogador.imprime();
        System.out.println("---Time---");
        objTime.imprime();
    }
}

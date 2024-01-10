package academy.devdojo.maratonajava.javacore.Gassosiação.test;

import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiação.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador objJogador = new Jogador("Pelé");

        Time objtime = new Time("Santos");

        objJogador.setTime(objtime);
        objJogador.imprime();
    }
}

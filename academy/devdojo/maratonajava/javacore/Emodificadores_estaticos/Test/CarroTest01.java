package academy.devdojo.maratonajava.javacore.Emodificadores_estaticos.Test;

import academy.devdojo.maratonajava.javacore.Emodificadores_estaticos.Domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedez", 275);
        Carro carro3 = new Carro("Audi", 290);



        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}

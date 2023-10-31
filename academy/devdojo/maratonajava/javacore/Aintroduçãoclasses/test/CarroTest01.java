package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Captur";
        carro1.modelo = "Ret";
        carro1.ano = 2020;

        carro2.nome = "Vectra";
        carro2.modelo = "Sedan";
        carro2.ano = 2015;

        System.out.print("Carro 1: ");
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano + " ");
        System.out.print("Carro 2: ");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano + " ");

    }
}

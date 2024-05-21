package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.OHashCode_Equals.Program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.OHashCode_Equals.Entities.Client;

public class Program {
    public static void main(String[] args) {

        Client client1 = new Client("John", "john@gmail.com");
        Client client2 = new Client("John", "john@gmail.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client1.equals(client2));

    }
}

package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap.Exercicio;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99778822");

        cookies.remove("email");
    }
}

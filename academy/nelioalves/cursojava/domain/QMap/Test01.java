package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.QMap;

import java.util.Map;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999998888");

        cookies.remove("email");
        cookies.put("phone", "92121-1212");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email : " + cookies.get("email"));
        System.out.println("Size : " + cookies.size());

        System.out.println("All cookies");
        for (String key :cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}

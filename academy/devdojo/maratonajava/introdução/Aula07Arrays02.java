package academy.devdojo.maratonajava.introdução;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Sanji";
        nomes[1] = "Luffy";
        nomes[2] = "Zoro";
        nomes[3] = "Nami";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

package academy.devdojo.maratonajava.javacore.Emodificadores_estaticos.Domain;

public class Deparment {
    public static int numberOfWorker = 0;
    public String name;

    public Deparment(String name) {
        this.name = name;
        numberOfWorker++; //incrementa a variável static toda vez quue um novo objeto da classe é criado
    }
}

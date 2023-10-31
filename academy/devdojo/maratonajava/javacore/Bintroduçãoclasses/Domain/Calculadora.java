package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }
    public void subtraDoisNumeros() {
        System.out.println(245-5);
    }

    public void multiplicaDoisNumeros (int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisNumeros (double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return; //O return aqui serve como um "else", um breakpoint pra parar a execução caso a condicional acima seja real
        }
        System.out.println(num1/num2);
    }
}

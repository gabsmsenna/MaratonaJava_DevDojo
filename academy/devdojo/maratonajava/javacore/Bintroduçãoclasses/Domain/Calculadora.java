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
        System.out.println(num1 / num2);
    }
      public void alteraDoisNumeros(int numero1, int numero2) {
            numero1 = 99;
            numero2 = 33;
          System.out.println("Dentro do altera dois números");
          System.out.println("Num1 = "+numero1);
          System.out.println("Num2 = "+numero2);
    }

    public void somaArray (int[] numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros) { //Aqui, na "varags" a JVM pega o que tiver dentro dessa variável números, e transforma em um array
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

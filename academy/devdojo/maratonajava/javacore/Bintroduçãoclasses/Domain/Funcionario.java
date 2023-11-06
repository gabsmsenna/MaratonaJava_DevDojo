package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: ");
    }

    public void imprimeSalario() {
        for(double salario: salarios) {
            System.out.println(salario);
        }
    }

    public void imprimeMedia() {
        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }
        media = media/salarios.length;
        System.out.println("Media salarial: "+media);
    }


}

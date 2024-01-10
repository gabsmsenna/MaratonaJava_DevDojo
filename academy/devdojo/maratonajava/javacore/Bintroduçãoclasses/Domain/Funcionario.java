package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.Domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) { //Poderia retirar esse método, para imprimir que a escrita desta variável. É uma lógica de negócio a se pensar
        this.media = media; //Para impedir que varíaveis importantes possam ser sobrescritas
    }

    public void imprimeDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }

    public void imprimeSalario() {
        for(double salario: salarios) {
            System.out.println(salario);
        }
    }

    public void imprimeMedia() {
        if (salarios == null) {
            System.out.println("Não existe salário para calcular média");
        }

        for(double salario: salarios) {
            media += salario;
        }
        media = media/salarios.length;

        System.out.println("Media salarial: "+media);
    }


}

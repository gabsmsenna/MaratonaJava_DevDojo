package academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain;

public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;
    protected double salarioBase;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.salarioBase = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    //Classes abstratas foram criandas para serem extendidas, para serem moldes de outras classes;
    //Classes abstratas não podem ser instanciadas, não se cria um objeto de uma classe abstrata;

    //Métodos abstratos não podem conter corpo, e só podem existir dentro de classes abstratas;

    // Desta forma, podemos ter a certeza absoluta de que toda classe que é uma "FUNCIONARIA", que extende da classe abstrata, terá
    // obrigatoriamente um método calculaBonus, pois ele é abstrato
}

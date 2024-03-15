package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.domain;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double calculaSalarioAnual() {
        return this.salarioMensal * 12;
    }

    public void relatorioSalarioAnual() {
        System.out.println("Salário anual do funcionário " + this.nome + ": " + calculaSalarioAnual());
    }

    public double calculaBonusSalario() {
        return (this.salarioMensal * 0.10) + salarioMensal;
    }

    public void relatorioSalarioBonus () {
        System.out.println("O funcionario " + this.nome + " recebeu um bônus salarial, agora sua renda mensal é de: " + calculaBonusSalario());
    }

    public double calculaSalarioAnualBonus() {
        return calculaBonusSalario() * 12;
    }

    public void relatorioSalarioAnualBonus() {
        System.out.println("Salario anual do funcionario " + this.nome + ": " + calculaSalarioAnualBonus());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}

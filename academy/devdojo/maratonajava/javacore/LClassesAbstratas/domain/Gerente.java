package academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.15;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario com bonus=" + salario +
                ", salario original=" + salarioBase +
                '}';
    }
}

//Se uma classe extende de uma classe, ou método abstrato é necessário prover uma implementação, que é o a sobrescrita do método

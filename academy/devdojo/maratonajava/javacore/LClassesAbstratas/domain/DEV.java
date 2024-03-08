package academy.devdojo.maratonajava.javacore.LClassesAbstratas.domain;

public class DEV extends Funcionario {

    public DEV(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "DEV{" +
                "nome='" + nome + '\'' +
                ", salario com bonus=" + salario +
                ", salario original=" + salarioBase +
                '}';
    }
}

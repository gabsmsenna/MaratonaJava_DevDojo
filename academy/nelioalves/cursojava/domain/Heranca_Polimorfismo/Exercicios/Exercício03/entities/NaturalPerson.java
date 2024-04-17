package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.entities;

public class NaturalPerson extends Person {
    private Double healthExpenditures;

    public NaturalPerson(String nome, Double rendaAnual, Double healthExpenditures) {
        super(nome, rendaAnual);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }



    @Override
    public Double taxesPaid() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}

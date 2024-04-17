package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exercício03.entities;

public class JuristicPerson extends Person{
    private Integer numberOfEmployees;

    public JuristicPerson(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double taxesPaid() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }

}

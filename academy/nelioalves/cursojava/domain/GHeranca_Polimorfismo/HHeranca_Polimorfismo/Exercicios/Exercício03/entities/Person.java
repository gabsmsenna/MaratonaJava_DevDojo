package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.GHeranca_Polimorfismo.HHeranca_Polimorfismo.Exercicios.Exercício03.entities;

public abstract class Person {
    private String name;
    private Double anualIncome;

    public abstract Double taxesPaid();

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}

package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.GHeranca_Polimorfismo.HHeranca_Polimorfismo.Exercicios.Exercício02.entities;

public class Product {
    private String name;
    private Double price;

    public String priceTag() {
        return name + " $ " + String.format("%.2f", price);
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

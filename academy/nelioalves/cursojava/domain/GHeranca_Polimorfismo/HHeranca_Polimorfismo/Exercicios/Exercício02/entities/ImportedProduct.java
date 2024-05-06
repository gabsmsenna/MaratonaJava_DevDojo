package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.GHeranca_Polimorfismo.HHeranca_Polimorfismo.Exercicios.Exercício02.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    @Override
    public String priceTag() {
        return super.priceTag() + "(Custom fee: " + customsFee + ")";
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    public ImportedProduct(String nome, double preco, Double customsFee) {
        super(nome, preco);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}

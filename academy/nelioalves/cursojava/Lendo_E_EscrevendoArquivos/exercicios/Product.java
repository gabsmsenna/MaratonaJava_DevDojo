package academy.nelioalves.cursojava.Lendo_E_EscrevendoArquivos.exercicios;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;

    public double totalPrice() {
        return price * quantity;
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

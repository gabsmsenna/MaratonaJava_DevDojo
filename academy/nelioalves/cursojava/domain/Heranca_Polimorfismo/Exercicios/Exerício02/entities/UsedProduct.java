package academy.nelioalves.cursojava.domain.Heranca_Polimorfismo.Exercicios.Exerício02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    @Override
    public String priceTag() {
        return this.getName() + " (used) " + this.getPrice() + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}

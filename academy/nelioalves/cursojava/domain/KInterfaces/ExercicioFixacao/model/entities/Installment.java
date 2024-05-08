package academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate date;
    private Double amount;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f ", amount);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

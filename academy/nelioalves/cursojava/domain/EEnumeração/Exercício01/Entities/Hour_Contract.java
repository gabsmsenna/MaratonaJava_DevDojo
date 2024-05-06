package academy.nelioalves.cursojava.domain.Enumeração.Exercício01.Entities;

import java.util.Date;

public class Hour_Contract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public Hour_Contract() {
    }

    public Hour_Contract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}

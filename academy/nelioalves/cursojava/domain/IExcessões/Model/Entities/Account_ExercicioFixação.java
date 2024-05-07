package academy.nelioalves.cursojava.domain.Excessões.Model.Entities;

import academy.nelioalves.cursojava.domain.Excessões.Model.Exceptions.DomainException_ExercicioFixação;

public class Account_ExercicioFixação {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws DomainException_ExercicioFixação {
        if (amount > withdrawLimit) {
            throw new DomainException_ExercicioFixação("WITHDRAW ERROR: The amount exceeds the withdraw limit");
        }

        if (amount > balance) {
            throw new DomainException_ExercicioFixação("WITHDRAW ERROR: Not enough balance");
        }

        this.balance -= amount;
        System.out.println("New balance: " + this.balance);
    }

    public Account_ExercicioFixação(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}

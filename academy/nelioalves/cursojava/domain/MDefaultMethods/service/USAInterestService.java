package academy.nelioalves.cursojava.domain.MDefaultMethods.service;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService {
    private Double interestRate;

    public USAInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double payment(double amount,int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        } else {
            return amount * Math.pow(1.0 + interestRate / 100.0, months);
        }
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}

package academy.nelioalves.cursojava.domain.MDefaultMethods.service;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService {
    private Double interestRate;

    public USAInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}

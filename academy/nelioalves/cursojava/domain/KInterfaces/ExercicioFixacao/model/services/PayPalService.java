package academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.services;

public class PayPalService implements PaymentService {
    @Override
    public double paymentFee(Double amount) {
        return amount += amount * 0.01;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return (amount * 0.01) * months;
    }
}

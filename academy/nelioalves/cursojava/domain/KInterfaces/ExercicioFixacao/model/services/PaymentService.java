package academy.nelioalves.cursojava.domain.KInterfaces.ExercicioFixacao.model.services;

public interface PaymentService {
    public double paymentFee(Double amount);
    public double interest(Double amount, Integer months);
}

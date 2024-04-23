package academy.nelioalves.cursojava.domain.Excessões.Model.Exceptions;

public class DomainException extends Exception {
    private static final long serialCersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}

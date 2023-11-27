package Reservas.exceptions;

public class DomainException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }


}

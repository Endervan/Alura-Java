package BancoSaques.Excepetions;

public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }
}

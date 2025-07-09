package br.com.cody.cm.excessao;

public class ExplosaoException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExplosaoException(String mensagem) {
        super(mensagem);
    }
}

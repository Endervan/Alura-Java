package db;

import java.io.Serial;

public class DBIntergrityException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;


    public DBIntergrityException(String msg) {
        super(msg);
    }

}

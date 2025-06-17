package Streams;

import java.util.function.UnaryOperator;

public interface Utilitarios {

    public static final UnaryOperator<String> maiuscula = String::toUpperCase;
    public static final UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";

    public   static String grito(String p) {
        return p + "!!!";
    }
}

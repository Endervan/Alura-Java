package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;
        List<String> marcas = Arrays.asList("Bmw", "Audi", "Honda");


        UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + "";


        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}

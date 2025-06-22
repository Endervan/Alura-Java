package Streams.Filter;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;
        List<String> tiposCliente = Arrays.asList("Comum", "Especial", "Premium");


        Predicate<String> AtentimentoPremium = p -> p.equals("Premium")  ;
        Predicate<String> AtentimentoEspecial = p ->p.equals("Especial") ;
        Predicate<String> AtentimentoComum = p ->  p.equals("Comum") ;


        tiposCliente.stream()
                .filter(AtentimentoPremium)
                .filter(AtentimentoEspecial)
                .forEach(print);
    }
}

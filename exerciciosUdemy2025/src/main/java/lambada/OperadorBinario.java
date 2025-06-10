package lambada;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;
        System.out.println(media.apply(9.0, 3.0));

        BiFunction<Double, Double, String> resultado =
                (x, y) -> ((x + y) / 2) > 7 ? "Aprovado Bi" : "Reprovado Bi";
        System.out.println(resultado.apply(9.0, 3.0));

        Function<Double, String> conceito = x -> x >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.0, 4.0));
    }
}

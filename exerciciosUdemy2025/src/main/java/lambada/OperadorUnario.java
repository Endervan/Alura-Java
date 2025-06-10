package lambada;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = x -> x + 2;
        UnaryOperator<Integer> vezesDois = x -> x * 2;
        UnaryOperator<Integer> aoQuadrado = x -> x * x;

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2));

        // compose seria pegando encadiamento ao contrario
        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(2));
    }
}

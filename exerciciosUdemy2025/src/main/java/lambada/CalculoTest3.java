package lambada;

import java.util.function.BinaryOperator;

public class CalculoTest3 {

    public static void main(String[] args) {

//        java nao permite conversão
//        int -> Double errado
//        double -> Double correto
        BinaryOperator<Double> calc = (x, y) -> x + y; // expressao lambda

        System.out.printf("somar = %.2f\n", calc.apply(10.0, 20.0));

        calc = (x, y) -> x * y; // expressao lambda

        System.out.printf("somar = %.2f\n", calc.apply(10.0, 20.0));
    }
}


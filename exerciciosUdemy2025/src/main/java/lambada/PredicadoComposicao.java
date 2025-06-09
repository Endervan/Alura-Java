package lambada;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = x -> x % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num > 100 & num <= 999;

        System.out.println(isPar.and(isTresDigitos).negate().test(103));
        System.out.println(isPar.and(isTresDigitos).test(103));
    }
}

package Streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestReduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> soma = Integer::sum;

        // reduce assim com forEach sao funcao terminadora nao dar usar um filter ou map dps delas
       Integer total =  nums.parallelStream().reduce(soma).get();
        System.out.println(total);

        // usando valor inicial deixar de ser Optional
       int valorInicial =  nums.stream().reduce(10,soma);
        System.out.println(valorInicial);

        // REsultado foi um Optional
        nums.stream()
                .filter(num -> num> 7)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}

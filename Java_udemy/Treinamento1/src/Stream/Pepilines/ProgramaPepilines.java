package Stream.Pepilines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramaPepilines {

    public static void main(String[] args) {

        // Pepiline : Operaçoes em streams retornando novas streams. possivel cria uma cadeia de operaçoes (flixo de processamento)

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));


        int sum = list.stream().reduce(0,(x,y) -> x+y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // somente pares
                .map(x -> x * 10) // do resultado de cima faz multiplicacao
                .toList(); // transforma lista novamente

        System.out.println(Arrays.toString(newList.toArray()));


    }
}

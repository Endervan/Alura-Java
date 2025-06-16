package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

//        1 forma de criar steam com metodo estatico
        Stream<String> stream = Stream.of("A", "B", "C", "D", "E", "F\n");
        stream.forEach(print);

        // 2 forma uso streams
        String[] array = {"Abel", "Bunbaca", "Carla", "Diel", "Ender", "Fabiola\n"};
        Stream.of(array).forEach(print);

        // 3 forma
        Arrays.stream(array).forEach(print);

        //
        System.out.println("usando subconjunto...");
        Arrays.stream(array, 1, 3).forEach(print);

        System.out.println("usando collections com streams...");
        List<String> stringLista = Arrays.asList("1", "2", "3\n");
        stringLista.stream().forEach(print);
        stringLista.parallelStream().forEach(print);

        System.out.println("usando arrays com streams metodo generation meto infinito");
//        Stream.generate(() -> "a").forEach(print); // nao ordernado
//        Stream.iterate(0, n-> n+1).forEach(print); // ordernado


    }
}

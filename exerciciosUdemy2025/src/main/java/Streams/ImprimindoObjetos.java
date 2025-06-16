package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "ana");
        System.out.println("Usando o Foreach");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nUsando Iterator...");

        Iterator<String> interator = aprovados.iterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }

        System.out.println("\nUsando stream...");

        Stream<String> stream = aprovados.stream();
       stream.forEach(System.out::println);
    }
}

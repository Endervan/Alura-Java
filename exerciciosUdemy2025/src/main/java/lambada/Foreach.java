package lambada;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "val", "lo", "gil");

        System.out.println("Forma Tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("Lambada versao 1");
        aprovados.forEach(nome -> System.out.println(nome + " !!!!!"));

        System.out.println();

        System.out.println("Lambada versao 2 - metod reference");
        aprovados.forEach(System.out::println);

    }
}

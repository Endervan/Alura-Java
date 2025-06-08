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

        System.out.println("Lambada versao 2 - uso static");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println();

        System.out.println("Lambada versao 3 - metod reference");
        aprovados.forEach(System.out::println);

        System.out.println("Lambada versao 4 - uso reference com static");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("OI meu nome e " + nome);
    }
}

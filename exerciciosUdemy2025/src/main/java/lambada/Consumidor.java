package lambada;

import org.example.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!!");
        Produto p1 = new Produto("caneta", 12.34, 0.99);
        imprimir.accept(p1);
        Produto p2 = new Produto("notebbok", 1012.34, 0.99);
        Produto p3 = new Produto("borracha", 0.45, 0.99);
        Produto p4 = new Produto("lapis", 2.34, 0.99);
        Produto p5 = new Produto("caneta preta", 6.25, 0.99);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(System.out::println);
    }
}

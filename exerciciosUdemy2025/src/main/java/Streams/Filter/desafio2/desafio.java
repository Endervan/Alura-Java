package Streams.Filter.desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class desafio {

    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 6.00, 0.35, 0);
        Produto p2 = new Produto("Borracha", 10.00, 0.10, 2.00);
        Produto p3 = new Produto("Relogio", 1654.00, 0.14, 0);
        Produto p4 = new Produto("Carderno", 24.10, 0.4, 3.05);
        Produto p5 = new Produto("Notebook ", 1224.10, 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        Predicate<Produto> desconto = d -> d.getDesconto() >= 0.30;
        Predicate<Produto> freteGratis = f -> f.getValorFrete() == 0;
        Predicate<Produto> ProdutoRelevante = p -> p.getPreco() >= 500;

        Function<Produto, String> ProdutoDestaques =
                p -> "Aproveite " + p.getNome() + " esta em promocao  de R$ " + p.getPreco() + " Por  R$ " + p.getDescontoProduto(p.getDesconto());


        produtos.stream()
                .filter(desconto)
                .filter(freteGratis)
                .map(ProdutoDestaques)
                .forEach(System.out::println);


    }
}

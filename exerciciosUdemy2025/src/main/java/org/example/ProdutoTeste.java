package org.example;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        p1.preco = 4321.0;
        p1.desconto = 0.25;


        var p2 = new Produto("Caneta Preta");
        p2.preco = 12.0;
        p2.desconto = 1.25;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDescontoGerente(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;


        System.out.printf("media do Carrinho = R$%.2f", mediaCarrinho);


    }
}
package Streams.Filter.desafio2;

public class Produto {
    private final String nome;
    private final double preco;
    private final double desconto;
    private final double valorFrete;

    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public double getDescontoProduto(double desconto) {
        return preco - (preco * desconto);
    }
}

package org.example;

public class Produto {

    public String nome;
    public double preco;
    public double desconto;


    public Produto() {
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    Produto(String nomeInicial) {
        this.nome = nomeInicial;
    }

    double precoComDesconto() {
        return preco * (1 - this.desconto);
    }

    double precoComDescontoGerente(double descontoDoGerente) {
        return preco * (1 - this.desconto + descontoDoGerente);
    }

    @Override
    public String toString() {
        double PrecoFinal = precoComDesconto();
        return  nome +  ", tem preco final com desconto de " + PrecoFinal ;
    }
}

package Iniciante;

public class TestaCarro {
    public static void main(String[] args) {
        // criando Objeto tenha 2 construtores na classe Carro
        Carro carro = new Carro(2017,"GTI",45000);

        System.out.println(carro.getAno() + carro.getModelo() + carro.getPreco());
    }
}

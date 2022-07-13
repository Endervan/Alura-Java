package Iniciante;

public class Carro {
    private int ano;
    private String modelo;
    private double preco;

    public Carro(int ano, String modelo, double preco) {
        if (ano >= 1891) {
            this.ano = ano;
        } else {
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
        }

        if (modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
        }

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não é válido. Por isso usaremos 40000.0!");
            this.preco = 40000.0;
        }
    }

    //Novo construtor AQUI!
    public Carro(String modelo, double preco) {
     // No Java podemos chamar a implementação de um construtor através de outro usando simplesmente this( ) com os parâmetros exigidos pelo construtor.
        this(2017, modelo, preco);
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
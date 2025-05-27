package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade Atual: " + velocidadeAtual + " km/h";
    }
}

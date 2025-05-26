package oo.heranca.desafio;

public class Ferrari extends Carro {

    // esta sobreescrevendo da class pai
    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }


}

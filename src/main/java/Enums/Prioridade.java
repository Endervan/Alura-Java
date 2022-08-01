package Enums;

// enums e tipo classe
public enum Prioridade {

    //    enum nao pode ser instanciando pensa tivesse construtor private
    MIN(1), NORMAL(5), MAX(10);

    private int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

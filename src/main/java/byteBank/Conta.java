package byteBank;

public class Conta {
    // atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

    // o que  conta faz Metodos

    // void nao devolve resultado apena fazer ação
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Não existe saldo suficiente ");
        return false;

    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        System.out.println("Não existe saldo suficiente ");
        return false;

    }

}

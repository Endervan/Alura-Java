package byteBankAcess;

public class Conta {
    // atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; // static quer dizer e atributo da classe ex:

    public Conta(int agencia, int numero) { // routina de especializacão default
        Conta.total++; // ou total++ somar toda vez q cria uma conta
//        System.out.println("o total de conta criada ate momento e "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
//        System.out.println("estou criando uma conta " + this.agencia + "  com numero " + this.numero);
    }

    // conta faz Metodos

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

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode Valor menor ou igual a 0");
            return; // para a execução
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode Valor menor ou igual a 0");
            return; // para a execução
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static  int getTotal() { // instancia da classes nao usa this
//    public int getTotal() {
        return Conta.total;
    }
}

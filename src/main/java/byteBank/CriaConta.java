package byteBank;

public class CriaConta {

    public static void main(String[] args) {
        // primeiraConta e instancia ou objeto da classe Conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Saldo primeira conta ==  "+primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("Saldo primeira conta dps que recebeu transferencia 100 reais ===" + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        System.out.println("Saldo segunda conta  ==  "+segundaConta.saldo);
    }
}

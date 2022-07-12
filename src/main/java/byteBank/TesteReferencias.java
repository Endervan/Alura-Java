package byteBank;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira Conta : " + primeiraConta.saldo);

        System.out.println("saldo da segunda conta esta referenciando msm objeto da primeira conta " + primeiraConta.saldo);
    }
}

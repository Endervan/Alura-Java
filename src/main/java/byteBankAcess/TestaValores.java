package byteBankAcess;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1, 60250);
        Conta conta1 = new Conta(2, 50555);
        Conta conta2 = new Conta(3, 45000);

        //  static e compartilhado nao importa qual conta chama

        System.out.println("total de conta criada " + Conta.getTotal()); // usando metodo static getTotal
        //   System.out.println("total de conta criada " + conta.getTotal()); // sem usar static getTotal

        System.out.println(conta.getSaldo());
    }
}

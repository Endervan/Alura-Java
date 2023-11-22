package Heranca;

import Heranca.Conta.Account;
import Heranca.Conta.SavingsAccount;

public class TestprogramPolimorfismo {
    public static void main(String[] args) {

        Account x = new Account(1001, "Ender", 1000.0);
        Account y = new SavingsAccount(1001, "Ender", 1000.0,0.1);

        // polimorfismo variavel tipo Acount com instaciacion diferentes (corportamento diferentes)

        x.withdraw(200.0);
        y.withdraw(200.0);

        System.out.println("saldo atual conta x :"+ x.getBalance());
        System.out.println("saldo atual conta y :"+ y.getBalance());


    }
}

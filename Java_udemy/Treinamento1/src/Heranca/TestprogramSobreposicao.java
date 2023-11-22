package Heranca;

import Heranca.Conta.Account;
import Heranca.Conta.BusinessAccount;
import Heranca.Conta.SavingsAccount;

public class TestprogramSobreposicao {
    public static void main(String[] args) {

        // usando sobreposicao (conta poupaca na cobra saque)  taxa 5,00
        Account acc1 = new Account(1001, "Ender", 1000.0);
        acc1.withdraw(200.0);

        System.out.println("saldo atual conta acc1 :"+acc1.getBalance());


        // usando sobreposicao (conta poupaca na cobra saque) sem taxa
        Account acc2 = new SavingsAccount(1001, "Maria", 1000.0,0.1);
        acc2.withdraw(200.0);
        System.out.println("saldo atual conta acc2(poupaça) :"+acc2.getBalance());

        // usando Super (conta Empresarial na cobra saque) taxa 5 + 2
        Account acc3 = new BusinessAccount(1001, "Jose", 1000.0,0.1);
        acc3.withdraw(200.0);
        System.out.println("saldo atual conta acc2(Empresarial) :"+acc3.getBalance());

    }
}

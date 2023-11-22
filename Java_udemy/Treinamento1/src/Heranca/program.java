package Heranca;

import Heranca.Conta.Account;
import Heranca.Conta.BusinessAccount;
import Heranca.Conta.SavingsAccount;

public class program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Ender", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Manu", 0.0, 500.0);


        // UPCASTING => CONVERTE CLASS PARA SUPERCLASS
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 100.0);

        // DOWNCASTING => CONVERTE SUPERCLASS PARA CLASS
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // testando instanceOf
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            System.out.println("Update");
        }

    }
}

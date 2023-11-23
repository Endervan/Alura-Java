package ClassAbstratc;

import ClassAbstratc.Conta.Account;
import ClassAbstratc.Conta.BusinessAccount;
import ClassAbstratc.Conta.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {

//        Account acc1 = new Account(1001, "Ender", 1000.0);
//        Account acc2 = new SavingsAccount(1002, "Manuela", 1000.0,0.01);
//        Account acc3 = new BusinessAccount(1003, "Louise", 1000.0,500.0);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1002, "Manuela", 1000.0,0.01));
        list.add(new BusinessAccount(1003, "Louise", 1000.0,400.0));
        list.add(new SavingsAccount(1004, "Ender", 500.0,0.06));
        list.add(new BusinessAccount(1003, "Valeria", 300.0,500.0));


        double sum = 0.0;

        for (Account acc:list){
            sum += acc.getBalance();
        }

        System.out.println("Total de todas a contas: = " + sum);

        for (Account acc:list){
            acc.deposite(10.0);
        }

        for (Account acc:list){
            System.out.println("saldo de  cada  contas dps deposito de 10 reais em cada  = " + acc.getBalance());
        }













    }
}

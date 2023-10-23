package Banco.Contas.entity;

import java.util.Locale;
import java.util.Scanner;

public class Transacoes_conta {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // ponto com separador de decimais
        Scanner sc = new Scanner(System.in);

        Account account;
        System.out.print("Entre com seu numero da conta = ");
        int number = sc.nextInt();

        System.out.print("Entre com a sua conta holder = ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Tei Deposito iniciAL (y/n) ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Digite o valor inicial ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else account = new Account(number, holder);

        System.out.println();
        System.out.print("Dados da conta ");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter com valor de deposito");
        double depositeValue = sc.nextDouble();
        account.deposit(depositeValue);
        System.out.print("Valor Saldo Atualizado para = " +  account);

        System.out.println();
        System.out.print("Enter com valor de saque = ");
        double saqueValue = sc.nextDouble();
        account.withdram(saqueValue);
        System.out.println("Valor Saldo Atualizado para depois do saque = " +  account);

        sc.close();
    }


}
package BancoSaques;

import BancoSaques.Excepetions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Informa Dados da conta ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de Saque: ");
        double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withdrawLimit);
        System.out.println();
        System.out.print("Informe uma quantia para saque: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();


    }
}

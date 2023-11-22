package Pagamentos;

import Pagamentos.Funcionarios.Employee;
import Pagamentos.Funcionarios.Tercerizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Quantidade de Funcionarios : ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario # " + i);
            System.out.print(" Funcionario e Tercerizado(y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Hours : ");
            int hours = sc.nextInt();
            System.out.print("Valor por Hours : ");
            double valuePerHours = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Adiciona a Taxa Adicional: ");
                double additionalCharge = sc.nextDouble();
                list.add(new Tercerizados(name, hours, valuePerHours, additionalCharge));

            } else list.add(new Employee(name, hours, valuePerHours));

            System.out.print("");
            System.out.println("Pagamentos");

            for (Employee emp : list) {
                System.out.println(emp.getName() + " Receber : $ " + String.format("%.2f", emp.payment()));
            }


        }


        sc.close();

    }
}

package Generics;

import Generics.Services.Exemplo1Service;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Exemplo1Service<Integer> ps = new Exemplo1Service<>();


        System.out.print("How many to values? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);

        }
        ps.print();
        System.out.println("First: " + ps.first());


    }
}

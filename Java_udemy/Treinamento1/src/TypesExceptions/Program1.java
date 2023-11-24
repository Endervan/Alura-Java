package TypesExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        methodo2();
        System.out.println("Fim Programa");


    }

    public static void methodo2() {
        System.out.println("Methodo2 Start");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice n encontrado");
        } catch (InputMismatchException e) {
            System.out.println("So permitido numeros");
        }

        sc.close();

        System.out.println("Methodo2 end");

    }
}



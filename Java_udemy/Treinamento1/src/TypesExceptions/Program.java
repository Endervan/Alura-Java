package TypesExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
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


        System.out.println("Fim Programa");

        sc.close();
    }
}

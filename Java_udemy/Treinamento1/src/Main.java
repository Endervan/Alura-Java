import Util.Calculation;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // metodo 1 Circumferencia , Volume e PI Value
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // qnd membros da classe n sao estatico e obrigatorio instancia

        System.out.print("Entre com seu Radius ");
        double radius = sc.nextDouble();

        double c = Calculation.circuferencia(radius);
        double v = Calculation.volume(radius);

        System.out.printf("Circumferencia : %.2f%n", c);
        System.out.printf("Volume : %.2f%n", v);
        System.out.printf("PI Value : %.2f%n", Calculation.PI);

        sc.close();
    }


}
import Util.CurrentyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ValoresPagosEmReais {


    public static void main(String[] args) {

        // metodo 1 Circumferencia , Volume e PI Value
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // qnd membros da classe n sao estatico e obrigatorio instancia

        System.out.print("Qual Valor Dollares == ");
        double dollares = sc.nextDouble();

        System.out.print("Quantos dollares Gostaria de converter  == ");
        double valor = sc.nextDouble();

        double v = CurrentyConverter.Coversao(dollares,valor);

        System.out.printf("Valor |Pago em Reais =  : %.2f%n", v);

        sc.close();
    }



}
package MetodosAbstract;

import MetodosAbstract.Entites.Circle;
import MetodosAbstract.Entites.Retargulo;
import MetodosAbstract.Entites.Sharpe;
import MetodosAbstract.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Sharpe> list = new ArrayList<>();

        System.out.print("Entre com numeros de figuras: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("|Figura #" + i);
            System.out.print("Figura e Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color(BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Largura : ");
                double largura = sc.nextDouble();
                System.out.print("Altura : ");
                double altura = sc.nextDouble();
                list.add(new Retargulo(color, altura, largura));

            } else {
                System.out.print("Qual Radius : ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Resultados areas das figuras ");

        for (Sharpe sharpe : list) {
            System.out.println(String.format("%.2f",sharpe.area()));
        }

        sc.close();
    }
}

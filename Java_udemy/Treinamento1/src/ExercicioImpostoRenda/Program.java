package ExercicioImpostoRenda;

import ExercicioImpostoRenda.Tipos.Company;
import ExercicioImpostoRenda.Tipos.IndividuaL;
import ExercicioImpostoRenda.Tipos.TaxPager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com numeros de contribuites: ");
        int n = sc.nextInt();

        List<TaxPager> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("taxa  #: " + i);
            System.out.print("Individual or Company  (i/j) : ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Renda Anual: ");
            Double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Gasto com saude: ");
                Double he = sc.nextDouble();
                list.add(new IndividuaL(name, anualIncome, he));
            } else {
                System.out.print("Numeros de Funcionarios: ");
                Integer funcionarios = sc.nextInt();
                list.add(new Company(name, anualIncome, funcionarios));
            }
        }

        System.out.println();
        System.out.println("Taxas Pagamentos");

        for (TaxPager tx : list) {
            System.out.println(tx.getName() + " : $ " + String.format("%.2f", tx.tax()));
        }

        double soma = 0.0;
        for (TaxPager tx : list) {
            soma += tx.tax();
        }

        System.out.println("Total Inmposto a paga  : $ " + String.format("%.2f", soma));


        sc.close();
    }
}

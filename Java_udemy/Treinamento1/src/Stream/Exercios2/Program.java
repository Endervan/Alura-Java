package Stream.Exercios2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path : ");
        String path = sc.nextLine();

        System.out.print("Enter Salary : ");
        Double salary = sc.nextDouble();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Funcionario> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }


            System.out.println("Email of people salary is more than : " + salary);


            List<String> email = list.stream()
                    .filter(m -> m.getSalary() > salary)
                    .map(Funcionario::getEmail)
                    .toList();
            email.forEach(System.out::println);

            System.out.print("Enter with letra nome  : ");
            char criterio = sc.next().charAt(0);

            Double sum = list.stream()
                    .filter(a -> a.getName().charAt(0) == criterio)
                    .map(Funcionario::getSalary)
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum salary of people name starts with " + criterio + " : " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }


        sc.close();

    }
}

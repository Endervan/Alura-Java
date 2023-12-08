package Stream.Exercios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path : ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // pegando media
            Double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Average Price: " + avg);

            Comparator<String> comp = (s1,s2) ->s1.toUpperCase().compareTo(s2.toUpperCase());

            // pegando media
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p->p.getName())
                    .sorted(comp.reversed()) // ordenacao
                    .toList();

            names.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }


        sc.close();

    }
}

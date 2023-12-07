package InterfacesFuncionais.Function;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));


        // 1º solução->  Function
        // List<String> names = list.stream().map(new UppercaseName()).toList();


        // 2º solução-> Referencia Metodo com metodo estatico
        //List<String> names = list.stream().map(Product::staticProductFunction).toList();

        // 3º solução-> Referencia Metodo com metodo Nao estatico
        //List<String> names = list.stream().map(Product::NonstaticProductFunction).toList();

        // 4º solução-> Lambad Declarada
        //Function<Product, String> pred = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(pred).toList();


        // 5º solução-> Lambad inline
         List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();


        names.forEach(System.out::println);


    }
}

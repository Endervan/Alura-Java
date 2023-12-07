package InterfacesFuncionais.Predicate;


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


        // 1º solução->  predicate
        //  list.removeIf(new ProductPredicate());

        // 2º solução-> Referencia Metodo com metodo estatico
        // list.removeIf(Product::staticProductPredicate);

        // 3º solução-> Referencia Metodo com metodo Nao estatico
        // list.removeIf(Product::NonstaticProductPredicate);

        // 4º solução-> Lambad Declarada
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);


        // 5º solução-> Lambad inline
        list.removeIf(p -> p.getPrice() >= 100.0);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}

package InterfacesFuncionais.Consumer;

import InterfacesFuncionais.Consumer.Entities.Product;

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


        // 1º metodo : classe implement consumer
        //list.forEach(new ProductConsumer());

        // 2º metodo : Reference metodo statico
        //list.forEach(Product::staticPriceUpdate);

        // 3º metodo : Reference metodo nao statico
        //list.forEach(Product::NonstaticPriceUpdate);

        // 4º metodo : Lambad declarada
        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        //list.forEach(cons);

        // 4º metodo : Lambad inline
        list.forEach (p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}

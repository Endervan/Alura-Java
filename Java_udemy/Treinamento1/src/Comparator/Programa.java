package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {
    // 4º metodo
    public static int compareProducts(Product p1 , Product p2){
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

    public static void main(String[] args) {




        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // usando class anonima compartor 1º
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        // usando lambad 2º
        Comparator<Product> comp1 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());



//       list.sort(new MyComparator());
//        list.sort(comp);
//        list.sort(comp1);

        // 3º metodo
//        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


 // 4º metodo
        list.sort(Programa::compareProducts);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

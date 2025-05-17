package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
//       Set<String> set = new HashSet<>(); // não garanti a ordem
       SortedSet<String> set = new TreeSet<>(); //  garanti a ordem alfabetica
        set.add("BRIANCA");
        set.add("DANIELA");
        set.add("CECILIA");
        set.add("CARLOS");
        set.add("ANA");


       for (String s : set) {
           System.out.println(s);
       }
    }
}

package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        // HashSet =>Mais Rapido e nao ordernado (Tabela Hash)
        // TreeSet => Mais Lento com CompareTo(ordenar automaticamento a lista)
        // LinkedHashSet => intermediario (elementos ordem de inserção)

//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

//        set.remove("TV");
//        set.removeIf(x->x.length() >= 3);

        System.out.println(set.contains("Notebook")); // contains => verificar se existi


        for (String p:set){
            System.out.println(p);
        }

    }
}

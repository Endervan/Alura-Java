package Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        // interface n pode ser instanciada (usa class ArrayList , LinkedList etc..
        List<String> list = new ArrayList<>();


        list.add("Ana");
        list.add("Ender");
        list.add("Maria");
        list.add("Moiseis");
        list.add("Louise");

        System.out.println("lista Original " + list);

        list.add(2, "Valeria");
        System.out.println("lista Original add valeria posicao 2 array " + list);

//        list.remove(0);
//        list.remove("Louise");
//        System.out.println("lista Original com remocao Ana e Louise do  array " + list);
//

        list.removeIf(x -> x.charAt(0) == 'A');
        System.out.println("lista Original com remocao Ana  com Lampada Predicate " + list);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("achando indice Ender pelo indice " + list.indexOf("Ender"));
        System.out.println("achando indice Louise pelo indice " + list.indexOf("Louise"));

        System.out.println("-----------------------lista comeca com M------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').toList();

        for(String x : result) System.out.println("Lista somente nome comecando por M  " + x);


        System.out.println("-----------------------lista pega 1 ocorrencia com M------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println(" a 1 ocorrencia  por M da lista " + name);


    }
}

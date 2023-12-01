package Generics;

import java.util.Arrays;
import java.util.List;

public class Exemplo2GenericCoringa {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5,2,3);
        printList(myInts);

        List<String> myStrings = Arrays.asList("maria","joao","bob");
        printList(myStrings);

    }

    public static void printList(List<?> list) {
        // nao e possivel adiciobar dados numa lista tipo coringa ex: list.add(3) erro compilacao
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

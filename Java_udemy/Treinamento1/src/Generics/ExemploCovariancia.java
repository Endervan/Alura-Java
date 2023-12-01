package Generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploCovariancia {

    public static void main(String[] args) {

        // Covariancia qnd pode fazer get e nao pode fazer put
        // ex: get - ok  /// put - error

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List< ? extends Number> list  = intList;
        // get - 0k
        Number x = list.get(0);
        System.out.println(x);

        // put - erro
//        list.add(20);

    }
}
